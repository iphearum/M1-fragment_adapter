package edu.itc.gic.m1.songbook.db;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import edu.itc.gic.m1.songbook.production.Production;
import edu.itc.gic.m1.songbook.song.Song;

@Dao
public interface SingerDao {
    @Query("SELECT * FROM productions")
    List<Song> loadAll();

    // File: SongDao.java
//    @Query("SELECT * FROM productions WHERE id IN (:songIds)")
//    List<Song> loadAllBySongId(int... productions);

    @Insert
    void insertAll(Production... productions);
    @Delete
    void delete(Production production);
}
