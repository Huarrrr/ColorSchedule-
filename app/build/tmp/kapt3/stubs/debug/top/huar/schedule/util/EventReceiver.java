package top.huar.schedule.util;

import java.lang.System;

/**
 * 事件接收
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Ltop/huar/schedule/util/EventReceiver;", "", "eventTrigger", "", "app_debug"})
public abstract interface EventReceiver {
    
    /**
     * 触发事件
     *
     * @return 已消费返回真
     */
    public abstract boolean eventTrigger();
}