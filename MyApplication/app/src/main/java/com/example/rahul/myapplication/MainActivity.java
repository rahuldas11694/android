package com.example.rahul.myapplication;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, MyDialog.Communicator {

    Button showButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showButton = (Button) findViewById(R.id.showDialog);
        showButton.setOnClickListener(this);
        Log.d("MainActivity","setcontent view");
        System.out.println("Printinf showButton---->"+showButton);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.showDialog){
            Log.d("Main activity","showDialog button clicked");
            FragmentManager manager = getFragmentManager();
            MyDialog myDialog = new MyDialog();
            myDialog.show(manager,"MyDialog");
        }
    }

    @Override
    public void onDialogMessage(String message) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();

    }
}
