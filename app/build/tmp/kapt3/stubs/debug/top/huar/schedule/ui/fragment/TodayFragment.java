package top.huar.schedule.ui.fragment;

import java.lang.System;

/**
 * 今天
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 02\u00020\u0001:\u000201B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u001aH\u0002J\u0012\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010\u00122\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010%\u001a\u00020\u001aH\u0016J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010\'\u001a\u00020(H\u0007J\b\u0010)\u001a\u00020\u001aH\u0016J\b\u0010*\u001a\u00020\u001aH\u0016J\u001a\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010-\u001a\u00020\u001aH\u0002J\b\u0010.\u001a\u00020\u001aH\u0002J\b\u0010/\u001a\u00020\u001aH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0018\u00010\u0007R\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00060\nR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Ltop/huar/schedule/ui/fragment/TodayFragment;", "Landroidx/fragment/app/Fragment;", "()V", "classScheduleList", "", "Ltop/huar/schedule/entity/ClassSchedule;", "courseInfoBinder", "Ltop/huar/schedule/service/CourseInfoService$CourseInfoBinder;", "Ltop/huar/schedule/service/CourseInfoService;", "courseInfoConnection", "Ltop/huar/schedule/ui/fragment/TodayFragment$CourseInfoConnection;", "finalIndex", "", "height", "lastClass", "mTop", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mView", "Landroid/view/View;", "needMoved", "", "stop", "todayRecyclerViewAdapter", "Ltop/huar/schedule/ui/adapter/TodayRecyclerViewAdapter;", "whichClassNow", "checkClassScheduleChange", "", "initClassScheduleListData", "nestedScrollViewOnScrollChangeListener", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onMessageEvent", "eventEntity", "Ltop/huar/schedule/entity/EventEntity;", "onStart", "onStop", "onViewCreated", "view", "setFinalIndex", "setPanelText", "setViewProgress", "Companion", "CourseInfoConnection", "app_debug"})
public final class TodayFragment extends androidx.fragment.app.Fragment {
    private android.view.View mView;
    
    /**
     * 课程集合
     */
    private java.util.List<top.huar.schedule.entity.ClassSchedule> classScheduleList;
    
    /**
     * 是否滑动到顶部
     */
    private java.util.concurrent.atomic.AtomicBoolean mTop;
    
    /**
     * 上次正在上的课程
     */
    private int lastClass;
    
    /**
     * [TodayRecyclerViewAdapter]
     */
    private top.huar.schedule.ui.adapter.TodayRecyclerViewAdapter todayRecyclerViewAdapter;
    
    /**
     * 滑动时移动的坐标
     */
    private int finalIndex;
    
    /**
     * 标记是否已经Stop
     */
    private boolean stop;
    
    /**
     * 当Start时是否需要移动元素
     */
    private boolean needMoved;
    
    /**
     * 当前正在上的课
     */
    private int whichClassNow;
    
    /**
     * 高度
     * 由于软键盘弹出影响高度测量,所以暂存
     */
    private int height;
    private top.huar.schedule.service.CourseInfoService.CourseInfoBinder courseInfoBinder;
    private final top.huar.schedule.ui.fragment.TodayFragment.CourseInfoConnection courseInfoConnection = null;
    private static final java.lang.String TAG = "TodayFragment";
    
    /**
     * 向上滑动的临界值
     */
    private static final int SLIDE_UP_THRESHOLD = 20;
    public static final top.huar.schedule.ui.fragment.TodayFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMessageEvent(@org.jetbrains.annotations.NotNull()
    top.huar.schedule.entity.EventEntity eventEntity) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * 滑动监听
     */
    private final void nestedScrollViewOnScrollChangeListener() {
    }
    
    /**
     * 初始化课程数据
     */
    private final void initClassScheduleListData() {
    }
    
    /**
     * 设置面板文字
     */
    private final void setPanelText() {
    }
    
    /**
     * 设置滑动索引
     */
    private final void setFinalIndex() {
    }
    
    /**
     * 更新进度
     */
    private final void setViewProgress() {
    }
    
    /**
     * 检查课程改变
     */
    private final void checkClassScheduleChange() {
    }
    
    public TodayFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\n"}, d2 = {"Ltop/huar/schedule/ui/fragment/TodayFragment$CourseInfoConnection;", "Landroid/content/ServiceConnection;", "(Ltop/huar/schedule/ui/fragment/TodayFragment;)V", "onServiceConnected", "", "name", "Landroid/content/ComponentName;", "service", "Landroid/os/IBinder;", "onServiceDisconnected", "app_debug"})
    public final class CourseInfoConnection implements android.content.ServiceConnection {
        
        @java.lang.Override()
        public void onServiceConnected(@org.jetbrains.annotations.NotNull()
        android.content.ComponentName name, @org.jetbrains.annotations.NotNull()
        android.os.IBinder service) {
        }
        
        @java.lang.Override()
        public void onServiceDisconnected(@org.jetbrains.annotations.NotNull()
        android.content.ComponentName name) {
        }
        
        public CourseInfoConnection() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Ltop/huar/schedule/ui/fragment/TodayFragment$Companion;", "", "()V", "SLIDE_UP_THRESHOLD", "", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}