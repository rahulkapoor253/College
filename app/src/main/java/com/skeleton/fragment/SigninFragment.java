package com.skeleton.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.skeleton.R;
import com.skeleton.activity.OTPActivity;
import com.skeleton.activity.ProfileInfoActivty;
import com.skeleton.database.CommonData;
import com.skeleton.model.Example;
import com.skeleton.retrofit.APIError;
import com.skeleton.retrofit.CommonParams;
import com.skeleton.retrofit.ResponseResolver;
import com.skeleton.retrofit.RestClient;
import com.skeleton.util.StringUtil;
import com.skeleton.util.ValidateEditText;
import com.skeleton.util.customview.MaterialEditText;

import java.util.HashMap;

import static com.skeleton.constant.AppConstant.KEY_MODE;
import static com.skeleton.constant.AppConstant.SHARED_OBJ;

/**
 * Created by rahulkapoor on 11/05/17.
 */

public class SigninFragment extends BaseFragment {

    private MaterialEditText metEmail;
    private MaterialEditText metPass;
    private Button btnSignup;
    private Button btnSignupfb;
    private String mUserEmail, mUserPass;
    private String deviceType = "ANDROID", lang = "EN", deviceToken = "DEVICE_OK", appVersion = "VERSION";
    private Example mExample;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_signin, container, false);

        init(view);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(validate()) {

                setData();

                    CommonParams params = new CommonParams.Builder()
                            .add("email", mUserEmail)
                            .add("password", mUserPass)
                            .add("deviceType", deviceType)
                            .add("language", lang)
                            .add("deviceToken", deviceToken)
                            .add("flushPreviousSessions", true)
                            .add("appVersion", appVersion)
                            .build();

                    RestClient.getApiInterface().login(null, params.getMap()).enqueue(new ResponseResolver<Example>(getContext(), true) {
                        @Override
                        public void success(Example example) {

                            Toast.makeText(getContext(), "success!", Toast.LENGTH_SHORT).show();
                            CommonData.saveAccessToken(example.getData().getAccessToken());
                            mExample = example;
                            final Intent intent = new Intent(getActivity(), OTPActivity.class);
                            intent.putExtra(SHARED_OBJ, mExample.getData().getUserDetails());
                            intent.putExtra(KEY_MODE, REQ_SIGN_IN);
                            getActivity().startActivityForResult(intent, REQ_OTP);

                        }

                        @Override
                        public void failure(APIError error) {
                            Toast.makeText(getContext(), "signin failed! try again", Toast.LENGTH_SHORT).show();

                        }
                    });

                }

            }
        });


        return view;
    }

    private void setData() {
        mUserEmail = metEmail.getText().toString();
        mUserPass = metPass.getText().toString();


    }

    private boolean validate() {

        if (!ValidateEditText.checkEmail(metEmail)) {
            return false;
        }
        if (!ValidateEditText.checkPassword(metPass, true)) {
            return false;
        }


        return true;

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Intent i = new Intent(getContext(), ProfileInfoActivty.class);
        i.putExtra(SHARED_OBJ, mExample.getData().getUserDetails());
        startActivity(i);

    }

    private void init(View view) {
        metEmail = (MaterialEditText) view.findViewById(R.id.met_signin_email);
        metPass = (MaterialEditText) view.findViewById(R.id.met_signin_pass);

        btnSignup = (Button) view.findViewById(R.id.btn_signin_signup);
        btnSignupfb = (Button) view.findViewById(R.id.btn_signin_signupfb);


    }
}
