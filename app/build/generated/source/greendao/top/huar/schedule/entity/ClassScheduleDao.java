package top.huar.schedule.entity;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CLASS_SCHEDULE".
*/
public class ClassScheduleDao extends AbstractDao<ClassSchedule, String> {

    public static final String TABLENAME = "CLASS_SCHEDULE";

    /**
     * Properties of entity ClassSchedule.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, String.class, "id", true, "ID");
        public final static Property Week = new Property(1, int.class, "week", false, "WEEK");
        public final static Property Section = new Property(2, int.class, "section", false, "SECTION");
        public final static Property Name = new Property(3, String.class, "name", false, "NAME");
        public final static Property Location = new Property(4, String.class, "location", false, "LOCATION");
        public final static Property Teacher = new Property(5, String.class, "teacher", false, "TEACHER");
        public final static Property NumberOfWeek = new Property(6, String.class, "numberOfWeek", false, "NUMBER_OF_WEEK");
    }


    public ClassScheduleDao(DaoConfig config) {
        super(config);
    }
    
    public ClassScheduleDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CLASS_SCHEDULE\" (" + //
                "\"ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: id
                "\"WEEK\" INTEGER NOT NULL ," + // 1: week
                "\"SECTION\" INTEGER NOT NULL ," + // 2: section
                "\"NAME\" TEXT," + // 3: name
                "\"LOCATION\" TEXT," + // 4: location
                "\"TEACHER\" TEXT," + // 5: teacher
                "\"NUMBER_OF_WEEK\" TEXT);"); // 6: numberOfWeek
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CLASS_SCHEDULE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, ClassSchedule entity) {
        stmt.clearBindings();
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(1, id);
        }
        stmt.bindLong(2, entity.getWeek());
        stmt.bindLong(3, entity.getSection());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(4, name);
        }
 
        String location = entity.getLocation();
        if (location != null) {
            stmt.bindString(5, location);
        }
 
        String teacher = entity.getTeacher();
        if (teacher != null) {
            stmt.bindString(6, teacher);
        }
 
        String numberOfWeek = entity.getNumberOfWeek();
        if (numberOfWeek != null) {
            stmt.bindString(7, numberOfWeek);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, ClassSchedule entity) {
        stmt.clearBindings();
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(1, id);
        }
        stmt.bindLong(2, entity.getWeek());
        stmt.bindLong(3, entity.getSection());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(4, name);
        }
 
        String location = entity.getLocation();
        if (location != null) {
            stmt.bindString(5, location);
        }
 
        String teacher = entity.getTeacher();
        if (teacher != null) {
            stmt.bindString(6, teacher);
        }
 
        String numberOfWeek = entity.getNumberOfWeek();
        if (numberOfWeek != null) {
            stmt.bindString(7, numberOfWeek);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public ClassSchedule readEntity(Cursor cursor, int offset) {
        ClassSchedule entity = new ClassSchedule( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // id
            cursor.getInt(offset + 1), // week
            cursor.getInt(offset + 2), // section
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // name
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // location
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // teacher
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6) // numberOfWeek
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, ClassSchedule entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setWeek(cursor.getInt(offset + 1));
        entity.setSection(cursor.getInt(offset + 2));
        entity.setName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setLocation(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setTeacher(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setNumberOfWeek(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
     }
    
    @Override
    protected final String updateKeyAfterInsert(ClassSchedule entity, long rowId) {
        return entity.getId();
    }
    
    @Override
    public String getKey(ClassSchedule entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(ClassSchedule entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}