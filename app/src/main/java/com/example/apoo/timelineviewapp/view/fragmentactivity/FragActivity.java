package com.example.apoo.timelineviewapp.view.fragmentactivity;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.FrameLayout;

import com.badoualy.stepperindicator.StepperIndicator;
import com.example.apoo.timelineviewapp.R;
import com.example.apoo.timelineviewapp.view.fragment.BlankFragment;
import com.example.apoo.timelineviewapp.view.fragment.BlankFragment2;
import com.example.apoo.timelineviewapp.view.fragment.BlankFragment3;
import com.example.apoo.timelineviewapp.view.fragment.FragPagerAdapter;
import com.example.apoo.timelineviewapp.view.fragment.IFragment1;

import java.util.ArrayList;
import java.util.List;

public class FragActivity extends AppCompatActivity implements IFragment1 {

    ViewPager pager;
    StepperIndicator indicator ;
    FragmentPagerAdapter pagerAdapter;
    Toolbar toolbar;
    ArrayList<Fragment> fragments = new ArrayList<>(3);
    List<String> titles = new ArrayList<>(3);
    BlankFragment fragment1;
    Context c;
    Boolean isClicked;

    public FragActivity(Context c,Boolean isClicked) {
        this.c = c;
        this.isClicked=isClicked;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag);
        toolbar = (Toolbar)findViewById(R.id.toolbar);

        pager = (ViewPager) findViewById(R.id.pager);
        indicator = (StepperIndicator) findViewById(R.id.stepper_indicator);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Place Order");
        assert pager != null;

        //TODO: populating  list of fragments
        fragments.add(new BlankFragment(isClicked,this));
        fragments.add(new BlankFragment2());
        fragments.add(new BlankFragment3());

        //TODO: populating list of titles
        titles.add("Fragment 1");
        titles.add("Fragment 2");
        titles.add("Fragment 3");

        pagerAdapter = new FragPagerAdapter(getSupportFragmentManager(), fragments,titles);
        pager.setOffscreenPageLimit(0);
        pager.setAdapter(pagerAdapter);
        indicator.setViewPager(pager);

    }

    //TODO: fragment transaction
    public void setCurrentItem(int item,boolean smothScroll) {
        pager.setCurrentItem(item,smothScroll);

    }


    @Override
    public void saveBtnClick(int item,Boolean isClicked) {

        Log.d("BTNCLICKACTIVITY", "saveBtnClick: "+isClicked);
        setCurrentItem(item,isClicked);

    }
}
