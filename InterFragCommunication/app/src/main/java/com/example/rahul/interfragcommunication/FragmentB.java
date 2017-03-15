package com.example.rahul.interfragcommunication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by rahul on 15/03/17.
 */

public class FragmentB extends Fragment {

    TextView textView;
    String data;

   // @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        savedInstanceState.getString("text");
//    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_b, container, false);

        if (savedInstanceState == null) {
            Log.e("fragment B ", "Created for the first time");

        } else {
            Log.e("frag B","saved instance state");
            data = savedInstanceState.getString("text");
            TextView textView = (TextView) view.findViewById(R.id.tv);
            textView.setText(data);
        }
        return  view ;

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView = (TextView) getActivity().findViewById(R.id.tv);

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e("frag B","Getting destroyed and saving data");
        outState.putString("text", data);
    }

    public void changeText(String data) {
        this.data = data;
        textView.setText(data);
    }
}
