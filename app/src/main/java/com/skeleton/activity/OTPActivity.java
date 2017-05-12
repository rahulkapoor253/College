package com.skeleton.activity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.skeleton.R;

/**
 * Created by rahulkapoor on 12/05/17.
 */

public class OTPActivity extends BaseActivity {

    private EditText etOTP1, etOTP2, etOTP3, etOTP4;
    private TextView tvUserPhone;


    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_otp);

        init();

    }


    private void init() {

        etOTP1 = (EditText) findViewById(R.id.otp_1);
        etOTP2 = (EditText) findViewById(R.id.otp_2);
        etOTP3 = (EditText) findViewById(R.id.otp_3);
        etOTP4 = (EditText) findViewById(R.id.otp_4);
        tvUserPhone = (TextView) findViewById(R.id.otp_user_phone);

    }


}