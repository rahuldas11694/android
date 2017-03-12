package com.example.rahul.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import  android.view.View;

import static com.example.rahul.togglebutton.R.array.country_names;

public class Spinner extends AppCompatActivity {

    View spinner;
    ArrayAdapter<CharSequence> adapter;
    // if u e=wnt to show the data from db then use cursor adapter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner_layout);

        spinner = findViewById(R.id.spinner);
        adapter = ArrayAdapter.createFromResource(this, country_names,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // now add adpater into the spinner
        spinner.setAdapter(adapter);
    }
}
