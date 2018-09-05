package com.example.admin1.viewpagerapplication.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.admin1.viewpagerapplication.R;
import com.example.admin1.viewpagerapplication.adapter.ViewPagerAdapter;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private Context context;

    // For adding tabs
    private TabLayout tabLayout;

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        context = this;

        viewPager = findViewById(R.id.view_pager);

        //For adding tabs
        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);


        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);


    viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {

        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    });
    }
}
