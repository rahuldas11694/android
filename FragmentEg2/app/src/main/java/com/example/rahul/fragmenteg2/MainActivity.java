package com.example.rahul.fragmenteg2;

import android.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("mainActivity","on create activity");
        setContentView(R.layout.activity_main);

        MyFragment frag = new MyFragment();
        android.app.FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.activity_main,frag,"fragOne");
        transaction.commit();
    }
}
