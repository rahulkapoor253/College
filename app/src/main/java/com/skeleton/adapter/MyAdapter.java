package com.skeleton.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.skeleton.R;
import com.skeleton.activity.BooksActivity;
import com.skeleton.model1.Books;
import com.skeleton.model1.MainModel;

import java.util.List;

/**
 * Created by rahulkapoor on 24/05/17.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<MainModel> mData;
    private Context mContext;
    private int mMode;

    /**
     * @param context  context
     * @param datalist datalist
     * @param mode     mode
     */
    public MyAdapter(final Context context, final List<MainModel> datalist, final int mode) {
        this.mContext = context;
        this.mData = datalist;
        this.mMode = mode;
    }


    /**
     * @param parent   parent
     * @param viewType viewtype
     * @return return view
     */
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_items, parent, false);

        return new ViewHolder(itemView);

    }

    /**
     * @param holder   holder
     * @param position position
     */
    @Override
    public void onBindViewHolder(final MyAdapter.ViewHolder holder, final int position) {

        MainModel obj = mData.get(position);

        holder.mId.setText(Integer.toString(obj.getID()));
        holder.mTitle.setText(obj.getTitle());

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

        /**
         * @param itemView itemview;
         */
        public ViewHolder(final View itemView) {
            super(itemView);

            mId = (TextView) itemView.findViewById(R.id.tv_id);
            mTitle = (TextView) itemView.findViewById(R.id.tv_title);


        }


    }
}

