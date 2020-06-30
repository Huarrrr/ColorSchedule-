package top.huar.schedule.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0015\u0012\u000e\b\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Ltop/huar/schedule/ui/adapter/ScoreRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ltop/huar/schedule/ui/adapter/ScoreRecyclerViewAdapter$ViewHolder;", "scoreList", "", "Ltop/huar/schedule/entity/Score;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class ScoreRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<top.huar.schedule.ui.adapter.ScoreRecyclerViewAdapter.ViewHolder> {
    private final java.util.List<top.huar.schedule.entity.Score> scoreList = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public top.huar.schedule.ui.adapter.ScoreRecyclerViewAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    top.huar.schedule.ui.adapter.ScoreRecyclerViewAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public ScoreRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    java.util.List<? extends top.huar.schedule.entity.Score> scoreList) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\b\u00a8\u0006\u0011"}, d2 = {"Ltop/huar/schedule/ui/adapter/ScoreRecyclerViewAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "tvCredit", "Landroidx/appcompat/widget/AppCompatTextView;", "getTvCredit", "()Landroidx/appcompat/widget/AppCompatTextView;", "tvGrade", "getTvGrade", "tvId", "getTvId", "tvName", "getTvName", "tvSemester", "getTvSemester", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final androidx.appcompat.widget.AppCompatTextView tvId = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.appcompat.widget.AppCompatTextView tvName = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.appcompat.widget.AppCompatTextView tvSemester = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.appcompat.widget.AppCompatTextView tvGrade = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.appcompat.widget.AppCompatTextView tvCredit = null;
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTvId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTvName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTvSemester() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTvGrade() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTvCredit() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}