package top.huar.schedule.ui.adapter;

import java.lang.System;

/**
 * 每节课长按监听
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 42\u00020\u0001:\u00014B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nJ\b\u0010\u001c\u001a\u00020\u001dH\u0002J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0002J3\u0010#\u001a\u00020\u001d2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0%2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0002\u00a2\u0006\u0002\u0010&J8\u0010\'\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*H\u0002J\u0010\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020\u0017H\u0016J\b\u0010/\u001a\u00020\tH\u0002J3\u00100\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0%H\u0002\u00a2\u0006\u0002\u00101J\u0006\u00102\u001a\u00020\u001dJ \u00103\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u00020\u00178\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Ltop/huar/schedule/ui/adapter/ClassScheduleItemLongClickListener;", "Landroid/view/View$OnLongClickListener;", "activity", "Landroid/app/Activity;", "classScheduleList", "", "Ltop/huar/schedule/entity/ClassSchedule;", "copyList", "", "", "(Landroid/app/Activity;Ljava/util/List;Ljava/util/List;)V", "alertDialog", "Landroidx/appcompat/app/AlertDialog;", "allBtn", "Landroidx/appcompat/widget/AppCompatButton;", "autoWrapLineLayout", "Lcn/wolfspider/autowraplinelayout/AutoWrapLineLayout;", "classScheduleDao", "Ltop/huar/schedule/entity/ClassScheduleDao;", "clearBtn", "copyBtn", "doubleBtn", "inflate", "Landroid/view/View;", "oddBtn", "pasteBtn", "rangeBtn", "selectClassSchedule", "initAlertDialog", "", "initBtnAction", "tvteacher", "Lcom/google/android/material/textfield/TextInputEditText;", "tvlocation", "tvname", "insertData", "classSplit", "", "([Ljava/lang/String;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputEditText;)V", "isInputError", "", "tlname", "Lcom/google/android/material/textfield/TextInputLayout;", "tllocation", "tlteacher", "onLongClick", "v", "setNumberOfWeek", "setText", "(Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputEditText;[Ljava/lang/String;)V", "updateBtnBackgroundTintList", "updateData", "Companion", "app_debug"})
public final class ClassScheduleItemLongClickListener implements android.view.View.OnLongClickListener {
    private final top.huar.schedule.entity.ClassScheduleDao classScheduleDao = null;
    @android.annotation.SuppressLint(value = {"InflateParams"})
    private final android.view.View inflate = null;
    private top.huar.schedule.entity.ClassSchedule selectClassSchedule;
    private androidx.appcompat.app.AlertDialog alertDialog;
    private androidx.appcompat.widget.AppCompatButton copyBtn;
    private androidx.appcompat.widget.AppCompatButton pasteBtn;
    private androidx.appcompat.widget.AppCompatButton oddBtn;
    private androidx.appcompat.widget.AppCompatButton doubleBtn;
    private androidx.appcompat.widget.AppCompatButton allBtn;
    private androidx.appcompat.widget.AppCompatButton clearBtn;
    private androidx.appcompat.widget.AppCompatButton rangeBtn;
    private cn.wolfspider.autowraplinelayout.AutoWrapLineLayout autoWrapLineLayout;
    private final android.app.Activity activity = null;
    private final java.util.List<top.huar.schedule.entity.ClassSchedule> classScheduleList = null;
    private final java.util.List<java.lang.String> copyList = null;
    private static final java.lang.String TAG = "CSLongClickListener";
    private static final int COPY_SIZE = 4;
    public static final top.huar.schedule.ui.adapter.ClassScheduleItemLongClickListener.Companion Companion = null;
    
    @java.lang.Override()
    public boolean onLongClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
        return false;
    }
    
    private final boolean isInputError(com.google.android.material.textfield.TextInputEditText tvteacher, com.google.android.material.textfield.TextInputEditText tvlocation, com.google.android.material.textfield.TextInputEditText tvname, com.google.android.material.textfield.TextInputLayout tlname, com.google.android.material.textfield.TextInputLayout tllocation, com.google.android.material.textfield.TextInputLayout tlteacher) {
        return false;
    }
    
    private final void updateData(com.google.android.material.textfield.TextInputEditText tvteacher, com.google.android.material.textfield.TextInputEditText tvlocation, com.google.android.material.textfield.TextInputEditText tvname) {
    }
    
    private final void insertData(java.lang.String[] classSplit, com.google.android.material.textfield.TextInputEditText tvteacher, com.google.android.material.textfield.TextInputEditText tvlocation, com.google.android.material.textfield.TextInputEditText tvname) {
    }
    
    private final java.lang.String setNumberOfWeek() {
        return null;
    }
    
    private final void initAlertDialog() {
    }
    
    private final void setText(com.google.android.material.textfield.TextInputEditText tvteacher, com.google.android.material.textfield.TextInputEditText tvlocation, com.google.android.material.textfield.TextInputEditText tvname, java.lang.String[] classSplit) {
    }
    
    @java.lang.SuppressWarnings(value = {"all"})
    private final void initBtnAction(com.google.android.material.textfield.TextInputEditText tvteacher, com.google.android.material.textfield.TextInputEditText tvlocation, com.google.android.material.textfield.TextInputEditText tvname) {
    }
    
    public final void updateBtnBackgroundTintList() {
    }
    
    public ClassScheduleItemLongClickListener(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends top.huar.schedule.entity.ClassSchedule> classScheduleList, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    java.util.List<java.lang.String> copyList) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Ltop/huar/schedule/ui/adapter/ClassScheduleItemLongClickListener$Companion;", "", "()V", "COPY_SIZE", "", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}