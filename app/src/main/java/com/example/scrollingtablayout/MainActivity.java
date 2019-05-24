package com.example.scrollingtablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbarid);
        setSupportActionBar(toolbar);
        adapter=new ViewPagerAdapter(getSupportFragmentManager());
        tabLayout=findViewById(R.id.tablayoutid);
        viewPager=findViewById(R.id.viewPagerid);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);




    }
}
