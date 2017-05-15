package com.skeleton.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.kbeanie.multipicker.api.entity.ChosenImage;
import com.skeleton.R;
import com.skeleton.activity.OTPActivity;
import com.skeleton.model.Example;
import com.skeleton.retrofit.APIError;
import com.skeleton.retrofit.MultipartParams;
import com.skeleton.retrofit.ResponseResolver;
import com.skeleton.retrofit.RestClient;
import com.skeleton.util.ValidateEditText;
import com.skeleton.util.customview.MaterialEditText;
import com.skeleton.util.imagepicker.ImageChooser;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import okhttp3.RequestBody;
import retrofit2.http.Body;


/**
 * Created by rahulkapoor on 11/05/17.
 */

public class SignupFragment extends Fragment {

    private MaterialEditText metFname;
    private MaterialEditText metEmail;
    private MaterialEditText metDOB;
    private Button btnSignup;
    private Button btnSignupFb;
    private MaterialEditText metPhone;
    private MaterialEditText metPass;
    private MaterialEditText metConfpass;
    private CircleImageView mUserImage;
    private int mGender;
    private File mImageFile;
    private RadioGroup mRgGender;
    private ImageChooser imageChooser;
    private RadioButton rbMale, rbFemale;
    private String mFname, mEmail, mDOB, mPhone, mPass;
    private String mDeviceToken = "DEVICE_OK", mUserAppVersion = "VERSION", mCountryCode = "+91", mLang = "EN", mDeviceType = "ANDROID";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_signup, container, false);

    init(view);


        mUserImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseImage();
            }
        });

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(validate()) {

                    setData();

                    uploadData();

                }
                else {
                    Toast.makeText(getContext(), "Enter Details Correctly!", Toast.LENGTH_SHORT).show();
                }


            }
        });



        return view;
    }

    private void uploadData() {

        HashMap<String, RequestBody> params = new MultipartParams.Builder()
                .add("firstName", mFname)
                .add("dob", mDOB)
                .add("phoneNo", mPhone)
                .add("email", mEmail)
                .add("password", mPass)
                .addFile("profilePic", mImageFile)
                .add("deviceToken", mDeviceToken)
                .add("appVersion", mUserAppVersion)
                .add("countryCode", mCountryCode)
                .add("language", mLang)
                .add("deviceType", mDeviceType)
                .add("gender", mGender)
                .build().getMap();



        RestClient.getApiInterface().userSignUp(params).enqueue(new ResponseResolver<Example>(getContext() ,true) {
            @Override
            public void success(Example example) {
                Toast.makeText(getContext(), "Success!", Toast.LENGTH_SHORT).show();
                Intent mIntent = new Intent(getContext(), OTPActivity.class);
                mIntent.putExtra("email", mEmail);
                mIntent.putExtra("phone", mPhone);
                startActivity(mIntent);

            }

            @Override
            public void failure(APIError error) {
                Toast.makeText(getContext(), "Upload Failure!", Toast.LENGTH_SHORT).show();

            }
        });



    }


    private boolean validate() {

    mGender = mRgGender.getCheckedRadioButtonId();
        int checkVal = checkGender();
    mGender = checkVal;

        if (mImageFile == null) {
            Toast.makeText(getContext(), "Choose a profile picture!", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (!ValidateEditText.checkName(metFname, true)) {
            return false;
        }
        if (!ValidateEditText.checkEmail(metEmail)) {
            return false;
        }
        if (!ValidateEditText.checkPassword(metPass, true)) {
            return false;
        }
        if (!ValidateEditText.checkPhoneNumber(metPhone)) {
            return false;
        }
        if (!ValidateEditText.comparePassword(metPass, metConfpass)) {
            return false;
        }
        if (mGender == -1) {
            return false;
        }

        return true;



    }

    private int checkGender() {

        if(rbMale.isChecked()) {
            return 0;
        }

        if (rbFemale.isChecked()) {
            return 1;
        }

        return -1;

    }

    private void chooseImage() {
        imageChooser = new ImageChooser.Builder(this).setCropEnabled(false).build();
        imageChooser.selectImage(new ImageChooser.OnImageSelectListener() {

            @Override
            public void loadImage(List<ChosenImage> list) {
                mImageFile = new File(list.get(0).getOriginalPath());
                Glide.with(SignupFragment.this)
                        .load(list.get(0).getQueryUri())
                        .into(mUserImage);

            }

            @Override
            public void croppedImage(File mCroppedImage) {

            }
        });
    }

    /**
     * @param requestCode  request code
     * @param permissions  permissions
     * @param grantResults grant results
     */
    @Override
    public void onRequestPermissionsResult(final int requestCode, final String[] permissions, final int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        imageChooser.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    /**
     * @param requestCode req code
     * @param resultCode  result code
     * @param data        data
     */
    @Override
    public void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        imageChooser.onActivityResult(requestCode, resultCode, data);

    }


    private void setData() {

        mFname = metFname.getText().toString();
        mEmail = metEmail.getText().toString();
        mDOB = metDOB.getText().toString();
        mPhone = metPhone.getText().toString();
        mPass = metPass.getText().toString();


    }

    private void init(View view) {

        metFname = (MaterialEditText) view.findViewById(R.id.met_fname);
        metEmail = (MaterialEditText) view.findViewById(R.id.met_email);
        metConfpass = (MaterialEditText) view.findViewById(R.id.met_confpass);
        metPass = (MaterialEditText) view.findViewById(R.id.met_pass);
        metDOB = (MaterialEditText) view.findViewById(R.id.met_dob);
        metPhone = (MaterialEditText) view.findViewById(R.id.met_phone);
        btnSignup = (Button) view.findViewById(R.id.btn_signup);
        btnSignupFb = (Button) view.findViewById(R.id.btn_signupfb);
        rbMale = (RadioButton) view.findViewById(R.id.rb_male);
        rbFemale = (RadioButton) view.findViewById(R.id.rb_female);
        mRgGender = (RadioGroup) view.findViewById(R.id.rg_gender);
        mUserImage = (CircleImageView) view.findViewById(R.id.civ_user_image);

    }

}
