package com.example.rahul.firstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;


/**
 * Created by rahul on 10/02/17.
 */

public class SecondActivity extends AppCompatActivity {

    Button button;

    @Override
    protected  void  onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Log.e("SECOND ACTIVITY : ","SECOND ACTIVITY");

        // app button on action bar takes to to its parent activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        button = (Button) findViewById(R.id.open_3rd_actvt);
        // onCLickListner
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                /* in following intent object only this is not provided
                 *  The error is because you are writing it in public void onClick(View v), where
                 *   'this' will mean instance of anonymous class that implements View.OnClickListener
                 */

                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }

        });

    }

}
