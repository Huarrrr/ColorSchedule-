package top.huar.schedule.ui.activity;

import java.lang.System;

/**
 * 登陆
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\"\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0014J\u0017\u0010\u0012\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0007\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0017J\b\u0010\u0017\u001a\u00020\u0004H\u0002\u00a8\u0006\u0019"}, d2 = {"Ltop/huar/schedule/ui/activity/LoginActivity;", "Ltop/huar/schedule/common/BaseActivity;", "()V", "doImportFile", "", "data", "Landroid/content/Intent;", "enterMainActivity", "initData", "onActivityResult", "requestCode", "", "resultCode", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCustomBtnClicked", "onDestroy", "onMessageEvent", "what", "(Ljava/lang/Integer;)V", "eventEntity", "Ltop/huar/schedule/entity/EventEntity;", "onViewClicked", "Companion", "app_debug"})
public final class LoginActivity extends top.huar.schedule.common.BaseActivity {
    private static final java.lang.String TAG = "LoginActivity";
    public static final top.huar.schedule.ui.activity.LoginActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * 加载专业数据
     */
    private final void initData() {
    }
    
    @java.lang.Override()
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onMessageEvent(@org.jetbrains.annotations.NotNull()
    top.huar.schedule.entity.EventEntity eventEntity) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    /**
     * 消息事件
     *
     * @param what what
     */
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMessageEvent(@org.jetbrains.annotations.Nullable()
    java.lang.Integer what) {
    }
    
    /**
     * 自定义课程
     */
    private final void onCustomBtnClicked() {
    }
    
    private final void onViewClicked() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void doImportFile(android.content.Intent data) {
    }
    
    private final void enterMainActivity() {
    }
    
    public LoginActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ltop/huar/schedule/ui/activity/LoginActivity$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}