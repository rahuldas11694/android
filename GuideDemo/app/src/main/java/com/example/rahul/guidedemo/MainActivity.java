package com.example.rahul.guidedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    EditText message_text;
    public final static String MESSAGE_KEY = "com.example.rahul.msg";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void sendMessage(View view){

            message_text =(EditText)findViewById(R.id.et_msg);

            String message = message_text.getText().toString();

            Intent intent = new Intent(getApplicationContext(),SecondActivity.class);

            // to pass one activity data into second use putExtras()
            // i.e attaching data to the intent object

            intent.putExtra(MESSAGE_KEY,message);

            startActivity(intent);

    }




    }

