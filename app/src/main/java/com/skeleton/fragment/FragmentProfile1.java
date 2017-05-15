package com.skeleton.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.PopupMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.skeleton.R;

/**
 * Created by rahulkapoor on 13/05/17.
 */

public class FragmentProfile1 extends Fragment {

    private TextView tvRelation, tvHeight, tvBodyType, tvSmoke, tvReligion, tvEthnicity, tvDrink;
    private PopupMenu mPopUp;
    private View mView1, mView2, mView3, mView4, mView5, mView6, mView7;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile_1, container, false);

        init(view);

        tvRelation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                mPopUp = new PopupMenu(getContext(), tvRelation);
                mPopUp.getMenuInflater().inflate(R.menu.relationship, mPopUp.getMenu());

                mPopUp.show();
                mView1.setBackgroundResource(R.color.view_color_check);

            }
        });

        tvReligion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                mPopUp = new PopupMenu(getContext(), tvReligion);
                mPopUp.getMenuInflater().inflate(R.menu.religion, mPopUp.getMenu());

                mPopUp.show();
                mView2.setBackgroundResource(R.color.view_color_check);

            }
        });

        tvSmoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                mPopUp = new PopupMenu(getContext(), tvSmoke);
                mPopUp.getMenuInflater().inflate(R.menu.smoke_drink, mPopUp.getMenu());

                mPopUp.show();
                mView3.setBackgroundResource(R.color.view_color_check);

            }
        });

        tvDrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                mPopUp = new PopupMenu(getContext(), tvDrink);
                mPopUp.getMenuInflater().inflate(R.menu.smoke_drink, mPopUp.getMenu());

                mPopUp.show();
                mView5.setBackgroundResource(R.color.view_color_check);

            }
        });

        tvEthnicity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                mPopUp = new PopupMenu(getContext(), tvEthnicity);
                mPopUp.getMenuInflater().inflate(R.menu.ethnicity, mPopUp.getMenu());

                mPopUp.show();
                mView6.setBackgroundResource(R.color.view_color_check);

            }
        });

        tvBodyType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                mPopUp = new PopupMenu(getContext(), tvBodyType);
                mPopUp.getMenuInflater().inflate(R.menu.body_type, mPopUp.getMenu());

                mPopUp.show();
                mView7.setBackgroundResource(R.color.view_color_check);

            }
        });


        return view;
    }

    private void init(final View view) {

        tvRelation = (TextView) view.findViewById(R.id.tv_relationship_history);
        tvBodyType = (TextView) view.findViewById(R.id.tv_body_type);
        tvDrink = (TextView) view.findViewById(R.id.tv_drinking);
        tvSmoke = (TextView) view.findViewById(R.id.tv_smoking);
        tvReligion = (TextView) view.findViewById(R.id.tv_religion);
        tvEthnicity = (TextView) view.findViewById(R.id.tv_ethnicity);
        tvHeight = (TextView) view.findViewById(R.id.tv_height);
        mView1 = view.findViewById(R.id.view1);
        mView2 = view.findViewById(R.id.view2);
        mView3 = view.findViewById(R.id.view3);
        mView4 = view.findViewById(R.id.view4);
        mView5 = view.findViewById(R.id.view5);
        mView6 = view.findViewById(R.id.view6);
        mView7 = view.findViewById(R.id.view7);

    }


}
