package com.skeleton.fragment;

import android.support.v4.app.Fragment;
import android.view.View;

import com.skeleton.constant.ApiKeyConstant;
import com.skeleton.constant.AppConstant;

/**
 * Developer: Click labs
 * Dated: 03-03-2017.
 */

public abstract class BaseFragment extends Fragment implements AppConstant, ApiKeyConstant, View.OnClickListener {

    /**
     * @param v view
     */
    @Override
    public void onClick(final View v) {

    }
}
