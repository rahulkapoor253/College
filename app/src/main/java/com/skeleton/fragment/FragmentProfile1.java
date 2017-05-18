package com.skeleton.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.skeleton.R;
import com.skeleton.activity.ProfileInfoActivty;
import com.skeleton.model.profile1.DataConstant;
import com.skeleton.model.Example;
import com.skeleton.model.profile1.ItemsChooser;
import com.skeleton.retrofit.APIError;
import com.skeleton.retrofit.ResponseResolver;
import com.skeleton.retrofit.RestClient;
import com.skeleton.util.customview.MaterialEditText;
import com.skeleton.util.dialog.CustomDialog;

import java.util.List;

/**
 * Created by rahulkapoor on 13/05/17.
 */

public class FragmentProfile1 extends BaseFragment {


    private View mView1, mView2, mView3, mView4, mView5, mView6, mView7;
    private ListView mListView;
    private MaterialEditText tvRelation, tvReligion, tvHeight, tvDrink, tvSmoke, tvEthnicity, tvBodytype;
    private List<String> mItems;
    private Button btnNext;
    private ItemsChooser chooser;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile_1, container, false);

        init(view);
        Intent intent = getActivity().getIntent();
        //exampleobj = intent.getParcelableExtra(SHARED_OBJ);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                ((ProfileInfoActivty)getActivity()).fragment2Calling();

            }
        });

        mListView = (ListView) view.findViewById(R.id.listview);
        RestClient.getApiInterface().getListData().enqueue(new ResponseResolver<DataConstant>(getContext(), true) {
            @Override
            public void success(DataConstant data) {
                chooser = data.getData();

            }

            @Override
            public void failure(APIError error) {

                Toast.makeText(getContext(), "failure in fetching list of qualities!", Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }

    @Override
    public void onClick(final View v) {
        super.onClick(v);
        final int id = v.getId();
        switch (id) {
            case R.id.tv_relationship_history:
                setDialog(R.string.relationship_history, chooser.getRelationshipHistory(), v);
                break;
            case R.id.tv_ethnicity:
                setDialog(R.string.ethnicity, chooser.getEthnicity(), v);
                break;
            case R.id.tv_religion:
                setDialog(R.string.religion, chooser.getReligion(), v);
                break;
            case R.id.tv_height:
                setDialog(R.string.height, chooser.getHeight(), v);
                break;
            case R.id.tv_body_type:
                setDialog(R.string.body_type, chooser.getBodyType(), v);
                break;
            case R.id.tv_smoking:
                setDialog(R.string.smoking, chooser.getSmoking(), v);
                break;
            case R.id.tv_drinking:
                setDialog(R.string.drinking, chooser.getDrinking(), v);
                break;
            default:
                break;

        }


    }

    private void callDialog(int title, List<String> mItems, View view) {

        FragmentManager fm = getChildFragmentManager();


    }

    private void setDialog(final int title, final List<String> list, final View v) {

        FragmentManager fm = getChildFragmentManager();
        CustomDialog.newInstance(getString(title),
                list, new CustomDialog.ItemClicked() {
                    @Override
                    public void sendText(final String text, final int viewId) {
                        ((MaterialEditText) v).setText(text);
                        setViewColor(((MaterialEditText) v).getId());
                    }
                }).show(fm, "dialog");


    }

    private void setViewColor(final int id) {

        switch (id) {
            case R.id.tv_relationship_history:
                mView1.setBackgroundResource(R.color.view_color_check);
                break;
            case R.id.tv_ethnicity:
                mView2.setBackgroundResource(R.color.view_color_check);
                break;
            case R.id.tv_religion:
                mView3.setBackgroundResource(R.color.view_color_check);
                break;
            case R.id.tv_height:
                mView4.setBackgroundResource(R.color.view_color_check);
                break;
            case R.id.tv_body_type:
                mView5.setBackgroundResource(R.color.view_color_check);
                break;
            case R.id.tv_smoking:
                mView6.setBackgroundResource(R.color.view_color_check);
                break;
            case R.id.tv_drinking:
                mView7.setBackgroundResource(R.color.view_color_check);
                break;
            default:
                break;

        }

    }


    private void init(final View view) {

        btnNext = (Button) view.findViewById(R.id.btn_next);
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
