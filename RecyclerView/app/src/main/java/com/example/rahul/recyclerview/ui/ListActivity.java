package com.example.rahul.recyclerview.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.rahul.recyclerview.R;
import com.example.rahul.recyclerview.adapter.DerpAdapter;
import com.example.rahul.recyclerview.model.DerpData;

public class ListActivity extends AppCompatActivity {

    private  RecyclerView recView;
    private DerpAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);
        recView = (RecyclerView) findViewById(R.id.rec_list);
        // LayoutManager: GridLayoutmanager or staggeredDridLayoutManager
        recView.setLayoutManager(new LinearLayoutManager(this));

        adapter =  new DerpAdapter(DerpData.getListData(),this);
        recView.setAdapter(adapter);


    }


}
