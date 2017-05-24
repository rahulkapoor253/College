package com.skeleton.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.skeleton.R;
import com.skeleton.adapter.MyPostAdapter;
import com.skeleton.model1.Post;
import com.skeleton.retrofit.APIError;
import com.skeleton.retrofit.ResponseResolver;
import com.skeleton.retrofit.RestClient;

import java.util.List;

/**
 * Created by rahulkapoor on 24/05/17.
 */

public class PostActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private MyPostAdapter adapter;
    private int userId;


    /**
     * @param savedInstanceState current instance is saved;
     */
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        Intent i = getIntent();
        userId = i.getIntExtra("userId", 0);




        RestClient.getApiInterface().getPosts(userId).enqueue(new ResponseResolver<List<Post>>(this, true) {
            /**
             *
             * @param posts posts
             */
            @Override
            public void success(final List<Post> posts) {

                mRecyclerView = (RecyclerView) findViewById(R.id.rv_post);
                adapter = new MyPostAdapter(PostActivity.this, posts);
                mRecyclerView.setAdapter(adapter);
                mRecyclerView.setLayoutManager(new LinearLayoutManager(PostActivity.this));

            }

            /**
             *
             * @param error the error
             */
            @Override
            public void failure(final APIError error) {


            }
        });

    }





}
