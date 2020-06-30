package top.huar.schedule.ui.activity;

import java.lang.System;

/**
 * 主活动
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00017B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\fH\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\"\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\u0012\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0010\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0011H\u0014J\u0010\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0017J\u0012\u0010\'\u001a\u00020\f2\b\b\u0001\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020\f2\u0006\u0010(\u001a\u00020)H\u0016J/\u0010+\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u000e\b\u0001\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000f0-2\b\b\u0001\u0010.\u001a\u00020/H\u0016\u00a2\u0006\u0002\u00100J\b\u00101\u001a\u00020\u0011H\u0014J\b\u00102\u001a\u00020\u0011H\u0014J\u0012\u00103\u001a\u00020\u00112\b\b\u0001\u00104\u001a\u00020\u0018H\u0002J\b\u00105\u001a\u00020\u0011H\u0002J\b\u00106\u001a\u00020\u0011H\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00068"}, d2 = {"Ltop/huar/schedule/ui/activity/MainActivity;", "Ltop/huar/schedule/common/BaseActivity;", "Lcom/google/android/material/navigation/NavigationView$OnNavigationItemSelectedListener;", "()V", "drawerSwitch", "Landroidx/appcompat/widget/SwitchCompat;", "firstPressedTime", "", "fragmentSparseArray", "Landroid/util/SparseArray;", "Landroidx/fragment/app/Fragment;", "isConsumption", "", "()Z", "tempNumberOfWeek", "", "changeWeekFragmentFont", "", "checkPermission", "initData", "initView", "newUserStudy", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onDestroy", "onMessageEvent", "eventEntity", "Ltop/huar/schedule/entity/EventEntity;", "onNavigationItemSelected", "item", "Landroid/view/MenuItem;", "onOptionsItemSelected", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onStart", "onStop", "setFragment", "id", "showDialogToUser", "startSelectImageActivity", "Companion", "app_release"})
public final class MainActivity extends top.huar.schedule.common.BaseActivity implements com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener {
    private android.util.SparseArray<androidx.fragment.app.Fragment> fragmentSparseArray;
    private long firstPressedTime;
    private androidx.appcompat.widget.SwitchCompat drawerSwitch;
    private java.lang.String tempNumberOfWeek;
    private static final java.lang.String TAG = "MainActivity";
    private static final int REQUEST_CODE_CHOOSE = 101;
    private static final int REQUEST_CODE = 103;
    private static final int SETTING_REQUEST_CODE = 104;
    private static final java.text.SimpleDateFormat ACTION_BAR_TITLE_FORMAT = null;
    public static final top.huar.schedule.ui.activity.MainActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final boolean isConsumption() {
        return false;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * 初始化数据
     */
    private final void initData() {
    }
    
    /**
     * 初始化视图
     */
    private final void initView() {
    }
    
    /**
     * 新用户引导
     */
    private final void newUserStudy() {
    }
    
    @java.lang.Override()
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onMessageEvent(@org.jetbrains.annotations.NotNull()
    top.huar.schedule.entity.EventEntity eventEntity) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    /**
     * 显示弹窗
     */
    private final void showDialogToUser() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    int[] grantResults) {
    }
    
    /**
     * 检查权限
     *
     * @return 权限通过
     */
    private final boolean checkPermission() {
        return false;
    }
    
    /**
     * 开启选择图片Activity
     */
    @androidx.annotation.RequiresPermission(allOf = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"})
    private final void startSelectImageActivity() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    /**
     * 更改本周课程字体大小
     */
    private final void changeWeekFragmentFont() {
    }
    
    @java.lang.Override()
    public boolean onNavigationItemSelected(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.view.MenuItem item) {
        return false;
    }
    
    /**
     * 设置Fragment
     *
     * @param id id
     */
    private final void setFragment(@androidx.annotation.IdRes()
    int id) {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Ltop/huar/schedule/ui/activity/MainActivity$Companion;", "", "()V", "ACTION_BAR_TITLE_FORMAT", "Ljava/text/SimpleDateFormat;", "REQUEST_CODE", "", "REQUEST_CODE_CHOOSE", "SETTING_REQUEST_CODE", "TAG", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}