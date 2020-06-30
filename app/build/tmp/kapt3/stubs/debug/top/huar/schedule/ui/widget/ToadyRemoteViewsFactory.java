package top.huar.schedule.ui.widget;

import java.lang.System;

/**
 * 适配器工厂
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 )2\u00020\u0001:\u0001)B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001b\u001a\u00020\u000eH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000eH\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001e\u001a\u00020\u000eH\u0016J\b\u0010\"\u001a\u00020\u000eH\u0016J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020&H\u0016J\b\u0010\'\u001a\u00020&H\u0016J\b\u0010(\u001a\u00020&H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012\u00a8\u0006*"}, d2 = {"Ltop/huar/schedule/ui/widget/ToadyRemoteViewsFactory;", "Landroid/widget/RemoteViewsService$RemoteViewsFactory;", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "(Landroid/content/Context;Landroid/content/Intent;)V", "colorArray", "", "getContext", "()Landroid/content/Context;", "daoSession", "Ltop/huar/schedule/entity/DaoSession;", "height", "", "getHeight", "()I", "setHeight", "(I)V", "getIntent", "()Landroid/content/Intent;", "orderListBySection", "", "Ltop/huar/schedule/entity/ClassSchedule;", "width", "getWidth", "setWidth", "getCount", "getItemId", "", "position", "getLoadingView", "Landroid/widget/RemoteViews;", "getViewAt", "getViewTypeCount", "hasStableIds", "", "onCreate", "", "onDataSetChanged", "onDestroy", "Companion", "app_debug"})
public final class ToadyRemoteViewsFactory implements android.widget.RemoteViewsService.RemoteViewsFactory {
    private java.util.List<top.huar.schedule.entity.ClassSchedule> orderListBySection;
    private int width;
    private int height;
    private final top.huar.schedule.entity.DaoSession daoSession = null;
    private final int[] colorArray = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.Nullable()
    private final android.content.Intent intent = null;
    private static final java.lang.String TAG = "ToadyRemoteViewsFactory";
    public static final top.huar.schedule.ui.widget.ToadyRemoteViewsFactory.Companion Companion = null;
    
    public final int getWidth() {
        return 0;
    }
    
    public final void setWidth(int p0) {
    }
    
    public final int getHeight() {
        return 0;
    }
    
    public final void setHeight(int p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onDataSetChanged() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.widget.RemoteViews getViewAt(int position) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.widget.RemoteViews getLoadingView() {
        return null;
    }
    
    @java.lang.Override()
    public int getViewTypeCount() {
        return 0;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override()
    public boolean hasStableIds() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Intent getIntent() {
        return null;
    }
    
    public ToadyRemoteViewsFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ltop/huar/schedule/ui/widget/ToadyRemoteViewsFactory$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}