package top.huar.schedule.entity;

import java.util.List;

import top.huar.schedule.common.App;
import top.huar.schedule.util.DateUtils;

/**
 * 数据封装实体
 *
 */
public class DataEntity {
    private final List<ClassSchedule> classScheduleList;
    private final List<String> timeList;

    public DataEntity(App app) {
        classScheduleList = app.getDaoSession().getClassScheduleDao().loadAll();
        timeList = DateUtils.INSTANCE.getTimeList();
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
                '}';
    }
}
