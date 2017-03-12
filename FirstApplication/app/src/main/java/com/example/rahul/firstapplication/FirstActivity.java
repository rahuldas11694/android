package com.example.rahul.firstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import  android.content.Intent;

public class FirstActivity extends AppCompatActivity {
    TextView textView;  // nw initialize this obj
    Button button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        // here u jst initialize yur TextView obj
        // this is an object so u have to type cast into corresponding class
        textView = (TextView) findViewById(R.id.tv_greeting);
        button2 = (Button) findViewById(R.id.first_btn);
        button3 = (Button) findViewById(R.id.second_btn);
        Log.e("FIRST ACTIVITY : ","FIRST ACTIVITY");

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                //intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP/*|Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_NEW_TASK*/);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, ThirdActivity.class);
//                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

}