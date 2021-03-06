package com.skeleton.util.dialog;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.skeleton.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rahulkapoor on 16/05/17.
 */

public class CustomDialog extends DialogFragment implements AdapterView.OnItemClickListener {

    private String mTitle;
    private ListView listView;
    private ArrayList<String> mItems;
    private ItemClicked mCallback;
    private TextView tvDialogTitle;


    /**
     * Empty Constructor
     */
    public CustomDialog() {

    }

    /**
     * @param title    title
     * @param list     list
     * @param callback callback
     * @return return
     */
    public static CustomDialog newInstance(final String title, final List<String> list, final ItemClicked callback) {
        final CustomDialog frag = new CustomDialog();
        frag.setListener(callback);
        final Bundle bundle = new Bundle();
        bundle.putString("title", title);
        bundle.putStringArrayList("list", (ArrayList<String>) list);
        frag.setArguments(bundle);
        return frag;
    }

    /**
     * @param inflater           inflater
     * @param container          container
     * @param savedInstanceState current insatace is saved;
     * @return return;
     */
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_view, container, false);

        mItems = getArguments().getStringArrayList("list");
        listView = (ListView) view.findViewById(R.id.listview);
        tvDialogTitle = (TextView) view.findViewById(R.id.tvdialog);
        tvDialogTitle.setText(getArguments().getString("title"));

        return view;
    }

    /**
     * @param savedInstanceState current instance is saved;
     */
    @Override
    public void onActivityCreated(final Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
                R.layout.custom_dialog, mItems);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    /**
     * @param parent   parent
     * @param view     view
     * @param position position
     * @param id       ID;
     */
    @Override
    public void onItemClick(final AdapterView<?> parent, final View view, final int position, final long id) {
        dismiss();
        setValues(mItems.get(position), parent.getId());

    }

    /**
     * Sets the value of the selected item and id of the edit text from which value is selected
     *
     * @param mValue value to be sent to other fragment
     * @param viewId id of the view from which the data is sent
     */
    public void setValues(final String mValue, final int viewId) {
        mCallback.sendText(mValue, viewId);
    }


    /**
     * @param callback value of interface object
     */
    public void setListener(final ItemClicked callback) {
        this.mCallback = callback;
    }

    /**
     * item clicked;
     */
    public interface ItemClicked {
        /**
         * @param text   value to be sent to other fragment
         * @param viewId id of the view from which the data is sent
         */
        void sendText(final String text, final int viewId);
    }


}
