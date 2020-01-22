package edu.itc.gic.m1.songbook;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SongBookPageAdapter extends FragmentPagerAdapter {

    private final Fragment[] mfragments;
    private String[] mTittle;

    public SongBookPageAdapter(FragmentManager fm, Fragment[] fragments, String[] mTittle) {
        super(fm);
        mfragments = fragments;
        this.mTittle = mTittle;
    }

    @Override
    public Fragment getItem(int i) {
        return mfragments[i];
    }

    @Override
    public int getCount() {
        return mfragments.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mTittle[position];
    }
}
