package com.example.rahul.autocompletetv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;
import android.content.Context;
import java.lang.InterruptedException;
//import android.util.Log;

public class first_activity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    Button button;
    String[] country_name;

    @Override
    protected void onCreate(Bundle savedInstanceState)    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);

       autoCompleteTextView  =(AutoCompleteTextView) findViewById(R.id.country);

        country_name = getResources().getStringArray(R.array.country_names);
//        Log.d("rahul logggg",country_name[] )
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,country_name);
        autoCompleteTextView.setAdapter(arrayAdapter);

        button =(Button) findViewById(R.id.bt1);


        button.setOnClickListener(new View.OnClickListener()  {
//            Context context = getApplicationContext();
//            CharSequence text = "By clicking this u will see checkboxes example";
//            int duration = Toast.LENGTH_SHORT;
            @Override
            public void onClick(View v)  {
                Context context = getApplicationContext();
                CharSequence text = "By clicking this u will see checkboxes example";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context,text,duration);
                toast.setGravity(Gravity.TOP|Gravity.CENTER,0,0);
                toast.show();

                Intent intent = new Intent(getApplicationContext(),second_activity.class);
                startActivity(intent);
            }
        });




    }
}
