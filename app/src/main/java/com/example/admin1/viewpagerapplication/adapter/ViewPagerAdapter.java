package com.example.admin1.viewpagerapplication.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.admin1.viewpagerapplication.fragments.Fragment1;
import com.example.admin1.viewpagerapplication.fragments.Fragment2;
import com.example.admin1.viewpagerapplication.fragments.Fragment3;

public class ViewPagerAdapter extends FragmentPagerAdapter{

    //For tabs
    private String[] tabs = {"Fragment 1", "Fragment 2","Fragment 3"};

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    //For setting tab name
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int i) {


        switch (i){
            case 0:
                return new Fragment1();
            case 1:
                return new Fragment2();
            case 2:
                return new Fragment3();

        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
