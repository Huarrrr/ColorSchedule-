package top.huar.schedule.util

/**
 * 事件接收
 *
 */
interface EventReceiver {
    /**
     * 触发事件
     *
     * @return 已消费返回真
     */
    fun eventTrigger(): Boolean
}
