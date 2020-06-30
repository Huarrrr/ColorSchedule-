package top.huar.schedule.service;

import java.lang.System;

/**
 * 提醒服务
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0001EB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020#H\u0002J\b\u0010%\u001a\u00020#H\u0002J\b\u0010&\u001a\u00020#H\u0002Jg\u0010\'\u001a\u00020#2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00102\u0006\u0010(\u001a\u00020\u00112\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020\nH\u0002\u00a2\u0006\u0002\u00101J\b\u00102\u001a\u00020#H\u0002J\b\u00103\u001a\u00020#H\u0002J\b\u00104\u001a\u00020#H\u0002J\u0012\u00105\u001a\u0004\u0018\u0001062\u0006\u00107\u001a\u00020\u0013H\u0017J\b\u00108\u001a\u00020#H\u0016J\b\u00109\u001a\u00020#H\u0016J\u0010\u0010:\u001a\u00020#2\u0006\u0010;\u001a\u00020<H\u0007J\u0018\u0010=\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020+H\u0016J \u0010?\u001a\u00020\f2\u0006\u00107\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\f2\u0006\u0010A\u001a\u00020\fH\u0016J\u0018\u0010B\u001a\u00020#2\u0006\u0010C\u001a\u00020+2\u0006\u0010D\u001a\u00020+H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006F"}, d2 = {"Ltop/huar/schedule/service/RemindService;", "Landroid/app/Service;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "()V", "alarmManager", "Landroid/app/AlarmManager;", "calendar", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "classReminderDownStatus", "", "classReminderDownTime", "", "classReminderUpStatus", "classReminderUpTime", "classScheduleList", "", "Ltop/huar/schedule/entity/ClassSchedule;", "downTimeList", "Landroid/content/Intent;", "isNewDay", "()Z", "pendingIntentList", "Landroid/app/PendingIntent;", "phoneMuteAfterTime", "phoneMuteBeforeTime", "phoneMuteStatus", "powerManager", "Landroid/os/PowerManager;", "sharedPreferences", "Landroid/content/SharedPreferences;", "timeList", "", "upTimeList", "addToAlarm", "", "clearAlarm", "initClassScheduleList", "initData", "initIntent", "classSchedule", "timeArray", "", "", "beforeTime", "afterTime", "type", "haveBefore", "haveAfter", "(Ljava/util/List;Ljava/util/List;Ltop/huar/schedule/entity/ClassSchedule;[Ljava/lang/String;IILjava/lang/String;ZZ)V", "initPendingIntentList", "initTimeList", "obsoleteClear", "onBind", "Landroid/os/IBinder;", "intent", "onCreate", "onDestroy", "onMessageEvent", "eventEntity", "Ltop/huar/schedule/entity/EventEntity;", "onSharedPreferenceChanged", "key", "onStartCommand", "flags", "startId", "sendNotification", "contentTitle", "contentText", "Companion", "app_debug"})
public final class RemindService extends android.app.Service implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    private java.util.List<top.huar.schedule.entity.ClassSchedule> classScheduleList;
    private android.content.SharedPreferences sharedPreferences;
    private final java.util.Calendar calendar = null;
    private android.app.AlarmManager alarmManager;
    private android.os.PowerManager powerManager;
    private volatile boolean classReminderDownStatus;
    private volatile boolean classReminderUpStatus;
    private volatile boolean phoneMuteStatus;
    private int phoneMuteAfterTime;
    private int phoneMuteBeforeTime;
    private int classReminderUpTime;
    private int classReminderDownTime;
    private final java.util.List<android.content.Intent> upTimeList = null;
    private final java.util.List<android.content.Intent> downTimeList = null;
    private final java.util.List<android.app.PendingIntent> pendingIntentList = null;
    private final java.util.List<java.lang.Long> timeList = null;
    private static final java.lang.String TAG = "RemindService";
    private static final java.lang.String REMIND_SERVICE_NEW_DAY = "remind_service_new_day";
    private static final java.lang.String CLASS_REMINDER_UP_STATUS = "class_reminder_up_status";
    private static final java.lang.String CLASS_REMINDER_DOWN_STATUS = "class_reminder_down_status";
    public static final top.huar.schedule.service.RemindService.Companion Companion = null;
    
    private final boolean isNewDay() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.BACKGROUND)
    public final void onMessageEvent(@org.jetbrains.annotations.NotNull()
    top.huar.schedule.entity.EventEntity eventEntity) {
    }
    
    /**
     * 初始化数据
     */
    private final void initData() {
    }
    
    private final void clearAlarm() {
    }
    
    private final void initPendingIntentList() {
    }
    
    /**
     * 初始化今天课程
     */
    private final void initClassScheduleList() {
    }
    
    private final void obsoleteClear() {
    }
    
    /**
     * 初始化时间数据
     */
    private final void initTimeList() {
    }
    
    private final void initIntent(java.util.List<android.content.Intent> upTimeList, java.util.List<android.content.Intent> downTimeList, top.huar.schedule.entity.ClassSchedule classSchedule, java.lang.String[] timeArray, int beforeTime, int afterTime, java.lang.String type, boolean haveBefore, boolean haveAfter) {
    }
    
    /**
     * 添加到提醒
     */
    private final void addToAlarm() {
    }
    
    /**
     * 发送通知
     *
     * @param contentTitle 标题
     * @param contentText  内容
     */
    private final void sendNotification(java.lang.String contentTitle, java.lang.String contentText) {
    }
    
    @java.lang.Override()
    public void onSharedPreferenceChanged(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    public RemindService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Ltop/huar/schedule/service/RemindService$Companion;", "", "()V", "CLASS_REMINDER_DOWN_STATUS", "", "CLASS_REMINDER_UP_STATUS", "REMIND_SERVICE_NEW_DAY", "TAG", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}