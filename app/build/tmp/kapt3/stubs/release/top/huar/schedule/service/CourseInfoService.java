package top.huar.schedule.service;

import java.lang.System;

/**
 * 课程信息服务
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0002=>B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020 H\u0002J\u0012\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020 H\u0016J\b\u0010\'\u001a\u00020 H\u0016J\u0010\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020*H\u0007J\u0018\u0010+\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\nH\u0016J \u0010-\u001a\u00020.2\u0006\u0010$\u001a\u00020%2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.H\u0016J\u0010\u00101\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%H\u0016J@\u00102\u001a\u00020 2\u000e\b\u0001\u00103\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u00104\u001a\u00020\n2\b\b\u0001\u00105\u001a\u00020\n2\b\b\u0001\u00106\u001a\u00020\n2\b\b\u0001\u00107\u001a\u00020\nH\u0002J\u0018\u00108\u001a\u00020 2\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0018\u00109\u001a\u00020 2\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0018\u0010:\u001a\u00020 2\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0018\u0010;\u001a\u00020 2\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\b\u0010<\u001a\u00020 H\u0002R\u0014\u0010\u0004\u001a\u00020\u00058CX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8CX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108CX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00108CX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00108CX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00108CX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00108CX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8CX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006?"}, d2 = {"Ltop/huar/schedule/service/CourseInfoService;", "Landroid/app/Service;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "()V", "classScheduleDao", "Ltop/huar/schedule/entity/ClassScheduleDao;", "getClassScheduleDao", "()Ltop/huar/schedule/entity/ClassScheduleDao;", "courseArray", "Landroid/util/SparseArray;", "", "daoSession", "Ltop/huar/schedule/entity/DaoSession;", "getDaoSession", "()Ltop/huar/schedule/entity/DaoSession;", "isAfterTheLastCourse", "", "()Z", "isBeforeTheFirstCourse", "isHaveCourseThisDay", "isHaveNextCourse", "isInAnyCourses", "nowDate", "Ljava/util/Date;", "sharedPreferences", "Landroid/content/SharedPreferences;", "soredClassSchedules", "", "Ltop/huar/schedule/entity/ClassSchedule;", "getSoredClassSchedules", "()Ljava/util/List;", "getDate", "", "getNowCourseInfoArray", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "onMessageEvent", "eventEntity", "Ltop/huar/schedule/entity/EventEntity;", "onSharedPreferenceChanged", "key", "onStartCommand", "", "flags", "startId", "onUnbind", "putStr2Map", "targetArray", "line1", "line2", "line3", "line4", "setFirstCourseInfo2Map", "setFreeCourseInfo2Map", "setInNextCourseAndTime2Map", "setLastCourse2Map", "setNotificationContentsIfOpen", "Companion", "CourseInfoBinder", "app_release"})
public final class CourseInfoService extends android.app.Service implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    private android.content.SharedPreferences sharedPreferences;
    private java.util.Date nowDate;
    private final android.util.SparseArray<java.lang.String> courseArray = null;
    private static final java.lang.String TAG = "CourseInfoService";
    private static final java.lang.String NO_COURSE_DATA = "\u6ca1\u6709\u8bfe\u7a0b\u6570\u636e";
    public static final top.huar.schedule.service.CourseInfoService.Companion Companion = null;
    
    @androidx.annotation.CheckResult()
    private final boolean isHaveCourseThisDay() {
        return false;
    }
    
    @androidx.annotation.CheckResult()
    private final boolean isBeforeTheFirstCourse() throws java.text.ParseException {
        return false;
    }
    
    @androidx.annotation.CheckResult()
    private final boolean isAfterTheLastCourse() throws java.text.ParseException {
        return false;
    }
    
    @androidx.annotation.CheckResult()
    private final boolean isHaveNextCourse() throws java.text.ParseException {
        return false;
    }
    
    @androidx.annotation.CheckResult()
    private final boolean isInAnyCourses() throws java.text.ParseException {
        return false;
    }
    
    @androidx.annotation.CheckResult()
    @androidx.annotation.NonNull()
    private final java.util.List<top.huar.schedule.entity.ClassSchedule> getSoredClassSchedules() {
        return null;
    }
    
    @androidx.annotation.CheckResult()
    private final top.huar.schedule.entity.DaoSession getDaoSession() {
        return null;
    }
    
    @androidx.annotation.CheckResult()
    private final top.huar.schedule.entity.ClassScheduleDao getClassScheduleDao() {
        return null;
    }
    
    private final synchronized void getDate() {
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
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override()
    public boolean onUnbind(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return false;
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMessageEvent(@org.jetbrains.annotations.NotNull()
    top.huar.schedule.entity.EventEntity eventEntity) {
    }
    
    /**
     * 获取现在的课程信息
     */
    private final synchronized void getNowCourseInfoArray() {
    }
    
    /**
     * 设置第一节课信息
     *
     * @param courseArray 课程Array
     */
    private final void setFirstCourseInfo2Map(@androidx.annotation.NonNull()
    android.util.SparseArray<java.lang.String> courseArray) {
    }
    
    /**
     * 设置下节有课的Map数据
     *
     * @param courseArray 课程Array
     * @throws ParseException ParseException
     */
    private final void setInNextCourseAndTime2Map(@androidx.annotation.NonNull()
    android.util.SparseArray<java.lang.String> courseArray) {
    }
    
    /**
     * 设置下课时间,当前是最后一节课
     *
     * @param courseArray 课程Array
     */
    private final void setLastCourse2Map(@androidx.annotation.NonNull()
    android.util.SparseArray<java.lang.String> courseArray) {
    }
    
    /**
     * 设置课间
     *
     * @param courseArray 课程Array
     */
    private final void setFreeCourseInfo2Map(@androidx.annotation.NonNull()
    android.util.SparseArray<java.lang.String> courseArray) {
    }
    
    /**
     * 将字符串存入Array中
     *
     * @param targetArray 要存入的Array
     * @param line1       String
     * @param line2       String
     * @param line3       String
     * @param line4       String
     */
    private final void putStr2Map(@androidx.annotation.NonNull()
    android.util.SparseArray<java.lang.String> targetArray, @androidx.annotation.NonNull()
    java.lang.String line1, @androidx.annotation.NonNull()
    java.lang.String line2, @androidx.annotation.NonNull()
    java.lang.String line3, @androidx.annotation.NonNull()
    java.lang.String line4) {
    }
    
    /**
     * 开启前台服务
     */
    private final void setNotificationContentsIfOpen() {
    }
    
    @java.lang.Override()
    public void onSharedPreferenceChanged(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    public CourseInfoService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Ltop/huar/schedule/service/CourseInfoService$CourseInfoBinder;", "Landroid/os/Binder;", "(Ltop/huar/schedule/service/CourseInfoService;)V", "nowCourseInfo", "Landroid/util/SparseArray;", "", "getNowCourseInfo", "()Landroid/util/SparseArray;", "app_release"})
    public final class CourseInfoBinder extends android.os.Binder {
        
        @org.jetbrains.annotations.NotNull()
        public final android.util.SparseArray<java.lang.String> getNowCourseInfo() {
            return null;
        }
        
        public CourseInfoBinder() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Ltop/huar/schedule/service/CourseInfoService$Companion;", "", "()V", "NO_COURSE_DATA", "", "TAG", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}