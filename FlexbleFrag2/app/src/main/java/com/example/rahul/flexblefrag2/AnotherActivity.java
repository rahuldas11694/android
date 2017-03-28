package com.example.rahul.flexblefrag2;

import android.app.Fragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        Intent intent = getIntent();

        int index =   intent.getIntExtra("index", 0); // in case there is nothing comming in second paramente set 0 as default value


        FragmentB f2 = (FragmentB) getFragmentManager().findFragmentById(R.id.fragment2);
        if(f2 != null )
        f2.changeData(index);












    }


}
