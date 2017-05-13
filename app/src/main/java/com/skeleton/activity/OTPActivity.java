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
import com.skeleton.model.Data;
import com.skeleton.model.Example;
import com.skeleton.retrofit.APIError;
import com.skeleton.retrofit.ResponseResolver;
import com.skeleton.retrofit.RestClient;

/**
 * Created by rahulkapoor on 12/05/17.
 */

public class OTPActivity extends BaseActivity {

    private EditText etotp;
    private TextView tvUserPhone;
    private TextView tvResendOtp, tvEditNum;
    private Button btnVerify;
    String mOTP;
    String mUserEmail;
    Toolbar mToolbar;
    private TextView mToolbarTitle;
    private Button btnSkip;


    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_otp);

        init();
        btnSkip.setVisibility(View.GONE);
        mToolbarTitle.setText("Phone Number Verification");




        btnVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                generateOTP();
                Intent i = new Intent();
                mUserEmail = i.getStringExtra("email");


                RestClient.getApiInterface().verifyOTP(mUserEmail).enqueue(new ResponseResolver<Example>(OTPActivity.this, true) {
                    @Override
                    public void success(Example example) {
                       Data mData =  example.getData();
                        String UserOTP = mData.getOTP();
                        if(mOTP.equals(UserOTP)) {
                            Toast.makeText(OTPActivity.this, "OTP matched, moving to home page!", Toast.LENGTH_SHORT).show();
                            

                        }

                    }

                    @Override
                    public void failure(APIError error) {

                    }
                });

            }

        });

    }

    /**
     * this method will help us to concat otp edit text values;
     */

    private void generateOTP() {
        mOTP = etotp.getText().toString();
    }


    /**
     * all inits are made;
     */
    private void init() {

        etotp = (EditText) findViewById(R.id.otp_num);
        tvUserPhone = (TextView) findViewById(R.id.otp_user_phone);
        tvResendOtp = (TextView) findViewById(R.id.otp_resend_otp);
        tvEditNum = (TextView) findViewById(R.id.otp_edit_num);
        btnVerify = (Button) findViewById(R.id.otp_btn_verify);
        mToolbar = (Toolbar) findViewById(R.id.custom_toolbar);
        mToolbarTitle = (TextView) findViewById(R.id.toolbar_title);
        btnSkip = (Button) findViewById(R.id.btn_skip);


    }

}