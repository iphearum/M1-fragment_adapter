package edu.itc.gic.m1.songbook;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerTabStrip;
import androidx.viewpager.widget.ViewPager;
import edu.itc.gic.m1.assign_001.BaseActivity;
import edu.itc.gic.m1.assign_001.R;
import edu.itc.gic.m1.songbook.fragment.ProductionFragment;
import edu.itc.gic.m1.songbook.fragment.SingerFragment;
import edu.itc.gic.m1.songbook.fragment.SongFragment;

//import androidx.fragment.app.Fragment;
//import androidx.viewpager.widget.PagerTabStrip;
//import androidx.viewpager.widget.ViewPager;

public class SongBookActivity extends BaseActivity {
    ViewPager pager;

    Fragment[] fragments;
    String[] pageTitles;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_book);
        setTitle("SongBook");
        pager = findViewById(R.id.viewPager);
        fragments = new Fragment[3];

        fragments[0] = new ProductionFragment();
        fragments[1] = new SingerFragment();
        fragments[2] = new SongFragment();

        pageTitles = new String[]{"Production","Singer","Songs"};

        pager.setPageTransformer(true,new ZoomOutPageTransformer());
        PagerTabStrip pageTab = findViewById(R.id.pagerTab);
        pageTab.setTextColor(getResources().getColor(R.color.colorAccent));
//            pager.setAdapter(new SongBookPageAdapter(getSupportFragmentManager(),fragments,pageTitles));
        SongBookPageAdapter setpageadapter = new SongBookPageAdapter(getSupportFragmentManager(),
                fragments,pageTitles);
        pager.setAdapter(setpageadapter);
    }
}
