package top.huar.schedule.util;

import java.lang.System;

/**
 * https://www.jianshu.com/p/10ed9ae02775
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\f"}, d2 = {"Ltop/huar/schedule/util/NetWorkUtils;", "", "()V", "getAPNType", "", "context", "Landroid/content/Context;", "getConnectedType", "isGPSEnabled", "", "isMobileConnected", "isNetworkConnected", "app_release"})
public final class NetWorkUtils {
    public static final top.huar.schedule.util.NetWorkUtils INSTANCE = null;
    
    /**
     * 判断是否有网络连接
     *
     * @param context [Context]
     * @return 有返回true
     */
    public final boolean isNetworkConnected(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * 判断WIFI网络是否可用
     *
     * @param context [Context]
     * @return 是否可用
     */
    public final boolean isMobileConnected(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * 获取当前网络连接的类型信息
     * 原生
     *
     * @param context [Context]
     * @return [ConnectivityManager]
     */
    public final int getConnectedType(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.content.Context context) {
        return 0;
    }
    
    /**
     * 获取当前的网络状态 ：没有网络-0：WIFI网络1：4G网络-4：3G网络-3：2G网络-2
     * 自定义
     *
     * @param context [Context]
     * @return 网络状态
     */
    public final int getAPNType(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.content.Context context) {
        return 0;
    }
    
    /**
     * 判断GPS是否打开
     * ACCESS_FINE_LOCATION权限
     *
     * @param context [Context]
     * @return 是否打开
     */
    public final boolean isGPSEnabled(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.content.Context context) {
        return false;
    }
    
    private NetWorkUtils() {
        super();
    }
}