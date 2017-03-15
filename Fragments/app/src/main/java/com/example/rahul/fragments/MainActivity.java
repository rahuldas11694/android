package com.example.rahul.fragments;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import  android.app.FragmentManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
        Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("method","on create");
        b1 = (Button) findViewById(R.id.btn_1);
        b2 = (Button) findViewById(R.id.btn_2);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        switch(v.getId()){
            case R.id.btn_1 :
                Log.e("in","on clicke btn 1");
                FragmentOne fr1 = new FragmentOne();
                ft.add(R.id.frag1,fr1);
                ft.commit();
                break;

            case R.id.btn_2:
                Log.e("in","on click btn 2");
                FragmentTwo fr2 = new FragmentTwo();
                ft.add(R.id.frag2,fr2);
                ft.commit();
                break;



        }

    }
}
