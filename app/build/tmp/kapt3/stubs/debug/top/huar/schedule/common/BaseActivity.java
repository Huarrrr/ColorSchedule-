package top.huar.schedule.common;

import java.lang.System;

/**
 * Base App Activity
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Ltop/huar/schedule/common/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onMessageEvent", "eventEntity", "Ltop/huar/schedule/entity/EventEntity;", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    android.os.Bundle savedInstanceState) {
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
}