package com.example.apoo.timelineviewapp.view.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.apoo.timelineviewapp.view.fragmentactivity.FragActivity;

import java.util.List;

/**
 * Created by Apoo on 8/15/2017.
 */

public class FragPagerAdapter extends FragmentPagerAdapter {


    List<Fragment> fragments;
    List<String> titles;
    BlankFragment2 fragment2 ;
    BlankFragment3 fragment3;
    Boolean isClicked;
    Context context;
    FragActivity activity;

    public FragPagerAdapter(FragmentManager fm, List<Fragment> fragments, List<String> titles) {
        super(fm);
        this.fragments = fragments;
        this.titles = titles;
    }

    public FragPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    //TODO: overrided methods of fragment
    @Override
    public Fragment getItem(int position)
    {
      switch (position) {

          case 0:
              return new BlankFragment();

          case 1:

              fragment2 = new BlankFragment2();
              return new BlankFragment2();

          case 2:

              fragment3 = new BlankFragment3();
              return new BlankFragment3();

          default:
              return null;
      }
    }


    //TODO: overrided methods of fragment
    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return titles.get(position);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }



}
