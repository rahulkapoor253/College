package com.skeleton.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.skeleton.R;
import com.skeleton.database.CommonData;
import com.skeleton.model.Data;
import com.skeleton.model.Example;
import com.skeleton.model.UserDetails;
import com.skeleton.retrofit.APIError;
import com.skeleton.retrofit.CommonParams;
import com.skeleton.retrofit.ResponseResolver;
import com.skeleton.retrofit.RestClient;
import com.skeleton.util.Log;

/**
 * Created by rahulkapoor on 12/05/17.
 */

public class OTPActivity extends BaseActivity {

    private EditText etotp;
    private TextView tvUserPhone;
    private TextView tvResendOtp, tvEditNum;
    private Button btnVerify;
    private String mOTP, mPhone;
    private String mUserEmail;
    private Toolbar mToolbar;
    private TextView mToolbarTitle;
    private UserDetails userDetails;
    private Button btnSkip;
    private Intent i;


    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_otp);

        userDetails = getIntent().getParcelableExtra(SHARED_OBJ);
        int mode = getIntent().getIntExtra(KEY_MODE, 0);
        if (mode == REQ_SIGN_IN && userDetails.getPhoneVerified()) {
            setResult(RESULT_OK);
            finish();
        }

        init();
        btnSkip.setVisibility(View.GONE);
        mToolbarTitle.setText("Phone Number Verification");

        tvUserPhone.setText(userDetails.getPhoneNo());



        btnVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                mOTP = etotp.getText().toString();
                Log.i("otp", mOTP);
                CommonParams params = new CommonParams.Builder()
                        .add(KEY_FRAGMENT_COUNTRY_CODE, userDetails.getCountryCode())
                        .add(KEY_FRAGMENT_PHONE, userDetails.getPhoneNo())
                        .add(KEY_FRAGMENT_OTPCODE, mOTP).build();

                RestClient.getApiInterface()
                        .verifyOtp("bearer " + CommonData.getAccessToken(), params.getMap())
                        .enqueue(new ResponseResolver<Example>(OTPActivity.this, true) {
                            @Override
                            public void success(final Example example) {
                                setResult(RESULT_OK);
                                finish();
                            }

                            @Override
                            public void failure(final APIError error) {

                            }
                        });

            }


        });

    }


    /**
     * all inits are made;
     */
    private void init() {

        userDetails = getIntent().getParcelableExtra(SHARED_OBJ);
        etotp = (EditText) findViewById(R.id.otp_num);
        tvUserPhone = (TextView) findViewById(R.id.tv_user_phone);
        tvResendOtp = (TextView) findViewById(R.id.otp_resend_otp);
        tvEditNum = (TextView) findViewById(R.id.otp_edit_num);
        btnVerify = (Button) findViewById(R.id.otp_btn_verify);
        mToolbar = (Toolbar) findViewById(R.id.custom_toolbar);
        mToolbarTitle = (TextView) findViewById(R.id.toolbar_title);
        btnSkip = (Button) findViewById(R.id.btn_skip);


    }

}