package com.example.rahul.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;

public class First_activity extends AppCompatActivity {

   public String[] android_version = {"cupcake","jellybean","marshmallow"
            ,"lollypop" ,
            "gingerbread","ice-cream sandwich","froyoo",
            "eclair","donut","naugat" };
    ArrayAdapter <String> adapter ;
    ListView lv ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);
        lv = (ListView) findViewById(R.id.lv_di);
         Arrays.sort(android_version);


        adapter = new  ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android_version);

        //connect this adapter with th list view
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                // toast isnt visible

                Toast.makeText(getBaseContext(),parent.getItemIdAtPosition(position)+"is selected"+id,Toast.LENGTH_LONG);
            }
        });

    }
}
