package com.example.rahul.flexblefrag2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements FragmentA.Communicator {

    FragmentA f1;
    FragmentB f2;
    FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = getFragmentManager();
        f1.setCommunicator(MainActivity.this);
        f1 = (FragmentA) manager.findFragmentById(R.id.fragment1);



    }

    @Override
    public void respond(int index) {
        f2 = (FragmentB) manager.findFragmentById(R.id.fragment2);
        // frag is not eq null and is visible which means it is landscape mode
        if(f2 != null && f2.isVisible()){  // landscape mode
            f2.changeData(index);
        } else {  // portrait mode
//            MAY OR MAY NOT BE BE NULL BUT IT IS NOT VISIBLE
            Intent intent = new Intent(this,AnotherActivity.class);
            intent.putExtra("index",index);
            startActivity(intent);


        }
    }
}
