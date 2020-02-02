package edu.itc.gic.m1.songbook.db;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import edu.itc.gic.m1.songbook.production.Production;

@Dao
public interface SongDao {
    @Query("SELECT * FROM productions")
    List<Production> loadAll();

    // File: SongDao.java
//    @Query("SELECT * FROM productions WHERE id IN (:songIds)")
//    List<Song> loadAllBySongId(int... productions);

    @Insert
    void insertAll(Production... productions);
    @Delete
    void delete(Production production);
}
