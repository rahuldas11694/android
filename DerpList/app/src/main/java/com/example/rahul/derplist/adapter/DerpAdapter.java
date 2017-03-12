package com.example.rahul.derplist.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rahul.derplist.R;
import com.example.rahul.derplist.model.ListItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rahul on 11/03/17.
 */

public class DerpAdapter extends RecyclerView.Adapter<DerpAdapter.DerpHolder> {

    private List<ListItem> listData;
    private LayoutInflater inflater;
    private ItemClickCallback itemClickCallback;



    public interface ItemClickCallback{
        void onItemClick(int p);
        void onSecondaryIconClick(int p);
    }

    public void setItemClickCallback(final ItemClickCallback itemClickCallback){
        this.itemClickCallback = itemClickCallback;
    }

    // create constructor
    public DerpAdapter(List<ListItem> listData, Context c) {
        /**  we are layout inflater from layout context c
         */
        this.inflater = LayoutInflater.from(c);
        this.listData = listData;
    }

    @Override
    public DerpHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create new viewHolder object  rahul
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new DerpHolder(view);
    }

    @Override
    public void onBindViewHolder(DerpHolder holder, int position) {
        // rahul
        /**
         * we can use this position to grab appropriate piece of data in out list
         */
        ListItem item = listData.get(position); //factory method see generic
        holder.title.setText(item.getTitle()); // this function is in ListItem.jsvs filr
        //holder.icon.setImageResource(item.getImageResId()); // this function is in ListItem.jsvs filr
        holder.subTitle.setText(item.getSubTitle());
        if(item.isFavourite()){
            holder.secondaryIcon.setImageResource(R.drawable.ic_star_black_24dp);
        }else {
            holder.secondaryIcon.setImageResource(R.drawable.ic_star_border_black_24dp);
        }
}

    public void setListData(ArrayList<ListItem> exerciseList){
        this.listData.clear();
        this.listData.addAll(exerciseList);

    }

    @Override
    public int getItemCount() {
        // this tells the adapter how many view holder objects its going to need to create
        return listData.size();
    }
    // recyclers view adapter need VIewHolder object

    class DerpHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        //purpose of this view holder class is to help us assign data to the appropriate places
        // and kind of represent a single view item of our recycler view

        private TextView title;
        private TextView subTitle;
        private ImageView thumbnail;
        private ImageView secondaryIcon;
        private View container; // this is a linear layout


        public DerpHolder(View itemView) {  //
            super(itemView);

            // get a reference from layout
            // we need to reference above itemView taht gets passed in
            // which is actually list_item.xml file
            title = (TextView) itemView.findViewById(R.id.lbl_item_text);
            subTitle = (TextView) itemView.findViewById(R.id.lbl_item_sub_title);
            thumbnail = (ImageView) itemView.findViewById(R.id.im_item_icon);
            secondaryIcon = (ImageView) itemView.findViewById(R.id.im_item_icon_secondary);
            secondaryIcon.setOnClickListener(this);
            container = itemView.findViewById(R.id.cont_item_root);
            container.setOnClickListener(this);


        }

        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.cont_item_root) {
                itemClickCallback.onItemClick(getAdapterPosition());
            } else {
                itemClickCallback.onSecondaryIconClick(getAdapterPosition());

            }
        }
    }


}
