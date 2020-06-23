package top.huar.schedule.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

import org.greenrobot.eventbus.EventBus

import top.huar.schedule.common.ConstantPool
import top.huar.schedule.entity.EventEntity

/**
 * 时间改变广播,包括用户手动设置时间,时区
 */
class TimeTickReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Log.d(TAG, "send time change event")
        EventBus.getDefault().post(EVENT_ENTITY)
    }

    companion object {
        private const val TAG = "TimeTickReceiver"
        private val EVENT_ENTITY = EventEntity(ConstantPool.Int.TIME_TICK_CHANGE)
    }
}
