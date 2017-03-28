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

public class FragmentB extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("rahul","Fragment B onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("rhaul","Fragment B onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_b,container,false);
        Log.d("rahul","Fragment B onCreate");
        return  view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("rahul","Fragment B onActivityCreated");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("rahul","Fragment B onPause");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("rahul","Fragment B onStop");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("rahul","Fragment B onDestroy view");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("rahul","Fragment B onDestroy");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("rahul","Fragment B onDetach");

    }
}
