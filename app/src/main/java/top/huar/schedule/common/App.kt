package top.huar.schedule.common

import android.app.Application
import android.content.ComponentCallbacks2
import android.content.Context
import android.content.SharedPreferences
import android.content.res.Configuration
import android.util.Log
import cn.bmob.v3.Bmob
import com.tencent.bugly.crashreport.CrashReport
import org.greenrobot.eventbus.EventBus
import top.huar.schedule.AppActivityIndex
import top.huar.schedule.entity.DaoMaster
import top.huar.schedule.entity.DaoSession
import top.huar.schedule.util.GlideApp

/**
 * 应用基类
 *
 */
class App : Application() {

    lateinit var daoSession: DaoSession

    override fun onCreate() {
        // 程序创建的时候执行
        //EventBus add Index
        EventBus.builder().addIndex(AppActivityIndex()).installDefaultEventBus()
        //bugly
        CrashReport.initCrashReport(applicationContext, "8c802875cc", true)

        val helper = DaoMaster.DevOpenHelper(this, ConstantPool.Str.DB_NAME.get())
        val db = helper.writableDb
        daoSession = DaoMaster(db).newSession()
        sharedPreferences = getSharedPreferences(ConstantPool.Str.SHARED_PREFERENCES_FILENAME.get(), Context.MODE_PRIVATE)
        Bmob.initialize(this,"2ad20bec9916af5ac6a332520efaf913")
        super.onCreate()
    }

    override fun onTerminate() {
        // 程序终止的时候执行
//        Log.d(TAG, "onTerminate")
        super.onTerminate()
    }

    override fun onLowMemory() {
        // 低内存的时候执行
//        Log.d(TAG, "onLowMemory")
        GlideApp.get(this).clearMemory()
        super.onLowMemory()
    }

    override fun onTrimMemory(level: Int) {
        // 程序在内存清理的时候执行
//        Log.d(TAG, "onTrimMemory:$level")
        if (level == ComponentCallbacks2.TRIM_MEMORY_UI_HIDDEN) {
            GlideApp.get(this).clearMemory()
        }
        GlideApp.get(this).trimMemory(level)
        super.onTrimMemory(level)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
//        Log.d(TAG, "onConfigurationChanged")
        super.onConfigurationChanged(newConfig)
    }

    companion object {
        private const val TAG = "App"
        lateinit var sharedPreferences: SharedPreferences
    }
}
