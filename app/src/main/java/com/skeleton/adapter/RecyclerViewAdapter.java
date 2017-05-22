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

    private static int count = 0;
    private static int myCount = 0;
    private Context mContext;
    private List<ProfileCategory> mCategory;
    private FragmentProfile2 frag;
    private ArrayList<View> arrayList = new ArrayList<>();

    /**
     * @param context          context
     * @param categories       categories;
     * @param fragmentProfile2 frag profile;
     */
    public RecyclerViewAdapter(final Context context, final List<ProfileCategory> categories, final FragmentProfile2 fragmentProfile2) {

        this.mContext = context;
        this.mCategory = categories;
        this.frag = fragmentProfile2;

    }

    /**
     * @param parent   parent
     * @param viewType viewType
     * @return return view to viewHolder;
     */
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_view, parent, false);


        arrayList = frag.getList();

        return new ViewHolder(view);
    }

    /**
     * @param holder   holder
     * @param position pos
     */
    @Override
    public void onBindViewHolder(final RecyclerViewAdapter.ViewHolder holder, final int position) {

        holder.tvLabel.setText(mCategory.get(position).getName());
        //Picasso.with(mContext).load(mCategory.get(position).getPicURL().getThumbnail()).into(holder.civImage);

    }

    /**
     * @return return;
     */
    @Override
    public int getItemCount() {
        return mCategory.size();
    }

    /**
     * view holder inner class;
     */
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView tvLabel;
        private CircleImageView civImage;
        private CircleImageView civBlur;
        private CircleImageView civMark;

        /**
         * @param itemView itemView;
         */
        public ViewHolder(final View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);

            tvLabel = (TextView) itemView.findViewById(R.id.tv_list_item);
            civImage = (CircleImageView) itemView.findViewById(R.id.civ_list_item);
            civBlur = (CircleImageView) itemView.findViewById(R.id.civ_blur);
            civMark = (CircleImageView) itemView.findViewById(R.id.civ_mark_item);

        }

        /**
         * @param v view;
         */
        @Override
        public void onClick(final View v) {
            int pos = getAdapterPosition();

            if (count < 5) {
                if (civMark.getDrawable() == null) {
                    arrayList.get(myCount).setBackgroundResource(R.color.view_color_check);
                    myCount++;
                    civMark.setImageResource(R.drawable.check_mark);
                    civBlur.setImageResource(R.color.translucent);
                    count++;
                } else if (civMark.getDrawable() != null) {
                    arrayList.get(myCount).setBackgroundResource(R.color.view_color_check_remove);
                    arrayList.remove(myCount);
                    civMark.setImageDrawable(null);
                    civBlur.setImageDrawable(null);
                    count--;
                }

            } else {
                if (civMark.getDrawable() != null) {
                    arrayList.get(count).setBackgroundResource(R.color.view_color_check_remove);
                    arrayList.remove(myCount);
                    civMark.setImageDrawable(null);
                    civBlur.setImageDrawable(null);
                    count--;
                }


            }


        }
    }
}
