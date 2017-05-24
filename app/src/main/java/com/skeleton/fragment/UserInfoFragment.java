package com.skeleton.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.skeleton.R;
import com.skeleton.activity.PostActivity;
import com.skeleton.model1.MainModel;

/**
 * Created by rahulkapoor on 24/05/17.
 */

public class UserInfoFragment extends Fragment {

    private ImageView mImage;
    private TextView mId;
    private TextView mName;
    private Bundle mBundle;
    private Integer userId;
    private String userName;
    private MainModel obj;
    private Button mButton;

    /**
     * @param inflater           inflater
     * @param container          container
     * @param savedInstanceState current instance is saved;
     * @return return
     */
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_userinfo, container, false);

        init(rootView);

        mImage.setImageResource(R.mipmap.ic_launcher);
        mBundle = getArguments();
        obj = mBundle.getParcelable("obj");


        userId = obj.getId();
        mId.setText(Integer.toString(userId));

        userName = obj.getName();
        mName.setText(userName);

        mButton.setOnClickListener(new View.OnClickListener() {
            /**
             *
             * @param v view
             */
            @Override
            public void onClick(final View v) {
                Intent mIntent = new Intent(getContext(), PostActivity.class);
                mIntent.putExtra("userId", obj.getId());
                startActivity(mIntent);

            }
        });


        return rootView;
    }

    /**
     * @param view view
     */
    private void init(final View view) {

        mImage = (ImageView) view.findViewById(R.id.user_image);
        mId = (TextView) view.findViewById(R.id.user_id);
        mName = (TextView) view.findViewById(R.id.user_name);
        mButton = (Button) view.findViewById(R.id.btn_click);

    }


}
