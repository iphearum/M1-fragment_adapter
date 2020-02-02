package edu.itc.gic.m1.songbook.production;

import com.google.auto.value.AutoValue;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@AutoValue
@Entity (tableName = "productions")
public class Production {
    @PrimaryKey(autoGenerate = true)
    private long id;
    @ColumnInfo(name = "image_url")
    public String image;
    public String name;

    public Production(long id, String name, String image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }

    public String getImage(){ return this.image; }
    public String getName(){ return this.name; }
    public void setName(String name){ this.name = name; }
    public void setImage(String image){ this.image = image; }
//
    public long getId() { return this.id; }
    public void setId(long id) { this.id = id; }
}
