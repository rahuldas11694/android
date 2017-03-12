package com.example.rahul.autocompletetv;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;

import android.os.Bundle;

import java.util.ArrayList;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class second_activity extends AppCompatActivity implements View.OnClickListener  {

    ArrayList<String> selection = new ArrayList<String>();
    TextView final_text;
    Button done;
    CheckBox app;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second_activity);
//        ActionBar  actionBar = getActionBar();
//         actionBar.setDisplayHomeAsUpEnabled(true);
        final_text = (TextView) findViewById(R.id.final_result);
        final_text.setEnabled(false);
        done = (Button) findViewById(R.id.done);
           app = (CheckBox) findViewById(R.id.apple);

        app.setOnClickListener(this);

//        done.setOnClickListener(new View.OnClickListener() {
//            String final_fruits = "";
//
//            public void onClick(View view) {
//                for (String selections : selection) {
//                    final_fruits = final_fruits + selections + "\n";
//
//                }
//                final_text.setText(final_fruits); // to add the values in text view
//                final_text.setEnabled(true);
//
//
//            }
//
//        });
    }


    public void selectItem(View view) {
        Boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {    // whenever clickes then get the id and check
            case R.id.apple:
                if (checked) {
                    selection.add("apple");
                } else {
                    selection.remove("apple");
                }
                break;

            case R.id.orange:
                if (checked) {
                    selection.add("orange");
                } else {
                    selection.remove("orange");
                }
                break;
            case R.id.potato:
                if (checked) {
                    selection.add("potato");
                } else {
                    selection.remove("potato");
                }
                break;
            case R.id.carrot:
                if (checked) {
                    selection.add("carrot");
                } else {
                    selection.remove("carrot");
                }
                break;


        }
    }

    @Override
    public void onClick(View v) {
        CheckBox c = (CheckBox) v;
        if(c.isChecked()){
            Toast.makeText(this,"you clicked apple",Toast.LENGTH_LONG).show();

        }else{
            Toast.makeText(this,"you unclicked",Toast.LENGTH_LONG).show();

        }

    }

// onclick listenre is not proper for this
    public void output(View view) {
        String final_fruits = "";

        for (String selections : selection) {
            final_fruits = final_fruits + selections + "\n";

        }
        final_text.setText(final_fruits); // to add the values in text view
        final_text.setEnabled(true);


    }

}
