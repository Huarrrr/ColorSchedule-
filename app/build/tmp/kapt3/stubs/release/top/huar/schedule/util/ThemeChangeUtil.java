package top.huar.schedule.util;

import java.lang.System;

/**
 * 主题更换工具类
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0015\u001a\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u0013J\u0012\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u0018H\u0007J\u0018\u0010\u0019\u001a\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bJ\u0012\u0010\u001c\u001a\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\u0002J+\u0010\u001d\u001a\u00020\u00102\b\b\u0001\u0010\u0017\u001a\u00020\u00182\u0014\b\u0001\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020 0\u001f\"\u00020 \u00a2\u0006\u0002\u0010!J\u001a\u0010\"\u001a\u00020\u00102\b\b\u0001\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010#\u001a\u00020 J\u001a\u0010$\u001a\u00020\u00102\b\b\u0001\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010%\u001a\u00020&J+\u0010\'\u001a\u00020\u00102\b\b\u0001\u0010\u0017\u001a\u00020\u00182\u0014\b\u0001\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020)0\u001f\"\u00020)\u00a2\u0006\u0002\u0010*J\u0010\u0010+\u001a\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006,"}, d2 = {"Ltop/huar/schedule/util/ThemeChangeUtil;", "", "()V", "TAG", "", "defaultColorAccent", "", "defaultColorPrimary", "defaultColorPrimaryDark", "defaultColorProgress", "isChange", "", "()Z", "setChange", "(Z)V", "changeColor", "", "changeMainActivityTheme", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "changeNightMode", "changeTheme", "getNowThemeColorAccent", "context", "Landroid/content/Context;", "initColor", "drawerLayout", "Landroidx/drawerlayout/widget/DrawerLayout;", "initDefaultColor", "setBackgroundResources", "views", "", "Landroid/view/View;", "(Landroid/content/Context;[Landroid/view/View;)V", "setProgressBackgroundResource", "view", "setTabLayoutColor", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "setTextViewsColorByTheme", "textViews", "Landroid/widget/TextView;", "(Landroid/content/Context;[Landroid/widget/TextView;)V", "simpleSetTheme", "app_release"})
public final class ThemeChangeUtil {
    private static final java.lang.String TAG = "ThemeChangeUtil";
    private static boolean isChange;
    private static int defaultColorPrimary;
    private static int defaultColorPrimaryDark;
    private static int defaultColorAccent;
    private static int defaultColorProgress;
    public static final top.huar.schedule.util.ThemeChangeUtil INSTANCE = null;
    
    public final boolean isChange() {
        return false;
    }
    
    public final void setChange(boolean p0) {
    }
    
    /**
     * 更换夜间模式
     *
     * @param activity [AppCompatActivity]
     */
    public final synchronized void changeNightMode(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    androidx.appcompat.app.AppCompatActivity activity) {
    }
    
    /**
     * 更新颜色事件
     */
    public final synchronized void changeColor() {
    }
    
    /**
     * 初始化有DrawerLayout的Activity的颜色
     *
     * @param activity     [AppCompatActivity]
     * @param drawerLayout [DrawerLayout]
     */
    public final void initColor(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.NotNull()
    androidx.drawerlayout.widget.DrawerLayout drawerLayout) {
    }
    
    /**
     * 更新主Activity主题
     *
     * @param activity [AppCompatActivity]
     */
    public final void changeMainActivityTheme(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    androidx.appcompat.app.AppCompatActivity activity) {
    }
    
    /**
     * 简单设置主题
     *
     * @param activity [AppCompatActivity]
     */
    public final void simpleSetTheme(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    androidx.appcompat.app.AppCompatActivity activity) {
    }
    
    /**
     * 初始化默认颜色
     *
     * @param activity [AppCompatActivity]
     */
    private final void initDefaultColor(@androidx.annotation.NonNull()
    androidx.appcompat.app.AppCompatActivity activity) {
    }
    
    /**
     * 更新设置页面主题
     *
     * @param activity [AppCompatActivity]
     */
    public final void changeTheme(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    androidx.appcompat.app.AppCompatActivity activity) {
    }
    
    /**
     * 设置TabLayout颜色
     *
     * @param context   [Context]
     * @param tabLayout [TabLayout]
     */
    public final void setTabLayoutColor(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    com.google.android.material.tabs.TabLayout tabLayout) {
    }
    
    /**
     * 设置背景Resource
     *
     * @param context [Context]
     * @param views   [View]
     */
    public final void setBackgroundResources(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.view.View... views) {
    }
    
    /**
     * 设置进度条颜色
     *
     * @param context [Context]
     * @param view    [View]
     */
    public final void setProgressBackgroundResource(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.view.View view) {
    }
    
    /**
     * 获取当前强调色颜色
     *
     * @param context [Context]
     * @return 颜色数值
     */
    @androidx.annotation.ColorInt()
    @androidx.annotation.CheckResult()
    public final int getNowThemeColorAccent(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.content.Context context) {
        return 0;
    }
    
    /**
     * 设置TextView 颜色
     *
     * @param context   [Context]
     * @param textViews [TextView]
     */
    public final void setTextViewsColorByTheme(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.widget.TextView... textViews) {
    }
    
    private ThemeChangeUtil() {
        super();
    }
}