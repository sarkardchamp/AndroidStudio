package com.example.mykolkata;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;

public class KolkataActivity extends AppCompatActivity {
    String[] tabName = {"Must Visit", "Events", "Hotels", "Restaurants"};
    TabLayout tabLayout;
    ViewPager2 pager2;
    FixedPagerAdapter fixedPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolkata);

        pager2 = (ViewPager2) findViewById(R.id.viewpager2);
        tabLayout = findViewById(R.id.tab_layout);
        fixedPagerAdapter = new FixedPagerAdapter(getSupportFragmentManager(), getLifecycle());
        pager2.setAdapter(fixedPagerAdapter);

        for(int i = 0; i < 4; i++)
            tabLayout.addTab(tabLayout.newTab().setText(tabName[i]));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        pager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });
    }
}