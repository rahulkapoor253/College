package com.skeleton.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.skeleton.R;
import com.skeleton.activity.HomeActivty;
import com.skeleton.adapter.RecyclerViewAdapter;
import com.skeleton.database.CommonData;
import com.skeleton.model.profile2.ProfileData;
import com.skeleton.model.profile2.ProfileExample;
import com.skeleton.retrofit.APIError;
import com.skeleton.retrofit.ResponseResolver;
import com.skeleton.retrofit.RestClient;
import com.skeleton.util.Log;

/**
 * Created by rahulkapoor on 13/05/17.
 */

public class FragmentProfile2 extends Fragment {

    private View mView1, mView2, mView3, mView4, mView5;
    private Button btnSaveCont;
    private RecyclerView mRecyclerView;
    private ProfileData objData;

    /**
     * @param inflater           inflater
     * @param container          container
     * @param savedInstanceState current instance is saved;
     * @return return
     */
    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile_2, container, false);

        init(view);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);

        Log.d("debug", CommonData.getAccessToken());
        RestClient.getApiInterface().getImageText("bearer " + CommonData.getAccessToken(), "INTEREST").
                enqueue(new ResponseResolver<ProfileExample>(getContext(), true) {
                    /**
                     *
                     * @param example object of main model class;
                     */
                    @Override
                    public void success(final ProfileExample example) {
                        objData = example.getData();
                        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getContext(), objData.getCategories(), FragmentProfile2.this);

                        mRecyclerView.setAdapter(adapter);
                        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));

                    }

                    /**
                     *
                     * @param error the error
                     */
                    @Override
                    public void failure(final APIError error) {

                    }
                });


        btnSaveCont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Intent intent = new Intent(getContext(), HomeActivty.class);
                startActivity(intent);

            }
        });


        return view;
    }

    /**
     * @param view view;
     */
    public void init(final View view) {

        btnSaveCont = (Button) view.findViewById(R.id.btn_save_cont);
        mView1 = view.findViewById(R.id.view21);
        mView2 = view.findViewById(R.id.view22);
        mView3 = view.findViewById(R.id.view23);
        mView4 = view.findViewById(R.id.view24);
        mView5 = view.findViewById(R.id.view25);


    }

}
