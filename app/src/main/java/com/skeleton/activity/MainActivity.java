package com.skeleton.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import com.skeleton.R;
import com.skeleton.fragment.SigninFragment;
import com.skeleton.fragment.SignupFragment;
import com.skeleton.fragment.TestLocationFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rahulkapoor on 11/05/17.
 */

public class MainActivity extends BaseActivity {

    private ViewPager mViewPager;
    private PagerAdapter mPagerAdapter;
    private List<Fragment> fragments;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        mPagerAdapter = new com.skeleton.adapter.PagerAdapter(getSupportFragmentManager(), fragments);
        mViewPager.setAdapter(mPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);

    }

    private void init() {

        mViewPager = (ViewPager) findViewById(R.id.view_pager);

        fragments = new ArrayList<>();
        fragments.add(new SignupFragment());
        fragments.add(new SigninFragment());

mTabLayout = (TabLayout) findViewById(R.id.tab_layout);

    }


}
