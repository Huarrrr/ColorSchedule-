package top.huar.schedule.service;

import java.lang.System;

/**
 * 公共服务
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u0005\u00a2\u0006\u0002\u0010\u0003J,\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0003J\b\u0010\u0011\u001a\u00020\tH\u0002J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\tH\u0016J\b\u0010\u001a\u001a\u00020\tH\u0016J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0018\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u000bH\u0016J \u0010 \u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Ltop/huar/schedule/service/CommonService;", "Landroid/app/Service;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "()V", "sharedPreferences", "Landroid/content/SharedPreferences;", "timeTickReceiver", "Ltop/huar/schedule/receiver/TimeTickReceiver;", "createNotificationChannel", "", "channelId", "", "channelName", "importance", "", "showBadge", "", "initNotificationChannel", "isNewWeek", "currentTimeMillis", "", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "onMessageEvent", "eventEntity", "Ltop/huar/schedule/entity/EventEntity;", "onSharedPreferenceChanged", "key", "onStartCommand", "flags", "startId", "Companion", "app_release"})
public final class CommonService extends android.app.Service implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    private top.huar.schedule.receiver.TimeTickReceiver timeTickReceiver;
    private android.content.SharedPreferences sharedPreferences;
    private static final java.lang.String TAG = "CommonService";
    public static final top.huar.schedule.service.CommonService.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    /**
     * 初始化通知渠道
     *
     * @since android 8.0
     */
    private final void initNotificationChannel() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return null;
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMessageEvent(@org.jetbrains.annotations.NotNull()
    top.huar.schedule.entity.EventEntity eventEntity) {
    }
    
    /**
     * 检查是不是新的一周
     */
    private final boolean isNewWeek(long currentTimeMillis) {
        return false;
    }
    
    /**
     * 创建通知渠道
     *
     * @param channelId   渠道ID
     * @param channelName 渠道名
     * @param importance  重要程度 [NotificationManager]
     */
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.O)
    private final void createNotificationChannel(@androidx.annotation.NonNull()
    java.lang.String channelId, @androidx.annotation.NonNull()
    java.lang.String channelName, int importance, boolean showBadge) {
    }
    
    @java.lang.Override()
    public void onSharedPreferenceChanged(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    public CommonService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ltop/huar/schedule/service/CommonService$Companion;", "", "()V", "TAG", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}