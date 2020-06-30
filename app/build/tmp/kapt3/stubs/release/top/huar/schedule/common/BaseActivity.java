package top.huar.schedule.common;

import java.lang.System;

/**
 * Base App Activity
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0014\u0010\u000f\u001a\u00020\u000e2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H&R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Ltop/huar/schedule/common/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "messageClient", "Lcom/heytap/wearable/oms/MessageClient;", "node", "Lcom/heytap/wearable/oms/Node;", "nodeClient", "Lcom/heytap/wearable/oms/NodeClient;", "onMessageReceivedListener", "Lcom/heytap/wearable/oms/MessageClient$OnMessageReceivedListener;", "onNodeChangedListener", "Lcom/heytap/wearable/oms/NodeClient$OnNodeChangedListener;", "initWearable", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onMessageEvent", "eventEntity", "Ltop/huar/schedule/entity/EventEntity;", "Companion", "app_release"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    
    /**
     * 节点管理器
     */
    private com.heytap.wearable.oms.NodeClient nodeClient;
    
    /**
     * 信息管理器
     */
    private com.heytap.wearable.oms.MessageClient messageClient;
    
    /**
     * 点前连接的节点
     */
    private com.heytap.wearable.oms.Node node;
    
    /**
     * 节点监听器
     */
    private com.heytap.wearable.oms.NodeClient.OnNodeChangedListener onNodeChangedListener;
    
    /**
     * 信息监听器
     */
    private com.heytap.wearable.oms.MessageClient.OnMessageReceivedListener onMessageReceivedListener;
    private static final java.lang.String STRING_NULL = "NULL";
    public static final top.huar.schedule.common.BaseActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initWearable() {
    }
    
    /**
     * 消息事件
     *
     * @param eventEntity what
     */
    public abstract void onMessageEvent(@org.jetbrains.annotations.NotNull()
    top.huar.schedule.entity.EventEntity eventEntity);
    
    public BaseActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ltop/huar/schedule/common/BaseActivity$Companion;", "", "()V", "STRING_NULL", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}