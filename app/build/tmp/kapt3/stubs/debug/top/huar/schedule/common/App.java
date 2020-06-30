package top.huar.schedule.common;

import java.lang.System;

/**
 * 应用基类
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Ltop/huar/schedule/common/App;", "Landroid/app/Application;", "()V", "daoSession", "Ltop/huar/schedule/entity/DaoSession;", "getDaoSession", "()Ltop/huar/schedule/entity/DaoSession;", "setDaoSession", "(Ltop/huar/schedule/entity/DaoSession;)V", "onConfigurationChanged", "", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "onLowMemory", "onTerminate", "onTrimMemory", "level", "", "Companion", "app_debug"})
public final class App extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public top.huar.schedule.entity.DaoSession daoSession;
    private static final java.lang.String TAG = "App";
    @org.jetbrains.annotations.NotNull()
    public static android.content.SharedPreferences sharedPreferences;
    public static final top.huar.schedule.common.App.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final top.huar.schedule.entity.DaoSession getDaoSession() {
        return null;
    }
    
    public final void setDaoSession(@org.jetbrains.annotations.NotNull()
    top.huar.schedule.entity.DaoSession p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onTerminate() {
    }
    
    @java.lang.Override()
    public void onLowMemory() {
    }
    
    @java.lang.Override()
    public void onTrimMemory(int level) {
    }
    
    @java.lang.Override()
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration newConfig) {
    }
    
    public App() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Ltop/huar/schedule/common/App$Companion;", "", "()V", "TAG", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.SharedPreferences getSharedPreferences() {
            return null;
        }
        
        public final void setSharedPreferences(@org.jetbrains.annotations.NotNull()
        android.content.SharedPreferences p0) {
        }
        
        private Companion() {
            super();
        }
    }
}