package top.huar.schedule.ui.activity;

import java.lang.System;

/**
 * 课程表分享活动
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\u0014\u0010\u000f\u001a\u00020\u00042\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0004H\u0014J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0017J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0002\u00a8\u0006\u001c"}, d2 = {"Ltop/huar/schedule/ui/activity/ShareActivity;", "Ltop/huar/schedule/common/BaseActivity;", "()V", "doExportFile", "", "data", "Landroid/content/Intent;", "doImportFile", "exportFile", "importFile", "initView", "onActivityResult", "requestCode", "", "resultCode", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onMessageEvent", "eventEntity", "Ltop/huar/schedule/entity/EventEntity;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "shareFile", "Companion", "app_debug"})
public final class ShareActivity extends top.huar.schedule.common.BaseActivity {
    private static final java.lang.String TAG = "ShareActivity";
    public static final int FILE_SELECT_CODE = 1;
    private static final int WRITE_REQUEST_CODE = 2;
    public static final top.huar.schedule.ui.activity.ShareActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * 初始化视图
     */
    private final void initView() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onMessageEvent(@org.jetbrains.annotations.NotNull()
    top.huar.schedule.entity.EventEntity eventEntity) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    /**
     * 分享课程数据文件
     */
    private final void shareFile() {
    }
    
    /**
     * 导出文件
     */
    private final void exportFile() {
    }
    
    /**
     * 导入文件
     */
    private final void importFile() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    /**
     * 导出文件
     *
     * @param data [Intent]
     */
    private final void doExportFile(android.content.Intent data) {
    }
    
    /**
     * 导入文件
     *
     * @param data [Intent]
     */
    private final void doImportFile(android.content.Intent data) {
    }
    
    public ShareActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Ltop/huar/schedule/ui/activity/ShareActivity$Companion;", "", "()V", "FILE_SELECT_CODE", "", "TAG", "", "WRITE_REQUEST_CODE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}