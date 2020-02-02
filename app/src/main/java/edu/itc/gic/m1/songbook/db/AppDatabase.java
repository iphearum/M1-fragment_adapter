package edu.itc.gic.m1.songbook.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import edu.itc.gic.m1.songbook.production.Production;

@Database(entities = {Production.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase INSTANCE;
    public static AppDatabase getInstance(Context context){
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context, AppDatabase.class, "songbook.sqlite").build();
        }
        return INSTANCE;
    }
    public abstract ProductionDao productionDao();
    public abstract SingerDao singerDao();
    public abstract SongDao songDao();
}
