package com.skeleton.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;

import com.skeleton.R;
import com.skeleton.database.CommonData;
import com.skeleton.fragment.SigninFragment;
import com.skeleton.fragment.SignupFragment;
import com.skeleton.model.Example;
import com.skeleton.model.UserDetails;
import com.skeleton.retrofit.APIError;
import com.skeleton.retrofit.ResponseResolver;
import com.skeleton.retrofit.RestClient;

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
    private UserDetails userDetails;
    private Intent intent;
    private String mAccessToken;
    private Example mExample;

    /**
     * @param savedInstanceState current instance is saved;
     */
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        mPagerAdapter = new com.skeleton.adapter.PagerAdapter(getSupportFragmentManager(), fragments);
        mViewPager.setAdapter(mPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);

    }

    /**
     * @param requestCode req code;
     * @param resultCode  res code;
     * @param data        data;
     */
    @Override
    protected void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {

            case REQ_OTP:
                if (resultCode == RESULT_OK) {
                    intent = new Intent(MainActivity.this, ProfileInfoActivty.class);
                    intent.putExtra(SHARED_OBJ, userDetails);
                    startActivity(intent);
                }
                break;
            default:
                break;

        }


    }

    /**
     * getToken;
     */
    private void getToken() {
        mAccessToken = CommonData.getAccessToken();
        if (mAccessToken != null) {
            RestClient.getApiInterface().userProfile("bearer " + mAccessToken).enqueue(new ResponseResolver<Example>(MainActivity.this, true) {
                @Override
                public void success(final Example example) {
                    mExample = example;

                }

                @Override
                public void failure(final APIError error) {
                    Toast.makeText(MainActivity.this, "failure in setting object!", Toast.LENGTH_SHORT).show();

                }
            });

        }


    }

    /**
     * init();
     */
    private void init() {
        getToken();
        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        fragments = new ArrayList<>();
        fragments.add(new SignupFragment());
        fragments.add(new SigninFragment());

        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);

    }


}
