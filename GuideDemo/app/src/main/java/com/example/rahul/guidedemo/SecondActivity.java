package com.example.rahul.guidedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class SecondActivity extends AppCompatActivity {

    public final static String MESSAGE_KEY = "com.example.rahul.msg";


    @Override
    // WHen send btn is clicked, you got all the intent on onCreate md
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        // now get the msg frm the intent obj
        String message = intent.getStringExtra(MESSAGE_KEY);

        /* now create text view for displaying this msg
           most of the view requires context
        */
        TextView textView = new TextView(SecondActivity.this);
        textView.setTextSize(45);
        textView.setText(message);
        setContentView(textView);


// onclick listener
        Button btn = (Button) findViewById(R.id._2nd);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(new Intent(SecondActivity.this,LinearLayout.class));
            }
        });



}
}
