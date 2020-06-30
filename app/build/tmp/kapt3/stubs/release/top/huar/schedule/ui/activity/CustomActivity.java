package top.huar.schedule.ui.activity;

import java.lang.System;

/**
 * 自定义课程
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00015B\u0005\u00a2\u0006\u0002\u0010\u0003J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002J\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0003J\b\u0010\u001a\u001a\u00020\u000bH\u0002J\b\u0010\u001b\u001a\u00020\u000bH\u0003J\u0012\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u000bH\u0014J\u0010\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020&H\u0017J\u0010\u0010\'\u001a\u00020 2\u0006\u0010(\u001a\u00020)H\u0016J(\u0010*\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0005H\u0016J\u0010\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u0007H\u0002J\u0012\u00101\u001a\u00020\u000b2\b\b\u0002\u00102\u001a\u00020\u0007H\u0002J\b\u00103\u001a\u00020\u000bH\u0002J\b\u00104\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Ltop/huar/schedule/ui/activity/CustomActivity;", "Ltop/huar/schedule/common/BaseActivity;", "Lcom/wdullaer/materialdatetimepicker/time/TimePickerDialog$OnTimeSetListener;", "()V", "classSchedule", "", "msg", "", "timeMap", "Ljava/util/TreeMap;", "getOneClass", "", "classText", "", "upTime", "downTime", "getOneRowRelativeLayout", "Landroid/widget/RelativeLayout;", "leftText", "rightText", "l", "Landroid/view/View$OnClickListener;", "getTimePickerDialog", "Lcom/wdullaer/materialdatetimepicker/time/TimePickerDialog;", "type", "time", "init", "initData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onDestroy", "onMessageEvent", "eventEntity", "Ltop/huar/schedule/entity/EventEntity;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onTimeSet", "view", "hourOfDay", "minute", "second", "onViewClicked", "id", "setText", "key", "showTimePickerDialog", "updateSharedPreferences", "Companion", "app_release"})
public final class CustomActivity extends top.huar.schedule.common.BaseActivity implements com.wdullaer.materialdatetimepicker.time.TimePickerDialog.OnTimeSetListener {
    private java.lang.String msg;
    private int classSchedule;
    private java.util.TreeMap<java.lang.Integer, java.lang.String> timeMap;
    private static final java.lang.String TAG = "CustomActivity";
    private static final java.lang.String CLASS_UP = "s";
    private static final int MIN_TIME = 10;
    public static final top.huar.schedule.ui.activity.CustomActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * 初始化数据
     */
    @android.annotation.SuppressLint(value = {"ApplySharedPref"})
    private final void initData() {
    }
    
    /**
     * 设置面板
     */
    private final void setText(java.lang.String key) {
    }
    
    /**
     * 初始化视图
     */
    private final void init() {
    }
    
    private final void getOneClass(java.lang.CharSequence classText, java.lang.CharSequence upTime, java.lang.CharSequence downTime) {
    }
    
    private final android.widget.RelativeLayout getOneRowRelativeLayout(java.lang.CharSequence leftText, java.lang.CharSequence rightText, android.view.View.OnClickListener l) {
        return null;
    }
    
    @java.lang.Override()
    protected void onDestroy() {
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
     * 更新SharedPreferences
     */
    private final void updateSharedPreferences() {
    }
    
    @java.lang.Override()
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onMessageEvent(@org.jetbrains.annotations.NotNull()
    top.huar.schedule.entity.EventEntity eventEntity) {
    }
    
    private final void onViewClicked(java.lang.String id) {
    }
    
    /**
     * 显示时间选择器
     */
    private final void showTimePickerDialog() {
    }
    
    /**
     * 获取时间选择器
     *
     * @param type 上课还是下课
     * @param time 时间
     * @return [TimePickerDialog]
     */
    @androidx.annotation.CheckResult()
    @androidx.annotation.NonNull()
    private final com.wdullaer.materialdatetimepicker.time.TimePickerDialog getTimePickerDialog(java.lang.String type, java.lang.String time) {
        return null;
    }
    
    @java.lang.Override()
    public void onTimeSet(@org.jetbrains.annotations.NotNull()
    com.wdullaer.materialdatetimepicker.time.TimePickerDialog view, int hourOfDay, int minute, int second) {
    }
    
    public CustomActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Ltop/huar/schedule/ui/activity/CustomActivity$Companion;", "", "()V", "CLASS_UP", "", "MIN_TIME", "", "TAG", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}