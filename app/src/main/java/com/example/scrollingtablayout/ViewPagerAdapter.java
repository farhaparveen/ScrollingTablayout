package com.example.scrollingtablayout;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i)
    {
        Fragment1 fragment1=Fragment1.newInstance(i);
        return fragment1;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        return "Hello"+position;
    }


    @Override
    public int getCount() {
        return 10;
    }
}
