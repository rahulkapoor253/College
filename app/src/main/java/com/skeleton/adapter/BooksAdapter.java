package com.skeleton.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.skeleton.R;
import com.skeleton.model1.Books;
import com.skeleton.model1.MainModel;

import java.util.List;

/**
 * Created by rahulkapoor on 25/05/17.
 */

public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.ViewHolder> {

    private List<Books> mData;
    private Context mContext;

    /**
     * @param context  context
     * @param datalist datalist
     */
    public BooksAdapter(final Context context, final List<Books> datalist) {
        this.mContext = context;
        this.mData = datalist;
    }


    /**
     * @param parent   parent
     * @param viewType viewtype
     * @return return view
     */
    @Override
    public BooksAdapter.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_items, parent, false);

        return new ViewHolder(itemView);

    }

    /**
     * @param holder   holder
     * @param position position
     */
    @Override
    public void onBindViewHolder(final BooksAdapter.ViewHolder holder, final int position) {

        Books obj = mData.get(position);

        holder.mId.setText(Integer.toString(obj.getID()));
        holder.mTitle.setText(obj.getTitle());
        holder.mPageCount.setText(Integer.toString(obj.getPageCount()));
        holder.mDescribe.setText(obj.getDescription());


    }

    /**
     * @return listside;
     */
    @Override
    public int getItemCount() {


        return mData.size();

    }

    /**
     * viewholder class
     */
    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView mId;
        private TextView mTitle;
        private TextView mPageCount, mDescribe;

        /**
         * @param itemView itemview;
         */
        public ViewHolder(final View itemView) {
            super(itemView);

            mId = (TextView) itemView.findViewById(R.id.tv_id_books);
            mTitle = (TextView) itemView.findViewById(R.id.tv_title_books);
            mPageCount = (TextView) itemView.findViewById(R.id.tv_page_count_books);
            mDescribe = (TextView) itemView.findViewById(R.id.tv_describe_books);



        }


    }
}


