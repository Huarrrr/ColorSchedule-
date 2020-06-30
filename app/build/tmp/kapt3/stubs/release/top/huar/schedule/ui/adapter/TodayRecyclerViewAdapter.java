package top.huar.schedule.ui.adapter;

import java.lang.System;

/**
 * 今天课程列表适配器
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001dB\u001f\u0012\u000e\b\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\rH\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\rH\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\rH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Ltop/huar/schedule/ui/adapter/TodayRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ltop/huar/schedule/ui/adapter/TodayRecyclerViewAdapter$ViewHolder;", "scheduleList", "", "Ltop/huar/schedule/entity/ClassSchedule;", "context", "Landroid/content/Context;", "(Ljava/util/List;Landroid/content/Context;)V", "colorArray", "", "showColorList", "Ljava/util/ArrayList;", "", "<set-?>", "Landroid/view/View;", "viewProgress", "getViewProgress", "()Landroid/view/View;", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ViewHolder", "app_release"})
public final class TodayRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<top.huar.schedule.ui.adapter.TodayRecyclerViewAdapter.ViewHolder> {
    
    /**
     * 颜色数组
     */
    private final int[] colorArray = null;
    
    /**
     * 随机好的颜色集合
     */
    private final java.util.ArrayList<java.lang.Integer> showColorList = null;
    @org.jetbrains.annotations.Nullable()
    private android.view.View viewProgress;
    
    /**
     * 列表数据集合
     */
    private final java.util.List<top.huar.schedule.entity.ClassSchedule> scheduleList = null;
    
    /**
     * [Context]
     */
    private final android.content.Context context = null;
    private static final java.lang.String TAG = "TodayRecyclerAdapter";
    public static final top.huar.schedule.ui.adapter.TodayRecyclerViewAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View getViewProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public top.huar.schedule.ui.adapter.TodayRecyclerViewAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    top.huar.schedule.ui.adapter.TodayRecyclerViewAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public TodayRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    java.util.List<? extends top.huar.schedule.entity.ClassSchedule> scheduleList, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\u001e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017\u00a8\u0006 "}, d2 = {"Ltop/huar/schedule/ui/adapter/TodayRecyclerViewAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "flNo", "Landroid/widget/FrameLayout;", "getFlNo", "()Landroid/widget/FrameLayout;", "round", "Ltop/huar/schedule/ui/view/RoundBackChange;", "getRound", "()Ltop/huar/schedule/ui/view/RoundBackChange;", "tvLocation", "Landroid/widget/TextView;", "getTvLocation", "()Landroid/widget/TextView;", "tvName", "getTvName", "tvTime", "getTvTime", "viewBottom", "getViewBottom", "()Landroid/view/View;", "viewCenter", "getViewCenter", "viewLeft", "getViewLeft", "viewProgress", "getViewProgress", "viewTop", "getViewTop", "app_release"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.view.View viewLeft = null;
        @org.jetbrains.annotations.NotNull()
        private final android.view.View viewTop = null;
        @org.jetbrains.annotations.NotNull()
        private final android.view.View viewBottom = null;
        @org.jetbrains.annotations.NotNull()
        private final android.view.View viewCenter = null;
        @org.jetbrains.annotations.NotNull()
        private final android.view.View viewProgress = null;
        @org.jetbrains.annotations.NotNull()
        private final top.huar.schedule.ui.view.RoundBackChange round = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.FrameLayout flNo = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvLocation = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvTime = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getViewLeft() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getViewTop() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getViewBottom() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getViewCenter() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getViewProgress() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final top.huar.schedule.ui.view.RoundBackChange getRound() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.FrameLayout getFlNo() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvLocation() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvTime() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ltop/huar/schedule/ui/adapter/TodayRecyclerViewAdapter$Companion;", "", "()V", "TAG", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}