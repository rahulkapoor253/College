package com.skeleton.fragment;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.widget.PopupMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.skeleton.R;
import com.skeleton.util.customview.MaterialEditText;

import java.util.List;

/**
 * Created by rahulkapoor on 13/05/17.
 */

public class FragmentProfile1 extends BaseFragment {


    private View mView1, mView2, mView3, mView4, mView5, mView6, mView7;
    private ListView mListView;
    private MaterialEditText tvRelation, tvReligion, tvHeight, tvDrink, tvSmoke, tvEthnicity, tvBodytype;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile_1, container, false);

        init(view);

        mListView = (ListView) view.findViewById(R.id.listview);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), R.layout.list_items, );

        mListView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onClick(final View v) {
        super.onClick(v);
        final int id = v.getId();
        switch (id) {
            case R.id.tv_relationship_history:

                mView1.setBackgroundResource(R.color.view_color_check);
                break;
            case R.id.tv_height:

                mView2.setBackgroundResource(R.color.view_color_check);
                break;
            case R.id.tv_body_type:

                mView3.setBackgroundResource(R.color.view_color_check);
                break;
            case R.id.tv_drinking:

                mView4.setBackgroundResource(R.color.view_color_check);
                break;
            case R.id.tv_smoking:

                mView5.setBackgroundResource(R.color.view_color_check);
                break;
            case R.id.tv_religion:

                mView6.setBackgroundResource(R.color.view_color_check);
                break;
            case R.id.tv_ethnicity:

                mView7.setBackgroundResource(R.color.view_color_check);
                break;
            default:
                break;


        }

    }

    private void init(final View view) {

        mView1 = view.findViewById(R.id.view1);
        mView2 = view.findViewById(R.id.view2);
        mView3 = view.findViewById(R.id.view3);
        mView4 = view.findViewById(R.id.view4);
        mView5 = view.findViewById(R.id.view5);
        mView6 = view.findViewById(R.id.view6);
        mView7 = view.findViewById(R.id.view7);
        tvEthnicity = (MaterialEditText) view.findViewById(R.id.tv_ethnicity);
        tvRelation = (MaterialEditText) view.findViewById(R.id.tv_relationship_history);
        tvReligion = (MaterialEditText) view.findViewById(R.id.tv_religion);
        tvHeight = (MaterialEditText) view.findViewById(R.id.tv_height);
        tvDrink = (MaterialEditText) view.findViewById(R.id.tv_drinking);
        tvSmoke = (MaterialEditText) view.findViewById(R.id.tv_smoking);
        tvBodytype = (MaterialEditText) view.findViewById(R.id.tv_body_type);

        tvEthnicity.setOnClickListener(this);
        tvRelation.setOnClickListener(this);
        tvReligion.setOnClickListener(this);
        tvHeight.setOnClickListener(this);
        tvDrink.setOnClickListener(this);
        tvSmoke.setOnClickListener(this);
        tvBodytype.setOnClickListener(this);

    }


}
