package com.example.rahul.recyclerview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rahul.recyclerview.R;
import com.example.rahul.recyclerview.model.ListItem;

/**
 * Created by rahul on 04/03/17.
 */

public class DerpAdapter extends RecyclerView.Adapter<DerpAdapter.DerpHolder> {

    private ListItem listData;


    @Override
    public DerpHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(DerpHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    // now we are going to create view holder
    //

    class DerpHolder extends RecyclerView.ViewHolder {

        // so purpose of this view holder class is to heplp us to assign data
        // to approprate places and represent a single view item of our recycler view

        private TextView title;
        private ImageView icon;
        private View container;

        public DerpHolder(View itemView) { // this view is nothing but ListItem layout
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.lbl_item_text);
            icon = (ImageView) itemView.findViewById(R.id.im_item_icon);
            container = itemView.findViewById(R.id.cont_item_root);
        }
    }

}
