package com.developer.gerson.hellofragment;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Viewpager
        viewpager = (ViewPager) findViewById(R.id.viewPager);
        viewpager.setAdapter(new TabsAdapter(getSupportFragmentManager()));

        //Configura os tabs
        final ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.addTab(actionBar.newTab().setText("Frag 1").setTabListener(new MyTabListener(viewpager,0)));

        actionBar.addTab(actionBar.newTab().setText("Frag 2").setTabListener(new MyTabListener(viewpager,1)));

        actionBar.addTab(actionBar.newTab().setText("Frag 3").setTabListener(new MyTabListener(viewpager,2)));

        //Se o viewpager troca de pagina, atualiza a tab
        viewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                //se fizer swipe no viewpager, atualiza a tab
                actionBar.setSelectedNavigationItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



    }
}
