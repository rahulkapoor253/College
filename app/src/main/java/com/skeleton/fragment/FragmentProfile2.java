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
import com.skeleton.model.Example;
import com.skeleton.retrofit.APIError;
import com.skeleton.retrofit.ResponseResolver;
import com.skeleton.retrofit.RestClient;

/**
 * Created by rahulkapoor on 13/05/17.
 */

public class FragmentProfile2 extends Fragment {

    private View mView1, mView2, mView3, mView4, mView5;
    private Button btnSaveCont;
    private RecyclerView mRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile_2, container, false);

        init(view);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);


        RestClient.getApiInterface().getImageText("bearer " + CommonData.getAccessToken()).enqueue(new ResponseResolver<Example>(getContext(), true) {
            @Override
            public void success(Example example) {


                RecyclerViewAdapter adapter = new RecyclerViewAdapter(getContext(), example.getData().getCategories());

                mRecyclerView.setAdapter(adapter);
                mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));


            }

            @Override
            public void failure(APIError error) {

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

    private void init(View view) {

        btnSaveCont = (Button) view.findViewById(R.id.btn_save_cont);
        mView1 = view.findViewById(R.id.view21);
        mView2 = view.findViewById(R.id.view22);
        mView3 = view.findViewById(R.id.view23);
        mView4 = view.findViewById(R.id.view24);
        mView5 = view.findViewById(R.id.view25);


    }

}
