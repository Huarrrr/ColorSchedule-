package top.huar.schedule.ui.adapter

import android.annotation.SuppressLint
import android.app.Activity
import android.content.res.ColorStateList
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.NonNull
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.AppCompatButton
import cn.wolfspider.autowraplinelayout.AutoWrapLineLayout
import com.google.android.material.checkbox.MaterialCheckBox
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.jaygoo.widget.OnRangeChangedListener
import com.jaygoo.widget.RangeSeekBar
import org.greenrobot.eventbus.EventBus
import top.huar.schedule.R
import top.huar.schedule.common.App
import top.huar.schedule.common.ConstantPool
import top.huar.schedule.entity.ClassSchedule
import top.huar.schedule.entity.ClassScheduleDao
import top.huar.schedule.entity.EventEntity
import top.huar.schedule.util.ClassScheduleUtils
import top.huar.schedule.util.ThemeChangeUtil
import java.util.*


/**
 * 每节课长按监听
 */
class ClassScheduleItemLongClickListener
constructor(@param:NonNull private val activity: Activity, private val classScheduleList: List<ClassSchedule>?, @param:NonNull private val copyList: MutableList<String>) : View.OnLongClickListener {
    private val classScheduleDao: ClassScheduleDao = (activity.application as App).daoSession.classScheduleDao
    @SuppressLint("InflateParams")
    private val inflate: View = LayoutInflater.from(activity).inflate(R.layout.dialog_class_schedule, null)
    private var selectClassSchedule: ClassSchedule? = null
    private lateinit var alertDialog: AlertDialog
    private lateinit var copyBtn: AppCompatButton
    private lateinit var pasteBtn: AppCompatButton
    private lateinit var oddBtn: AppCompatButton
    private lateinit var doubleBtn: AppCompatButton
    private lateinit var allBtn: AppCompatButton
    private lateinit var clearBtn: AppCompatButton
    private lateinit var rangeBtn: AppCompatButton
    private lateinit var autoWrapLineLayout: AutoWrapLineLayout

    init {
        initAlertDialog()
    }

    override fun onLongClick(v: View): Boolean {
        Log.d(TAG, "onLongClick:the view instance is $v")
        val tag = v.tag
        Log.d(TAG, "onLongClick:the view tag is " + tag!!)
        val totalWeek = App.sharedPreferences.getInt(ConstantPool.Str.TOTAL_WEEK.get(), 25)
        for (i in 0 until totalWeek) {
            val materialCheckBox = autoWrapLineLayout.getChildAt(i) as MaterialCheckBox
            materialCheckBox.isChecked = false
        }
        val classSplit = tag.toString().split("-".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val tvteacher = inflate.findViewById<TextInputEditText>(R.id.tv_teacher)
        val tvlocation = inflate.findViewById<TextInputEditText>(R.id.tv_location)
        val tvname = inflate.findViewById<TextInputEditText>(R.id.tv_name)
        val tlname = inflate.findViewById<TextInputLayout>(R.id.tl_name)
        val tllocation = inflate.findViewById<TextInputLayout>(R.id.tl_location)
        val tlteacher = inflate.findViewById<TextInputLayout>(R.id.tl_teacher)
        //设置内容文字
        setText(tvteacher, tvlocation, tvname, classSplit)
        alertDialog.setTitle(StringBuilder(7).append("星期").append(classSplit[1]).append("第").append(classSplit[0]).append("节课"))
        alertDialog.show()
        alertDialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener {
            var isUnChecked = true
            for (i in 0 until totalWeek) {
                val materialCheckBox = autoWrapLineLayout.getChildAt(i) as MaterialCheckBox
                if (materialCheckBox.isChecked) {
                    isUnChecked = false
                    break
                }
            }
            if (isUnChecked) {
                Toast.makeText(activity, "请设置课程周数", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (isInputError(tvteacher, tvlocation, tvname, tlname, tllocation, tlteacher)) {
                return@setOnClickListener
            }
            if (selectClassSchedule != null) {
                updateData(tvteacher, tvlocation, tvname)
            } else {
                insertData(classSplit, tvteacher, tvlocation, tvname)
            }
            alertDialog.dismiss()
            EventBus.getDefault().post(EventEntity(ConstantPool.Int.REFRESH_CLASS_SCHEDULE_FRAGMENT))
        }
        return true
    }

    private fun isInputError(tvteacher: TextInputEditText, tvlocation: TextInputEditText, tvname: TextInputEditText, tlname: TextInputLayout, tllocation: TextInputLayout, tlteacher: TextInputLayout): Boolean {
        tlname.error = null
        tllocation.error = null
        tlteacher.error = null
        if ("" == tvname.text.toString()) {
            tlname.error = "请输入课程名"
            return true
        }
        if ("" == tvlocation.text.toString()) {
            tllocation.error = "请输入地点"
            return true
        }
        if ("" == tvteacher.text.toString()) {
            tlteacher.error = "请输入教师"
            return true
        }
        return false
    }

    private fun updateData(tvteacher: TextInputEditText, tvlocation: TextInputEditText, tvname: TextInputEditText) {
        selectClassSchedule!!.name = tvname.text.toString().trim { it <= ' ' }
        selectClassSchedule!!.location = tvlocation.text.toString().trim { it <= ' ' }
        selectClassSchedule!!.teacher = tvteacher.text.toString().trim { it <= ' ' }
        selectClassSchedule!!.numberOfWeek = setNumberOfWeek()
        classScheduleDao.loadAll()
                .filter { it.week == selectClassSchedule!!.week }
                .filter { it.section == selectClassSchedule!!.section }
                .filter { it.id != selectClassSchedule!!.id }
                .forEach {
                    val newNumberOfWeek = ClassScheduleUtils.delNumberOfWeek(it, selectClassSchedule!!.numberOfWeek.split("-"))
                    if (newNumberOfWeek != it.numberOfWeek) {
                        if (newNumberOfWeek == "") {
                            classScheduleDao.deleteByKey(it.id)
                        } else {
                            it.numberOfWeek = newNumberOfWeek
                            classScheduleDao.update(it)
                        }
                    }
                }
        classScheduleDao.update(selectClassSchedule)
    }

    private fun insertData(classSplit: Array<String>, tvteacher: TextInputEditText, tvlocation: TextInputEditText, tvname: TextInputEditText) {
        val classSchedule = ClassSchedule()
        classSchedule.id = UUID.randomUUID().toString()
        classSchedule.name = tvname.text.toString().trim { it <= ' ' }
        classSchedule.location = tvlocation.text.toString().trim { it <= ' ' }
        classSchedule.teacher = tvteacher.text.toString().trim { it <= ' ' }
        classSchedule.section = Integer.parseInt(classSplit[0])
        classSchedule.week = Integer.parseInt(classSplit[1])
        classSchedule.numberOfWeek = setNumberOfWeek()
        classScheduleDao.loadAll()
                .filter { it.section == classSchedule.section }
                .filter { it.week == classSchedule.week }
                .forEach {
                    //检查当前插入的和其它周的是否有冲突
                    it.numberOfWeek = ClassScheduleUtils.delNumberOfWeek(it, classSchedule.numberOfWeek.split("-"))
                    if (it.numberOfWeek == "") {
                        classScheduleDao.deleteByKey(it.id)
                    } else {
                        classScheduleDao.update(it)
                    }
                }
        classScheduleDao.insert(classSchedule)
    }

    private fun setNumberOfWeek(): String {
        val stringBuilder = StringBuilder(80)
        val totalWeek = App.sharedPreferences.getInt(ConstantPool.Str.TOTAL_WEEK.get(), 25)
        for (i in 0 until totalWeek) {
            val materialCheckBox = autoWrapLineLayout.getChildAt(i) as MaterialCheckBox
            if (materialCheckBox.isChecked) {
                stringBuilder.append(i).append("-")
            }
        }
        if (stringBuilder.isEmpty()) {
            return ""
        }
        return stringBuilder.substring(0, stringBuilder.length - 1)
    }

    private fun initAlertDialog() {
        autoWrapLineLayout = inflate.findViewById(R.id.ll_week)
        copyBtn = inflate.findViewById(R.id.btn_copy)
        pasteBtn = inflate.findViewById(R.id.btn_paste)
        oddBtn = inflate.findViewById(R.id.btn_set_odd)
        doubleBtn = inflate.findViewById(R.id.btn_set_double)
        allBtn = inflate.findViewById(R.id.btn_set_all)
        clearBtn = inflate.findViewById(R.id.btn_set_clear)
        rangeBtn = inflate.findViewById(R.id.btn_set_range)
        val tvteacher = inflate.findViewById<TextInputEditText>(R.id.tv_teacher)
        val tvlocation = inflate.findViewById<TextInputEditText>(R.id.tv_location)
        val tvname = inflate.findViewById<TextInputEditText>(R.id.tv_name)

        val totalWeek = App.sharedPreferences.getInt(ConstantPool.Str.TOTAL_WEEK.get(), 25)
        for (i in 1..totalWeek) {
            val checkBox = MaterialCheckBox(activity)
            checkBox.text = i.toString()
            autoWrapLineLayout.addView(checkBox)
        }
        initBtnAction(tvteacher, tvlocation, tvname)
        alertDialog = AlertDialog.Builder(activity)
                .setView(inflate)
                .setPositiveButton("确定", null)
                .setNegativeButton("取消", null)
                .setNeutralButton("删除") { _, _ ->
                    if (selectClassSchedule != null) {
                        AlertDialog.Builder(activity)
                                .setTitle("删除确认")
                                .setMessage("确定删除星期" + selectClassSchedule!!.week + "的第" + selectClassSchedule!!.section + "节课么?")
                                .setPositiveButton("确定") { _, _ ->
                                    classScheduleDao.delete(selectClassSchedule)
                                    EventBus.getDefault().post(EventEntity(ConstantPool.Int.REFRESH_CLASS_SCHEDULE_FRAGMENT))
                                    selectClassSchedule = null
                                }
                                .setNegativeButton("取消", null)
                                .show()
                    }
                }.create()
    }

    private fun setText(tvteacher: TextInputEditText, tvlocation: TextInputEditText, tvname: TextInputEditText, classSplit: Array<String>) {
        tvlocation.text = null
        tvname.text = null
        tvteacher.text = null
        if (classScheduleList != null && classScheduleList.isNotEmpty()) {
            selectClassSchedule = null
            classScheduleList.forEach {
                if (it.section.toString() + "" == classSplit[0] && it.week.toString() + "" == classSplit[1]) {
                    selectClassSchedule = it
                    tvteacher.setText(it.teacher)
                    tvname.setText(it.name)
                    tvlocation.setText(it.location)
                    it.numberOfWeek.split("-").forEach { i ->
                        val materialCheckBox = autoWrapLineLayout.getChildAt(i.toInt()) as MaterialCheckBox
                        materialCheckBox.isChecked = true
                    }
                }
            }
        }
    }

    @SuppressWarnings("all")
    private fun initBtnAction(tvteacher: TextInputEditText, tvlocation: TextInputEditText, tvname: TextInputEditText) {
        val totalWeek = App.sharedPreferences.getInt(ConstantPool.Str.TOTAL_WEEK.get(), 25)
        updateBtnBackgroundTintList()
        copyBtn.setOnClickListener {
            copyList.clear()
            copyList.add(tvname.text.toString().trim { it <= ' ' })
            copyList.add(tvlocation.text.toString().trim { it <= ' ' })
            copyList.add(tvteacher.text.toString().trim { it <= ' ' })
            copyList.add(setNumberOfWeek())
            Toast.makeText(activity, "已复制", Toast.LENGTH_SHORT).show()
        }
        pasteBtn.setOnClickListener {
            if (copyList.size == COPY_SIZE) {
                tvname.setText(copyList[0])
                tvlocation.setText(copyList[1])
                tvteacher.setText(copyList[2])
                val s = copyList[3]
                if (s != "") {
                    s.split("-").forEach { i ->
                        val materialCheckBox = autoWrapLineLayout.getChildAt(i.toInt()) as MaterialCheckBox
                        materialCheckBox.isChecked = true
                    }
                }
                Toast.makeText(activity, "已粘贴", Toast.LENGTH_SHORT).show()
            }
        }
        oddBtn.setOnClickListener {
            for (i in 0 until totalWeek step 2) {
                val materialCheckBox = autoWrapLineLayout.getChildAt(i) as MaterialCheckBox
                materialCheckBox.isChecked = true
            }
        }
        doubleBtn.setOnClickListener {
            for (i in 1..totalWeek step 2) {
                val materialCheckBox = autoWrapLineLayout.getChildAt(i) as MaterialCheckBox
                materialCheckBox.isChecked = true
            }
        }
        allBtn.setOnClickListener {
            for (i in 0 until totalWeek) {
                val materialCheckBox = autoWrapLineLayout.getChildAt(i) as MaterialCheckBox
                materialCheckBox.isChecked = true
            }
        }
        clearBtn.setOnClickListener {
            for (i in 0 until totalWeek) {
                val materialCheckBox = autoWrapLineLayout.getChildAt(i) as MaterialCheckBox
                materialCheckBox.isChecked = false
            }
        }
        rangeBtn.setOnClickListener {
            var l = 0
            var r = 0
            val view = LayoutInflater.from(activity).inflate(R.layout.view_range, null)
            val seekBar = view.findViewById<RangeSeekBar>(R.id.seekBar)
            val tvFontPreview = view.findViewById<TextView>(R.id.tv_font_preview)
            tvFontPreview.text = "拖动滑块设置课程周数"
            seekBar.seekBarMode = RangeSeekBar.SEEKBAR_MODE_RANGE
            seekBar.setRange(1f, 50f)
            seekBar.setValue(12f, 37f)
            seekBar.setIndicatorTextDecimalFormat("0")
            seekBar.setOnRangeChangedListener(object : OnRangeChangedListener {
                @Suppress("UsePropertyAccessSyntax")
                override fun onRangeChanged(view: RangeSeekBar, leftValue: Float, rightValue: Float, isFromUser: Boolean) {
                    l = leftValue.toInt()
                    r = rightValue.toInt()
                    tvFontPreview.setText("课程从第${l}周到第${r}周")
                }

                override fun onStartTrackingTouch(view: RangeSeekBar, isLeft: Boolean) {}

                override fun onStopTrackingTouch(view: RangeSeekBar, isLeft: Boolean) {}
            })
            AlertDialog.Builder(activity)
                    .setView(view)
                    .setTitle("设置课程周数区间")
                    .setPositiveButton("确定") { _, _ ->
                        if (l != 0 && r != 0) {
                            for (i in l..r) {
                                val materialCheckBox = autoWrapLineLayout.getChildAt(i - 1) as MaterialCheckBox
                                materialCheckBox.isChecked = true
                            }
                        }
                    }
                    .show()
        }
    }

    fun updateBtnBackgroundTintList() {
        val colorStateList = ColorStateList.valueOf(ThemeChangeUtil.getNowThemeColorAccent(activity))
        copyBtn.backgroundTintList = colorStateList
        pasteBtn.backgroundTintList = colorStateList
        oddBtn.backgroundTintList = colorStateList
        doubleBtn.backgroundTintList = colorStateList
        allBtn.backgroundTintList = colorStateList
        clearBtn.backgroundTintList = colorStateList
        rangeBtn.backgroundTintList = colorStateList
    }

    companion object {
        private const val TAG = "CSLongClickListener"
        private const val COPY_SIZE = 4
    }
}
