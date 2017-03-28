package com.example.rahul.fragtransaction;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements FragmentManager.OnBackStackChangedListener  {

    FragmentManager manager;
    TextView text;
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Activity","main Activity");
        setContentView(R.layout.activity_main);
        manager = getFragmentManager(); //gives fragment manager associated with frag A
        text = (TextView) findViewById(R.id.message);
        manager.addOnBackStackChangedListener(this);
    }

    public void addA(View v) {
        FragmentA f1 = new FragmentA();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.group, f1, "A");
        transaction.addToBackStack("addA");
        transaction.commit();

    }

    public void addB(View v) {
        FragmentB f2 = new FragmentB();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.group, f2, "B");
        transaction.addToBackStack("addB");
        transaction.commit();

    }

    public void removeA(View v) {
        FragmentA f1 = (FragmentA) manager.findFragmentByTag("A");
        FragmentTransaction transaction = manager.beginTransaction();

        if (f1 != null) {
            transaction.remove(f1);
            transaction.addToBackStack("removeA");

            transaction.commit();
        } else {
            Log.d("TOAst", "TOAST");
            Toast.makeText(this, "Fragment A isnt added", Toast.LENGTH_LONG).show();
        }

    }

    public void removeB(View v) {
        FragmentB f2 = (FragmentB) manager.findFragmentByTag("B");
        FragmentTransaction transaction = manager.beginTransaction();

        if (f2 != null) {
            transaction.remove(f2);
            transaction.addToBackStack("remove B");

            transaction.commit();
        } else {

            Toast.makeText(this, "Fragment B isnt added", Toast.LENGTH_LONG).show();
            Log.d("TOAstBBB", "TOAST");
        }

    }

    public void replaceWithB(View v) {
        FragmentB f2 = new FragmentB();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.group, f2, "B");
        transaction.addToBackStack("replace with B");
        transaction.commit();
    }

    public void replaceWithA(View v) {
        FragmentA f1 = new FragmentA();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.group, f1, "A");
        transaction.addToBackStack("replace with A");
        transaction.commit();
    }

    public void attachA(View v) {
        FragmentA f1 = (FragmentA) manager.findFragmentByTag("A");
        FragmentTransaction transaction = manager.beginTransaction();
        if (f1 != null) {
            transaction.attach(f1);
            transaction.addToBackStack("attach A");
            transaction.commit();
        } else {
            Toast.makeText(this, "First add fragment to attach", Toast.LENGTH_SHORT).show();
        }

    }

    public void detachA(View v) {
        FragmentA f1 = (FragmentA) manager.findFragmentByTag("A");
        FragmentTransaction transaction = manager.beginTransaction();
        if (f1 != null) {
            transaction.detach(f1);
            transaction.addToBackStack("detach B");
            transaction.commit();
        } else {
            Toast.makeText(this, "detaching the frag", Toast.LENGTH_SHORT).show();
        }


    }

    public void back(View v) {

        manager.popBackStack();
    }

    public void popAddB(View v) {
        manager.popBackStack("addB",0);

    }

    @Override
    public void onBackStackChanged() {
        text.setText(text.getText()+"\n");
        text.setText(text.getText()+" The current status of back stack \n");
        int count = manager.getBackStackEntryCount();

            for( int i = count-1; i>=0; i--) {
                FragmentManager.BackStackEntry entry = manager.getBackStackEntryAt(i);
                text.setText(text.getText()+ " "+entry.getName() + "\n");
            }
            text.setText(text.getText()+ "\n");

    }
}
