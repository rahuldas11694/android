package com.example.rahul.timepickerdialogfragment;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button dia_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dia_btn = (Button) findViewById(R.id.dia_btn);
        dia_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // create object of DialogHandler
        DialogHandler dialogHandler = new DialogHandler();
        dialogHandler.show(getSupportFragmentManager(),"time_picker");
    }
}
