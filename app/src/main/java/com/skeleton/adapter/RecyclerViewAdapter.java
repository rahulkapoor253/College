package com.skeleton.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.skeleton.R;
import com.skeleton.fragment.FragmentProfile2;
import com.skeleton.model.profile2.ProfileCategory;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by rahulkapoor on 16/05/17.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private static int COUNT = 0;
    private Context mContext;
    private List<ProfileCategory> mCategory;
    private FragmentProfile2 frag;
    private ArrayList<View> arrayList = new ArrayList<>();

    public RecyclerViewAdapter(Context context, List<ProfileCategory> categories, FragmentProfile2 fragmentProfile2) {

        this.mContext = context;
        this.mCategory = categories;
        this.frag = fragmentProfile2;

    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_view, parent, false);

        arrayList.add(frag.mView1);
        arrayList.add(frag.mView2);
        arrayList.add(frag.mView3);
        arrayList.add(frag.mView4);
        arrayList.add(frag.mView5);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position) {

        holder.tvLabel.setText(mCategory.get(position).getName());
        //Picasso.with(mContext).load(mCategory.get(position).getPicURL().getThumbnail()).into(holder.civImage);

    }

    @Override
    public int getItemCount() {
        return mCategory.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView tvLabel;
        private CircleImageView civImage;
        private CircleImageView civBlur;
        private CircleImageView civMark;

        public ViewHolder(View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);

            tvLabel = (TextView) itemView.findViewById(R.id.tv_list_item);
            civImage = (CircleImageView) itemView.findViewById(R.id.civ_list_item);
            civBlur = (CircleImageView) itemView.findViewById(R.id.civ_blur);
            civMark = (CircleImageView) itemView.findViewById(R.id.civ_mark_item);

        }

        @Override
        public void onClick(View v) {
            int pos = getAdapterPosition();

            if (COUNT < 5) {
                if (civMark.getDrawable() == null) {
                    arrayList.get(COUNT).setBackgroundResource(R.color.view_color_check);
                    civMark.setImageResource(R.drawable.check_mark);
                    civBlur.setImageResource(R.color.translucent);
                    COUNT++;
                } else if (civMark.getDrawable() != null) {
                    arrayList.get(COUNT).setBackgroundResource(R.color.view_color_check_remove);
                    civMark.setImageDrawable(null);
                    civBlur.setImageDrawable(null);
                    COUNT--;
                }

            } else {
                if (civMark.getDrawable() != null) {
                    arrayList.get(COUNT).setBackgroundResource(R.color.view_color_check_remove);
                    civMark.setImageDrawable(null);
                    civBlur.setImageDrawable(null);
                    COUNT--;
                }


            }


        }
    }
}
