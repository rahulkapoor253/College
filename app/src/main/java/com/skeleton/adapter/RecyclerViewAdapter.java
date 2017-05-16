package com.skeleton.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.skeleton.R;
import com.skeleton.model.Category;
import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by rahulkapoor on 16/05/17.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context mContext;
    private List<Category> mCategory;

    public RecyclerViewAdapter(Context context, List<Category> categories) {
        this.mContext = context;
        this.mCategory = categories;

    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_view, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position) {

        holder.tvLabel.setText(mCategory.get(position).getName());
        Picasso.with(mContext).load(mCategory.get(position).getPicURL().getThumbnail()).into(holder.civImage);

    }

    @Override
    public int getItemCount() {
        return mCategory.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvLabel;
        private CircleImageView civImage;

        public ViewHolder(View itemView) {
            super(itemView);

            tvLabel = (TextView) itemView.findViewById(R.id.tv_list_item);
            civImage = (CircleImageView) itemView.findViewById(R.id.civ_list_item);

        }
    }
}
