package top.huar.schedule.util;

import java.lang.System;

/**
 * 时间工具
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001cJ\u001e\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00162\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0012H\u0007J\u0018\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000bH\u0007J \u0010&\u001a\u00020\u000f2\u0006\u0010\'\u001a\u00020$2\u0006\u0010(\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0007J\"\u0010)\u001a\u00020\u000f2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b0+2\u0006\u0010,\u001a\u00020-J\u001a\u0010.\u001a\u00020\u000f2\b\u0010/\u001a\u0004\u0018\u00010\u000b2\u0006\u00100\u001a\u00020\u000bH\u0003J\u0018\u00101\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000bH\u0003J\u0006\u00102\u001a\u000203J \u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u00162\u0006\u0010,\u001a\u00020-H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f8G\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00128G\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00168G\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00168G\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018\u00a8\u00067"}, d2 = {"Ltop/huar/schedule/util/DateUtils;", "", "()V", "CAL", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "DF", "Ljava/text/SimpleDateFormat;", "getDF", "()Ljava/text/SimpleDateFormat;", "TAG", "", "TIME_LIST", "Ljava/util/ArrayList;", "isNewDay", "", "()Z", "timeList", "", "getTimeList", "()Ljava/util/List;", "week", "", "getWeek", "()I", "whichClassNow", "getWhichClassNow", "getNextMondayOfTimeInMillis", "", "currentTimeMillis", "getNowProgress", "max", "classScheduleList", "Ltop/huar/schedule/entity/ClassSchedule;", "getTheRestOfTheTime", "startTime", "Ljava/util/Date;", "endTime", "isBelongCalendar", "nowTime", "beginTime", "isDataLegitimate", "timeMap", "Ljava/util/TreeMap;", "context", "Landroid/content/Context;", "isInDateInterval", "start", "end", "isTimeIintervalLegitimate", "refreshTimeList", "", "showTimeErrorDialog", "whichClass", "type", "app_release"})
public final class DateUtils {
    private static final java.lang.String TAG = "DateUtils";
    @org.jetbrains.annotations.NotNull()
    private static final java.text.SimpleDateFormat DF = null;
    private static final java.util.ArrayList<java.lang.String> TIME_LIST = null;
    private static final java.util.Calendar CAL = null;
    public static final top.huar.schedule.util.DateUtils INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.text.SimpleDateFormat getDF() {
        return null;
    }
    
    @androidx.annotation.CheckResult()
    public final int getWhichClassNow() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.CheckResult()
    public final java.util.List<java.lang.String> getTimeList() {
        return null;
    }
    
    @androidx.annotation.CheckResult()
    public final int getWeek() {
        return 0;
    }
    
    @androidx.annotation.CheckResult()
    public final boolean isNewDay() {
        return false;
    }
    
    /**
     * 获取上课进度
     *
     * @param max               最大进度
     * @param classScheduleList 课程集合
     * @return 当前进度
     */
    @androidx.annotation.CheckResult()
    public final int getNowProgress(int max, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends top.huar.schedule.entity.ClassSchedule> classScheduleList) {
        return 0;
    }
    
    /**
     * 刷新时间数据集合
     */
    public final void refreshTimeList() {
    }
    
    @androidx.annotation.CheckResult()
    public final int getTheRestOfTheTime(@org.jetbrains.annotations.NotNull()
    java.util.Date startTime, @org.jetbrains.annotations.NotNull()
    java.lang.String endTime) {
        return 0;
    }
    
    /**
     * 检查当前时间是否在给定的开始结束时间内
     *
     * @param start 开始时间
     * @param end   结束时间
     * @return 在返回true
     */
    @androidx.annotation.CheckResult()
    private final boolean isInDateInterval(java.lang.String start, java.lang.String end) {
        return false;
    }
    
    /**
     * 判断时间是否在时间段内
     *
     * @param nowTime   现在
     * @param beginTime 开始
     * @param endTime   结束
     * @return 是返回True
     */
    @androidx.annotation.CheckResult()
    public final boolean isBelongCalendar(@org.jetbrains.annotations.NotNull()
    java.util.Date nowTime, @org.jetbrains.annotations.NotNull()
    java.util.Date beginTime, @org.jetbrains.annotations.NotNull()
    java.util.Date endTime) {
        return false;
    }
    
    /**
     * 时间区间合法
     *
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @return 不合法返回真
     */
    @androidx.annotation.CheckResult()
    private final boolean isTimeIintervalLegitimate(java.lang.String startTime, java.lang.String endTime) {
        return false;
    }
    
    /**
     * 数据合法性检查
     *
     * @return 合法返回真
     */
    public final boolean isDataLegitimate(@org.jetbrains.annotations.NotNull()
    java.util.TreeMap<java.lang.Integer, java.lang.String> timeMap, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * 显示错误Dialog
     *
     * @param whichClass 哪节课
     * @param type       类型
     */
    private final void showTimeErrorDialog(java.lang.String whichClass, int type, android.content.Context context) {
    }
    
    /**
     * 获取下周星期一的时间毫秒数
     */
    public final long getNextMondayOfTimeInMillis(long currentTimeMillis) {
        return 0L;
    }
    
    private DateUtils() {
        super();
    }
}