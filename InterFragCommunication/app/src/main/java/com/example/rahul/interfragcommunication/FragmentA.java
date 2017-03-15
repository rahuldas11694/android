package com.example.rahul.interfragcommunication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by rahul on 15/03/17.
 */

public class FragmentA extends Fragment implements View.OnClickListener {

    Button button;
    int counter;
    Communicator comm;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            Log.e("Fragment A", "Created for the first time");
        }else {
            Log.e("Fragment A","orientation changed ");
            counter = savedInstanceState.getInt("counter",0);
        }
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        comm = (Communicator) getActivity();
        button = (Button) getActivity().findViewById(R.id.btn);
        button.setOnClickListener(this);
    }

    // onSaveInstanceState gets called jst b4 the fragment gets destroyed
    // u should save the value


    @Override
    public void onSaveInstanceState(Bundle outState) {
        Log.e("fragmentA","saving the insatance of counter");
        outState.putInt("counter", counter);
    }

    @Override
    public void onClick(View v) {
        counter++;
        comm.respond("the button was clicked " + counter + "times");
    }
}
