package top.huar.schedule.ui.activity;

import java.lang.System;

/**
 * 关于
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0003J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\bH\u0002J\b\u0010\r\u001a\u00020\bH\u0014J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0017J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016\u00a8\u0006\u0016"}, d2 = {"Ltop/huar/schedule/ui/activity/AboutActivity;", "Ltop/huar/schedule/common/BaseActivity;", "()V", "getPackageVersionName", "", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "initView", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCvHrefClicked", "onDestroy", "onMessageEvent", "eventEntity", "Ltop/huar/schedule/entity/EventEntity;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "Companion", "app_debug"})
public final class AboutActivity extends top.huar.schedule.common.BaseActivity {
    private static final java.lang.String TAG = "AboutActivity";
    public static final top.huar.schedule.ui.activity.AboutActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    /**
     * 获取当前应用版本
     *
     * @param appCompatActivity [AppCompatActivity]
     * @return 版本信息
     */
    @androidx.annotation.CheckResult()
    private final java.lang.String getPackageVersionName(@androidx.annotation.NonNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        return null;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onMessageEvent(@org.jetbrains.annotations.NotNull()
    top.huar.schedule.entity.EventEntity eventEntity) {
    }
    
    private final void onCvHrefClicked() {
    }
    
    public AboutActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ltop/huar/schedule/ui/activity/AboutActivity$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}