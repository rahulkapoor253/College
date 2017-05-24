package com.skeleton.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.skeleton.R;
import com.skeleton.model1.Post;

import java.util.List;

/**
 * Created by rahulkapoor on 24/05/17.
 */

public class MyPostAdapter extends RecyclerView.Adapter<MyPostAdapter.ViewHolder> {
    private List<Post> mPost;
    private Context mContext;


    /**
     *
     * @param context context
     * @param datalist datalist
     */
    public MyPostAdapter(final Context context, final List<Post> datalist) {

        this.mPost = datalist;
        this.mContext = context;

    }

    /**
     *
     * @param parent parent
     * @param viewType viewtype
     * @return return
     */
    @Override
    public MyPostAdapter.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.post_list_items, parent, false);

        return new ViewHolder(itemView);

    }

    /**
     *
     * @param holder holder
     * @param position position
     */
    @Override
    public void onBindViewHolder(final MyPostAdapter.ViewHolder holder, final int position) {

        Post obj = mPost.get(position);
        holder.mUserId.setText(Integer.toString(obj.getId()));
        holder.mUserTitle.setText(obj.getTitle());
        holder.mUserDescribe.setText(obj.getBody());

    }

    /**
     *
     * @return return
     */
    @Override
    public int getItemCount() {
        return mPost.size();
    }

    /**
     * viewholder inner class;
     */
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mUserId;
        private TextView mUserTitle;
        private TextView mUserDescribe;

        /**
         *
         * @param itemView itemview;
         */
        public ViewHolder(final View itemView) {
            super(itemView);

            mUserId = (TextView) itemView.findViewById(R.id.tv_uid);
            mUserTitle = (TextView) itemView.findViewById(R.id.tv_utitle);
            mUserDescribe = (TextView) itemView.findViewById(R.id.tv_udescribe);


        }
    }
}
