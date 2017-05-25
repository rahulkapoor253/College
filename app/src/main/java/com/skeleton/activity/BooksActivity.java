package com.skeleton.activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.skeleton.R;
import com.skeleton.adapter.BooksAdapter;
import com.skeleton.adapter.MyAdapter;
import com.skeleton.model1.Books;
import com.skeleton.retrofit.APIError;
import com.skeleton.retrofit.ResponseResolver;
import com.skeleton.retrofit.RestClient;

import java.util.List;

/**
 * Created by rahulkapoor on 25/05/17.
 */

public class BooksActivity extends BaseActivity {

    private TextView tvID, tvPageCount, tvTitle, tvDescribe;
    private RecyclerView mRecyclerViewBooks;
    private BooksAdapter adapter;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        init();

        mRecyclerViewBooks = (RecyclerView) findViewById(R.id.recycler_view_books);

        RestClient.getApiInterface().getBooks().enqueue(new ResponseResolver<List<Books>>(BooksActivity.this, true) {
            @Override
            public void success(List<Books> bookses) {

                adapter = new BooksAdapter(BooksActivity.this, bookses);
                mRecyclerViewBooks.setAdapter(adapter);
                mRecyclerViewBooks.setLayoutManager(new LinearLayoutManager(getApplicationContext()));


            }

            @Override
            public void failure(APIError error) {

            }
        });


    }


    private void init() {

        tvID = (TextView) findViewById(R.id.tv_id_books);
        tvPageCount = (TextView) findViewById(R.id.tv_page_count_books);
        tvTitle = (TextView) findViewById(R.id.tv_title_books);
        tvDescribe = (TextView) findViewById(R.id.tv_describe_books);

    }

}