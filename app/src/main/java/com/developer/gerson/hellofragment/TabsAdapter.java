package com.developer.gerson.hellofragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by gerso on 22/09/2016.
 */

public class TabsAdapter extends FragmentPagerAdapter {

    public TabsAdapter(FragmentManager supportFragmentManager)
    {
        super(supportFragmentManager);
    }

    @Override
    public int getCount() {
        //viewpager vai ter paginas
        return 3;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0)
        {
            return new Fragment1();
        }
        else if(position == 1)
        {
            return new Fragment2();
        }
        else
        {
            return new Fragment3();
        }
    }
}
