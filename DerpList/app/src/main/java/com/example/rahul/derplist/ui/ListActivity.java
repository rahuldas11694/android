package com.example.rahul.derplist.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.rahul.derplist.R;
import com.example.rahul.derplist.adapter.DerpAdapter;
import com.example.rahul.derplist.model.DerpData;
import com.example.rahul.derplist.model.ListItem;

import java.util.ArrayList;

// this is the main activity

public class ListActivity extends AppCompatActivity implements DerpAdapter.ItemClickCallback {
    private  static  final String BUNDLE_EXTRAS = "BUNDLE_EXTRAS";
    private static final String EXTRA_QUOTE = "EXTRA_QUOTE";
    private static final String EXTRA_ATTR = "EXTRA_ATTR";


    private RecyclerView recView;
    private DerpAdapter adapter;
    private ArrayList listData;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listData = (ArrayList) DerpData.getListData();

        recView = (RecyclerView)findViewById(R.id.rec_list);
        // layoutManager
        recView.setLayoutManager(new LinearLayoutManager(this));
                                    //className.method();
        adapter = new DerpAdapter(DerpData.getListData(),this); // this is a representation of 12 list of list items
        // that we are going to pass into the adapter
        recView.setAdapter(adapter);
        adapter.setItemClickCallback(this);
    }

    @Override
    public void onItemClick(int p) {
        ListItem item = (ListItem) listData.get(p);

        Intent i = new Intent(this,DetailActivity.class);

        Bundle extras = new Bundle();
        extras.putString(EXTRA_QUOTE,item.getTitle());
        extras.putString(EXTRA_ATTR,item.getSubTitle());
        i.putExtra(BUNDLE_EXTRAS,extras);
        startActivity(i);
    }

    @Override
    public void onSecondaryIconClick(int p) {
        ListItem item = (ListItem) listData.get(p);

        // update our data

        if (item.isFavourite()){
            item.setFavourite(true);
        }else {
            item.setFavourite(false);
        }
        //pass new data to adapter and update

        adapter.setListData(listData);
        adapter.notifyDataSetChanged();
        //


    }
}
