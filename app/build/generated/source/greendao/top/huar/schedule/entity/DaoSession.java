package top.huar.schedule.entity;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import top.huar.schedule.entity.ClassSchedule;
import top.huar.schedule.entity.Hash;

import top.huar.schedule.entity.ClassScheduleDao;
import top.huar.schedule.entity.HashDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig classScheduleDaoConfig;
    private final DaoConfig hashDaoConfig;

    private final ClassScheduleDao classScheduleDao;
    private final HashDao hashDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        classScheduleDaoConfig = daoConfigMap.get(ClassScheduleDao.class).clone();
        classScheduleDaoConfig.initIdentityScope(type);

        hashDaoConfig = daoConfigMap.get(HashDao.class).clone();
        hashDaoConfig.initIdentityScope(type);

        classScheduleDao = new ClassScheduleDao(classScheduleDaoConfig, this);
        hashDao = new HashDao(hashDaoConfig, this);

        registerDao(ClassSchedule.class, classScheduleDao);
        registerDao(Hash.class, hashDao);
    }
    
    public void clear() {
        classScheduleDaoConfig.clearIdentityScope();
        hashDaoConfig.clearIdentityScope();
    }

    public ClassScheduleDao getClassScheduleDao() {
        return classScheduleDao;
    }

    public HashDao getHashDao() {
        return hashDao;
    }

}
