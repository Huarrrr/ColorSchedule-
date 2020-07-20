package top.huar.schedule.entity;

import androidx.preference.PreferenceManager;

import java.util.List;

import top.huar.schedule.common.App;
import top.huar.schedule.ui.fragment.setting.SettingsFragment;
import top.huar.schedule.util.DateUtils;

/**
 * 数据封装实体
 *
 */
public class DataEntity {
    private final List<ClassSchedule> classScheduleList;
    private final List<String> timeList;
    private String nowWeek;

    public DataEntity(App app) {
        classScheduleList = app.getDaoSession().getClassScheduleDao().loadAll();
        timeList = DateUtils.INSTANCE.getTimeList();
        nowWeek = PreferenceManager.getDefaultSharedPreferences(app).getString(SettingsFragment.NOW_WEEK_NUM, "1");
    }

    public List<ClassSchedule> getClassScheduleList() {
        return classScheduleList;
    }

    public List<String> getTimeList() {
        return timeList;
    }

    @Override
    public String toString() {
        return "DataEntity{" +
                "classScheduleList=" + classScheduleList +
                ", timeList=" + timeList +
                ", nowWeek=" + nowWeek +
                '}';
    }
}
