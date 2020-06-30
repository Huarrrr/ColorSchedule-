package top.huar.schedule.util;

import java.lang.System;

/**
 * 课程表工具类
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0007H\u0003J\u0014\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u0018J\u0012\u0010\u001e\u001a\u00020\u001f2\b\b\u0001\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u001fH\u0002J \u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\'\u001a\u00020(H\u0002J\u0016\u0010)\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u0007J>\u0010+\u001a\u00020\u001f2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00182\b\b\u0001\u0010,\u001a\u00020(2\b\b\u0001\u0010\'\u001a\u00020(2\b\b\u0001\u0010-\u001a\u00020.2\b\b\u0001\u0010$\u001a\u00020%J\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H\u0007J4\u00100\u001a\u0002012\u0006\u0010\u001a\u001a\u00020\u00072\b\b\u0001\u00102\u001a\u00020\u00042\b\b\u0001\u0010 \u001a\u00020!2\u0006\u00103\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u0004H\u0003J \u00105\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%2\u0006\u00106\u001a\u00020\u00042\u0006\u0010,\u001a\u00020(H\u0002J\"\u00107\u001a\u0002012\b\b\u0001\u0010 \u001a\u00020!2\u0006\u00103\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u0004H\u0003J \u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00020=H\u0003J\u0010\u0010>\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\fH\u0003J\u0016\u0010?\u001a\u00020\u001f2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006C"}, d2 = {"Ltop/huar/schedule/util/ClassScheduleUtils;", "", "()V", "CLASS_WEEK", "", "COPY_LIST", "", "", "getCOPY_LIST", "()Ljava/util/List;", "ORDER_LIST", "Ljava/util/ArrayList;", "Ltop/huar/schedule/entity/ClassSchedule;", "SPARSE_ARRAY", "Landroid/util/SparseIntArray;", "TAG", "colorArray", "", "scheduleCount", "weekFont", "", "delNumberOfWeek", "classSchedule", "number", "", "getColor", "text", "haveClassAfterTime", "", "classScheduleList", "initColorArray", "", "context", "Landroid/content/Context;", "initFontSize", "initHeaderGridLayout", "activity", "Landroid/app/Activity;", "classSection", "headerGridLayout", "Landroidx/gridlayout/widget/GridLayout;", "isThisWeekOfClassSchedule", "nowWeekNum", "loadingView", "gridLayout", "clickListener", "Ltop/huar/schedule/ui/adapter/ClassScheduleItemLongClickListener;", "orderListBySection", "setClass", "Landroid/view/View;", "backgroundColor", "x", "y", "setFirstRow", "i", "setNull", "setParams", "Landroidx/gridlayout/widget/GridLayout$LayoutParams;", "row", "column", "size", "Landroid/graphics/Point;", "showText", "startForegroundServer", "service", "Landroid/app/Service;", "tag", "app_debug"})
public final class ClassScheduleUtils {
    private static final java.lang.String TAG = "ClassScheduleUtils";
    private static final int CLASS_WEEK = 7;
    private static float weekFont;
    private static final java.util.ArrayList<top.huar.schedule.entity.ClassSchedule> ORDER_LIST = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> COPY_LIST = null;
    
    /**
     * 颜色数组
     */
    private static final int[] colorArray = null;
    
    /**
     * 存储课程颜色
     */
    private static final android.util.SparseIntArray SPARSE_ARRAY = null;
    
    /**
     * 课程计数
     */
    private static int scheduleCount;
    public static final top.huar.schedule.util.ClassScheduleUtils INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getCOPY_LIST() {
        return null;
    }
    
    /**
     * 加载课程视图
     *
     * @param classScheduleList 课程
     * @param gridLayout        [GridLayout]
     * @param activity          [Activity]
     */
    public final void loadingView(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends top.huar.schedule.entity.ClassSchedule> classScheduleList, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    androidx.gridlayout.widget.GridLayout gridLayout, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    androidx.gridlayout.widget.GridLayout headerGridLayout, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    top.huar.schedule.ui.adapter.ClassScheduleItemLongClickListener clickListener, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.app.Activity activity) {
    }
    
    private final void initHeaderGridLayout(android.app.Activity activity, int classSection, androidx.gridlayout.widget.GridLayout headerGridLayout) {
    }
    
    /**
     * 设置第一列的信息
     * @param activity    上下文
     * @param i           行数索引
     * @param gridLayout  [GridLayout]
     */
    private final void setFirstRow(android.app.Activity activity, int i, androidx.gridlayout.widget.GridLayout gridLayout) {
    }
    
    /**
     * 设置单元格内容
     *
     * @param text            课程字符串
     * @param backgroundColor 背景颜色
     * @param context         [Context]
     * @param x               坐标
     * @param y               坐标
     * @return [View]
     */
    @androidx.annotation.CheckResult()
    private final android.view.View setClass(java.lang.String text, @androidx.annotation.ColorInt()
    int backgroundColor, @androidx.annotation.NonNull()
    android.content.Context context, int x, int y) {
        return null;
    }
    
    /**
     * 设置空课
     *
     * @param context [Context]
     * @param x       坐标
     * @param y       坐标
     * @return [View]
     */
    @androidx.annotation.CheckResult()
    private final android.view.View setNull(@androidx.annotation.NonNull()
    android.content.Context context, int x, int y) {
        return null;
    }
    
    /**
     * 设置单元格样式
     *
     * @param row    行
     * @param column 列
     * @param size   [Point]
     * @return [GridLayout.LayoutParams]
     */
    @androidx.annotation.CheckResult()
    private final androidx.gridlayout.widget.GridLayout.LayoutParams setParams(int row, int column, android.graphics.Point size) {
        return null;
    }
    
    /**
     * 初始化颜色数组
     *
     * @param context [Context]
     */
    private final void initColorArray(@androidx.annotation.NonNull()
    android.content.Context context) {
    }
    
    /**
     * 获取填充颜色<br></br>
     * 相同课程确保同一种颜色
     *
     * @param text 课程字符串
     * @return 颜色
     */
    @androidx.annotation.CheckResult()
    @androidx.annotation.ColorInt()
    private final int getColor(java.lang.String text) {
        return 0;
    }
    
    /**
     * 未来时间段内是否有课
     *
     * @param classScheduleList 课程列表
     * @return 有课返回true
     */
    public final boolean haveClassAfterTime(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends top.huar.schedule.entity.ClassSchedule> classScheduleList) {
        return false;
    }
    
    /**
     * 初始化字体大小
     */
    private final void initFontSize() {
    }
    
    /**
     * 格式化展示在TextView的文字
     *
     * @param classSchedule [ClassSchedule]
     * @return 格式化完的文字
     */
    @androidx.annotation.CheckResult()
    private final java.lang.String showText(top.huar.schedule.entity.ClassSchedule classSchedule) {
        return null;
    }
    
    /**
     * 重新将给定的课程集合排序<br></br>
     * 排序规则:当前正在上的课,课程节数
     *
     * @param classScheduleList 课程集合
     * @return 已排序课程集合
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.CheckResult()
    public final java.util.List<top.huar.schedule.entity.ClassSchedule> orderListBySection(@org.jetbrains.annotations.NotNull()
    java.util.List<top.huar.schedule.entity.ClassSchedule> classScheduleList) {
        return null;
    }
    
    public final boolean isThisWeekOfClassSchedule(@org.jetbrains.annotations.NotNull()
    top.huar.schedule.entity.ClassSchedule classSchedule, @org.jetbrains.annotations.NotNull()
    java.lang.String nowWeekNum) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String delNumberOfWeek(@org.jetbrains.annotations.NotNull()
    top.huar.schedule.entity.ClassSchedule classSchedule, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> number) {
        return null;
    }
    
    /**
     * 开启前台服务
     */
    public final void startForegroundServer(@org.jetbrains.annotations.NotNull()
    android.app.Service service, @org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    private ClassScheduleUtils() {
        super();
    }
}