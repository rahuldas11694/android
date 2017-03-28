package com.example.rahul.fragtransaction;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rahul on 23/03/17.
 */

public class FragmentA extends Fragment {
    @Override
    public void onAttach(Context context) {
        Log.d("rahul","FragmentA onAttach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Log.d("rahul","Fragment on create");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_a,container,false);
        Log.d("rahul","Fragment oncreateview");
        return v;

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("rahul","OnActivity created");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("rahul","Fragment a onpause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("rahul","Fragment a onStop");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("rahul","FragmentA onResume");

    }

    @Override
    public void onStart() {

        super.onStart();
        Log.d("rahul","Fragment a onStart");

    }

    @Override
    public void onDestroyView() {
        super.onDestroy();
        Log.d("rahul","Fragment a onDestroyView");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("rahul","Fragment a onDestroy");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("rahul","Fragment a onDetach");

    }
}
/*
sequence:
D/rahul: Fragment on create
D/rahul: Fragment oncreateview
D/rahul: OnActivity created
D/rahul: Fragment a onStart
D/rahul: FragmentA onResume
D/rahul: Fragment a onpause
D/rahul: Fragment a onStop
D/rahul: Fragment a onStart
D/rahul: FragmentA onResume

 */