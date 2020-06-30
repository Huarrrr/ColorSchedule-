package top.huar.schedule.ui.fragment.setting;

import java.lang.System;

/**
 * 设置Fragment
 *
 * @author itning
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001c\u0010\u0015\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0016J\u0018\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Ltop/huar/schedule/ui/fragment/setting/SettingsFragment;", "Landroidx/preference/PreferenceFragmentCompat;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "()V", "classReminderDownTime", "Landroidx/preference/ListPreference;", "classReminderUpTime", "defaultShowMainFragmentListPreference", "nowWeekNumEditTextPreference", "Landroidx/preference/EditTextPreference;", "phoneMuteAfterTime", "phoneMuteBeforeTime", "prefs", "Landroid/content/SharedPreferences;", "total", "", "totalWeekNumEditTextPreference", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreatePreferences", "rootKey", "", "onDestroyView", "onSharedPreferenceChanged", "sharedPreferences", "key", "Companion", "app_debug"})
public final class SettingsFragment extends androidx.preference.PreferenceFragmentCompat implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    private android.content.SharedPreferences prefs;
    private androidx.preference.ListPreference defaultShowMainFragmentListPreference;
    private androidx.preference.ListPreference classReminderUpTime;
    private androidx.preference.ListPreference classReminderDownTime;
    private androidx.preference.ListPreference phoneMuteBeforeTime;
    private androidx.preference.ListPreference phoneMuteAfterTime;
    private androidx.preference.EditTextPreference nowWeekNumEditTextPreference;
    private androidx.preference.EditTextPreference totalWeekNumEditTextPreference;
    private int total;
    private static final java.lang.String TAG = "SettingsFragment";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CLASS_REMINDER_UP_TIME = "class_reminder_up_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CLASS_REMINDER_DOWN_TIME = "class_reminder_down_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PHONE_MUTE_STATUS = "phone_mute_status";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PHONE_MUTE_BEFORE_TIME = "phone_mute_before_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PHONE_MUTE_AFTER_TIME = "phone_mute_after_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEFAULT_SHOW_MAIN_FRAGMENT = "default_show_main_fragment";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APP_COLOR_PRIMARY = "app_color_primary";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APP_COLOR_PRIMARY_DARK = "app_color_primary_dark";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APP_COLOR_ACCENT = "app_color_accent";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APP_COLOR_PROGRESS = "app_color_progress";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FOREGROUND_SERVICE_STATUS = "foreground_service_status";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOW_WEEK_NUM = "now_week_num";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOTAL_WEEK_NUM = "total_week_num";
    public static final top.huar.schedule.ui.fragment.setting.SettingsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onCreatePreferences(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState, @org.jetbrains.annotations.Nullable()
    java.lang.String rootKey) {
    }
    
    @java.lang.Override()
    public void onSharedPreferenceChanged(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    public SettingsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Ltop/huar/schedule/ui/fragment/setting/SettingsFragment$Companion;", "", "()V", "APP_COLOR_ACCENT", "", "APP_COLOR_PRIMARY", "APP_COLOR_PRIMARY_DARK", "APP_COLOR_PROGRESS", "CLASS_REMINDER_DOWN_TIME", "CLASS_REMINDER_UP_TIME", "DEFAULT_SHOW_MAIN_FRAGMENT", "FOREGROUND_SERVICE_STATUS", "NOW_WEEK_NUM", "PHONE_MUTE_AFTER_TIME", "PHONE_MUTE_BEFORE_TIME", "PHONE_MUTE_STATUS", "TAG", "TOTAL_WEEK_NUM", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}