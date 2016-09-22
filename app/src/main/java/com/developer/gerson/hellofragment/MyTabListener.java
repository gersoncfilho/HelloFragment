package com.developer.gerson.hellofragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;

/**
 * Created by gerso on 21/09/2016.
 */

public class MyTabListener implements ActionBar.TabListener {

    private ViewPager viewpager;
    private int position;

    public MyTabListener(ViewPager viewpager, int position)
    {
        this.viewpager = viewpager;
        this.position = position;
    }


    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
    //troca o fragmente dinamicamente ao clicar no tab
        viewpager.setCurrentItem(position);
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
