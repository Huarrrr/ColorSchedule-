package top.huar.schedule.ui.fragment.setting

import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.preference.*
import org.greenrobot.eventbus.EventBus
import top.huar.schedule.R
import top.huar.schedule.common.App
import top.huar.schedule.common.ConstantPool
import top.huar.schedule.entity.EventEntity
import top.huar.schedule.util.DateUtils.getNextMondayOfTimeInMillis
import top.huar.schedule.util.ThemeChangeUtil

/**
 * 设置Fragment
 *
 * @author itning
 */
class SettingsFragment : PreferenceFragmentCompat(), SharedPreferences.OnSharedPreferenceChangeListener {

    private lateinit var prefs: SharedPreferences
    private lateinit var defaultShowMainFragmentListPreference: ListPreference
    private lateinit var classReminderUpTime: ListPreference
    private lateinit var classReminderDownTime: ListPreference
    private lateinit var phoneMuteBeforeTime: ListPreference
    private lateinit var phoneMuteAfterTime: ListPreference
    private lateinit var nowWeekNumEditTextPreference: EditTextPreference
    private lateinit var totalWeekNumEditTextPreference: EditTextPreference
    private var total: Int = 25

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        prefs = PreferenceManager.getDefaultSharedPreferences(context)
        prefs.registerOnSharedPreferenceChangeListener(this)
        val bundle = arguments
        if (bundle == null) {
            defaultShowMainFragmentListPreference = findPreference(DEFAULT_SHOW_MAIN_FRAGMENT)!!
            defaultShowMainFragmentListPreference.summary = defaultShowMainFragmentListPreference.entry
            val foregroundServiceStatus: Preference = findPreference<SwitchPreference>(FOREGROUND_SERVICE_STATUS)!!
            foregroundServiceStatus.setOnPreferenceChangeListener { _, newValue ->
                if (!(newValue as Boolean)) {
                    AlertDialog.Builder(requireContext()).setTitle("注意")
                            .setMessage("关闭后台常驻会导致提醒服务，手机自动静音服务不准确。建议您不要关闭！")
                            .setCancelable(true)
                            .setPositiveButton("我知道了", null)
                            .show()
                }
                true
            }
            val totalWeek = App.sharedPreferences.getInt(ConstantPool.Str.TOTAL_WEEK.get(), 25)
            nowWeekNumEditTextPreference = findPreference(NOW_WEEK_NUM)!!
            nowWeekNumEditTextPreference.setOnPreferenceChangeListener { _, newValue ->
                if (newValue.toString() == "" || (Integer.valueOf(newValue.toString())) > totalWeek) {
                    Toast.makeText(requireContext(), "设置的值必须大于1且小于$totalWeek", Toast.LENGTH_LONG).show()
                    false
                } else {
                    true
                }
            }
            nowWeekNumEditTextPreference.summary = "第${prefs.getString(NOW_WEEK_NUM, "1")}周"

            totalWeekNumEditTextPreference = findPreference(TOTAL_WEEK_NUM)!!
            totalWeekNumEditTextPreference.setOnPreferenceChangeListener { _, newValue ->
                if (newValue.toString() == "") {
                    Toast.makeText(requireContext(), "好像没有任何修改...", Toast.LENGTH_LONG).show()
                    false
                } else {
                    total = (newValue as String).toInt()
                    true
                }
            }
            totalWeekNumEditTextPreference.summary = "共${prefs.getString(TOTAL_WEEK_NUM, "25")}周"
        } else {
            when (bundle.getString(ARG_PREFERENCE_ROOT)) {
                "class_reminder" -> {
                    classReminderUpTime = findPreference(CLASS_REMINDER_UP_TIME)!!
                    classReminderDownTime = findPreference(CLASS_REMINDER_DOWN_TIME)!!
                    classReminderUpTime.summary = classReminderUpTime.entry
                    classReminderDownTime.summary = classReminderDownTime.entry
                }
                "phone_mute" -> {
                    phoneMuteBeforeTime = findPreference(PHONE_MUTE_BEFORE_TIME)!!
                    phoneMuteAfterTime = findPreference(PHONE_MUTE_AFTER_TIME)!!
                    val phoneMuteStatus = findPreference<SwitchPreference>(PHONE_MUTE_STATUS)!!
                    phoneMuteStatus.setOnPreferenceChangeListener { _, newValue ->
                        if (newValue as Boolean) {
                            val notificationManager = requireContext().getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N && !notificationManager.isNotificationPolicyAccessGranted) {
                                Toast.makeText(requireContext(), "请授予免打扰权限", Toast.LENGTH_LONG).show()
                                Toast.makeText(requireContext(), "权限授予后请重新开启自动静音", Toast.LENGTH_LONG).show()
                                startActivity(Intent(Settings.ACTION_NOTIFICATION_POLICY_ACCESS_SETTINGS))
                                return@setOnPreferenceChangeListener false
                            } else {
                                return@setOnPreferenceChangeListener true
                            }
                        }
                        true
                    }
                    phoneMuteBeforeTime.summary = phoneMuteBeforeTime.entry
                    phoneMuteAfterTime.summary = phoneMuteAfterTime.entry
                }
            }
        }
    }

    override fun onDestroyView() {
        Log.d(TAG, "on Destroy View")
        prefs.unregisterOnSharedPreferenceChangeListener(this)
        super.onDestroyView()
    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        val bundle = arguments
        if (bundle == null) {
            setPreferencesFromResource(R.xml.preference_settings, rootKey)
        } else {
            setPreferencesFromResource(R.xml.preference_settings, bundle.getString(ARG_PREFERENCE_ROOT))
        }
    }

    override fun onSharedPreferenceChanged(sharedPreferences: SharedPreferences, key: String) {
        when (key) {
            DEFAULT_SHOW_MAIN_FRAGMENT -> {
                defaultShowMainFragmentListPreference.summary = defaultShowMainFragmentListPreference.entry
            }
            CLASS_REMINDER_UP_TIME -> {
                classReminderUpTime.summary = classReminderUpTime.entry
            }
            CLASS_REMINDER_DOWN_TIME -> {
                classReminderDownTime.summary = classReminderDownTime.entry
            }
            PHONE_MUTE_BEFORE_TIME -> {
                phoneMuteBeforeTime.summary = phoneMuteBeforeTime.entry
            }
            PHONE_MUTE_AFTER_TIME -> {
                phoneMuteAfterTime.summary = phoneMuteAfterTime.entry
            }
            APP_COLOR_PRIMARY -> {
                ThemeChangeUtil.changeColor()
            }
            APP_COLOR_PRIMARY_DARK -> {
                ThemeChangeUtil.changeColor()
            }
            APP_COLOR_ACCENT -> {
                ThemeChangeUtil.changeColor()
            }
            APP_COLOR_PROGRESS -> {
                ThemeChangeUtil.changeColor()
            }
            NOW_WEEK_NUM -> {
                nowWeekNumEditTextPreference.summary = sharedPreferences.getString(key, "1")
                App.sharedPreferences.edit().putLong(ConstantPool.Str.NEXT_WEEK_OF_MONDAY.get(), getNextMondayOfTimeInMillis()).apply()
                EventBus.getDefault().post(EventEntity(ConstantPool.Int.TIME_TICK_CHANGE, ""))
            }

            TOTAL_WEEK_NUM -> {
                totalWeekNumEditTextPreference.summary = "共${sharedPreferences.getString(key, "$total")}周"
                App.sharedPreferences.edit().putInt(ConstantPool.Str.TOTAL_WEEK.get(),total).apply()
                EventBus.getDefault().post(EventEntity(ConstantPool.Int.TIME_TICK_CHANGE, ""))
            }
        }
    }

    companion object {
        private const val TAG = "SettingsFragment"
        const val CLASS_REMINDER_UP_TIME = "class_reminder_up_time"
        const val CLASS_REMINDER_DOWN_TIME = "class_reminder_down_time"
        const val PHONE_MUTE_STATUS = "phone_mute_status"
        const val PHONE_MUTE_BEFORE_TIME = "phone_mute_before_time"
        const val PHONE_MUTE_AFTER_TIME = "phone_mute_after_time"
        const val DEFAULT_SHOW_MAIN_FRAGMENT = "default_show_main_fragment"
        const val APP_COLOR_PRIMARY = "app_color_primary"
        const val APP_COLOR_PRIMARY_DARK = "app_color_primary_dark"
        const val APP_COLOR_ACCENT = "app_color_accent"
        const val APP_COLOR_PROGRESS = "app_color_progress"
        const val FOREGROUND_SERVICE_STATUS = "foreground_service_status"
        const val NOW_WEEK_NUM = "now_week_num"
        const val TOTAL_WEEK_NUM = "total_week_num"
    }
}
