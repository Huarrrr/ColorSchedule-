package top.huar.schedule.common

import android.content.Intent
import android.os.Bundle
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import top.huar.schedule.entity.EventEntity
import top.huar.schedule.service.CommonService
import top.huar.schedule.service.RemindService
import top.huar.schedule.service.TodayWidgetService

/**
 * Base App Activity
 *
 */
abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startService(Intent(this, CommonService::class.java))
        startService(Intent(this, RemindService::class.java))
        startService(Intent(this, TodayWidgetService::class.java))
    }

    /**
     * 消息事件
     *
     * @param eventEntity what
     */
    abstract fun onMessageEvent(eventEntity: EventEntity)
}
