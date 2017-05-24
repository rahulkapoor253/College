package com.skeleton.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.Toast;

import com.skeleton.R;
import com.skeleton.adapter.MyAdapter;
import com.skeleton.model1.MainModel;
import com.skeleton.retrofit.APIError;
import com.skeleton.retrofit.ApiInterface;
import com.skeleton.retrofit.ResponseResolver;
import com.skeleton.retrofit.RestClient;

import java.util.List;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by rahulkapoor on 24/05/17.
 */

public class HomeActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private MyAdapter adapter;
    private Button mButton;

    /**
     * @param savedInstanceState current instance is saved;
     */
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mButton = (Button) findViewById(R.id.btn_click);





        RestClient.getApiInterfaceNew().getUserData().enqueue(new ResponseResolver<List<MainModel>>(this, true) {

            @Override
            public void success(List<MainModel> mainModels) {
                adapter = new MyAdapter(HomeActivity.this, mainModels, 1);
                mRecyclerView.setAdapter(adapter);
                mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
            }

            @Override
            public void failure(APIError error) {
                Toast.makeText(HomeActivity.this, "Server call failed.", Toast.LENGTH_SHORT).show();
            }
        });


}


}
