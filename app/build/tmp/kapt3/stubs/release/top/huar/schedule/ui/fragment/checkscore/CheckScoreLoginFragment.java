package top.huar.schedule.ui.fragment.checkscore;

import java.lang.System;

/**
 * 登陆
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 >2\u00020\u0001:\u0002>?B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\bH\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0003J\u0012\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010&\u001a\u00020\u0014H\u0016J\b\u0010\'\u001a\u00020\u0014H\u0002J\u0017\u0010(\u001a\u00020\u00142\b\u0010)\u001a\u0004\u0018\u00010*H\u0007\u00a2\u0006\u0002\u0010+J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010,\u001a\u00020-H\u0007J\b\u0010.\u001a\u00020\u0014H\u0016J\b\u0010/\u001a\u00020\u0014H\u0016J\u001a\u00100\u001a\u00020\u00142\u0006\u00101\u001a\u00020!2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J0\u00102\u001a\u00020\u00142\u0006\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\b2\u0006\u00105\u001a\u00020\b2\u0006\u00106\u001a\u00020\b2\u0006\u00107\u001a\u000208H\u0002J\u0012\u00109\u001a\u00020\b2\b\b\u0001\u0010:\u001a\u00020\u0006H\u0003J\b\u0010;\u001a\u00020\u0014H\u0002J*\u0010<\u001a\u00020\u00142\b\b\u0001\u0010=\u001a\u00020\b2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0018\u00010\fR\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006@"}, d2 = {"Ltop/huar/schedule/ui/fragment/checkscore/CheckScoreLoginFragment;", "Landroidx/fragment/app/Fragment;", "()V", "alertDialog", "Landroidx/appcompat/app/AlertDialog;", "bitmap", "Landroid/graphics/Bitmap;", "code", "", "cookies", "", "gpsAndWifiStatusReceiver", "Ltop/huar/schedule/ui/fragment/checkscore/CheckScoreLoginFragment$GpsAndWifiStatusReceiver;", "id", "name", "progressDialog", "Landroid/app/ProgressDialog;", "wifiMgr", "Landroid/net/wifi/WifiManager;", "doInsert", "", "hash", "getCookieAndImg", "initLibData", "insert", "assets", "Landroid/content/res/AssetManager;", "netStatusOk", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onLoginBtnClicked", "onMessageEvent", "type", "", "(Ljava/lang/Integer;)V", "eventEntity", "Ltop/huar/schedule/entity/EventEntity;", "onPause", "onResume", "onViewCreated", "view", "showAlert", "title", "message", "positiveButtonStr", "negativeButtonStr", "listener", "Landroid/content/DialogInterface$OnClickListener;", "startCompared", "sourceBitmap", "startConnectionServer", "startLogin", "verifyCode", "Companion", "GpsAndWifiStatusReceiver", "app_release"})
public final class CheckScoreLoginFragment extends androidx.fragment.app.Fragment {
    private java.util.Map<java.lang.String, java.lang.String> cookies;
    private java.lang.String name;
    private java.lang.String id;
    private android.app.ProgressDialog progressDialog;
    private java.lang.String code;
    private android.graphics.Bitmap bitmap;
    private android.net.wifi.WifiManager wifiMgr;
    private androidx.appcompat.app.AlertDialog alertDialog;
    private top.huar.schedule.ui.fragment.checkscore.CheckScoreLoginFragment.GpsAndWifiStatusReceiver gpsAndWifiStatusReceiver;
    private static final java.lang.String TAG = "CheckScoreLoginFragment";
    private static final int NUMBER_OF_COPIES = 6;
    private static final int END_NUMBER = 9;
    private static final int START_ASCII = 97;
    private static final int END_ASCII = 122;
    private static final java.lang.String WIFI_NAME = "\"HXGNET\"";
    private static final java.lang.String UNKNOWN_SSID = "<unknown ssid>";
    private static final java.lang.String CODE_ERROR_STR = "\u9a8c\u8bc1\u7801\u6709\u8bef";
    private static final java.lang.String NAME_ERROR_STR = "\u4f60\u7684\u7528\u6237\u540d\u4e0d\u5b58\u5728";
    private static final java.lang.String PWD_ERROR_STR = "\u5bc6\u7801\u4e0d\u6b63\u786e";
    private static final java.lang.String REMEMBER_ID = "remember_id";
    private static final java.lang.String REMEMBER_NAME = "remember_name";
    private static final java.lang.String REMEMBER_STATUS = "remember_id_name";
    public static final top.huar.schedule.ui.fragment.checkscore.CheckScoreLoginFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.BACKGROUND)
    public final void onMessageEvent(@org.jetbrains.annotations.Nullable()
    java.lang.Integer type) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMessageEvent(@org.jetbrains.annotations.NotNull()
    top.huar.schedule.entity.EventEntity eventEntity) {
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
     * 开始连接服务器
     */
    private final void startConnectionServer() {
    }
    
    /**
     * 检查所需网络环境是否满足
     *
     * @return 满足返回真
     */
    @androidx.annotation.CheckResult()
    private final boolean netStatusOk() {
        return false;
    }
    
    /**
     * 显示Dialog
     */
    private final void showAlert(java.lang.String title, java.lang.String message, java.lang.String positiveButtonStr, java.lang.String negativeButtonStr, android.content.DialogInterface.OnClickListener listener) {
    }
    
    /**
     * 开始裁剪图片并进行比对
     *
     * @param sourceBitmap [Bitmap]
     * @return 对比出来的字符
     */
    @androidx.annotation.CheckResult()
    private final java.lang.String startCompared(@androidx.annotation.NonNull()
    android.graphics.Bitmap sourceBitmap) {
        return null;
    }
    
    /**
     * 初始化数据库数据
     */
    private final void initLibData() {
    }
    
    /**
     * 插入字符
     *
     * @param assets [AssetManager]
     */
    private final void insert(android.content.res.AssetManager assets) {
    }
    
    /**
     * 将数据插入到数据库
     *
     * @param hash 指纹
     * @param name 对应字符
     */
    private final void doInsert(@androidx.annotation.NonNull()
    java.lang.String hash, @androidx.annotation.NonNull()
    java.lang.String name) {
    }
    
    /**
     * 获取Cookie和验证码
     */
    private final void getCookieAndImg() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    /**
     * 开始登陆
     *
     * @param verifyCode 验证码
     * @param name       姓名
     * @param id         学号
     * @throws IOException IOException
     */
    private final void startLogin(@androidx.annotation.NonNull()
    java.lang.String verifyCode, @androidx.annotation.NonNull()
    java.lang.String name, @androidx.annotation.NonNull()
    java.lang.String id) throws java.io.IOException {
    }
    
    private final void onLoginBtnClicked() {
    }
    
    public CheckScoreLoginFragment() {
        super();
    }
    
    /**
     * GPS and Wifi Status Change Receiver
     *
     * @author itning
     */
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Ltop/huar/schedule/ui/fragment/checkscore/CheckScoreLoginFragment$GpsAndWifiStatusReceiver;", "Landroid/content/BroadcastReceiver;", "(Ltop/huar/schedule/ui/fragment/checkscore/CheckScoreLoginFragment;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_release"})
    final class GpsAndWifiStatusReceiver extends android.content.BroadcastReceiver {
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
        }
        
        public GpsAndWifiStatusReceiver() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Ltop/huar/schedule/ui/fragment/checkscore/CheckScoreLoginFragment$Companion;", "", "()V", "CODE_ERROR_STR", "", "END_ASCII", "", "END_NUMBER", "NAME_ERROR_STR", "NUMBER_OF_COPIES", "PWD_ERROR_STR", "REMEMBER_ID", "REMEMBER_NAME", "REMEMBER_STATUS", "START_ASCII", "TAG", "UNKNOWN_SSID", "WIFI_NAME", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}