package com.example.rahul.flexblefrag2;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Created by rahul on 19/03/17.
 */

public class FragmentB extends Fragment {

    TextView text;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        text = (TextView) view.findViewById(R.id.textView);
        return view;

    }

    public void changeData(int index) {
        text.setText("Called to chanege data function ");
        String[] description = getResources().getStringArray(R.array.description);
        text.setText(description[index]);
    }
}
