package com.skeleton.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.skeleton.R;
import com.skeleton.fragment.FragmentProfile1;
import com.skeleton.fragment.FragmentProfile2;
import com.skeleton.model.UserDetails;

/**
 * profile info activity that call both the profile fragments;
 */
public class ProfileInfoActivty extends BaseActivity {

    private Toolbar mToolbar;
    private TextView mTitle;
    private LinearLayout mLinearLayout;
    private Button btnSkip;
    private Intent intent;
    private UserDetails details;

    /**
     * @param savedInstanceState current instance is saved;
     */
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_info_activty);

        init();

        fragmentCalling();

        btnSkip.setOnClickListener(new View.OnClickListener() {
            /**
             *
             * @param v view
             */
            @Override
            public void onClick(final View v) {

            }
        });


    }

    /**
     * to call the second profile frag;
     */
    public void fragment2Calling() {

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.ll_profile_info, new FragmentProfile2());
        ft.commit();

    }

    /**
     * first frag calling.
     */
    private void fragmentCalling() {

        //getIntent().putExtra(SHARED_OBJ, details);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.ll_profile_info, new FragmentProfile1());
        ft.commit();

    }

    /**
     * initialisation;
     */
    public void init() {

        mToolbar = (Toolbar) findViewById(R.id.custom_toolbar);
        mTitle = (TextView) findViewById(R.id.toolbar_title);
        mLinearLayout = (LinearLayout) findViewById(R.id.ll_profile_info);
        btnSkip = (Button) findViewById(R.id.btn_skip);
        // details = intent.getParcelableExtra(SHARED_OBJ);

    }


}
