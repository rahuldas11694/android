package com.example.rahul.flexblefrag2;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.util.Log;

/**
 * Created by rahul on 19/03/17.
 */

public class FragmentA extends Fragment implements AdapterView.OnItemClickListener {
    private static final String TAG = "FragmentA:On iTem Clicked";
    ListView list;
    Communicator communicator;

    public void setCommunicator(Communicator communicator) {
        this.communicator = communicator;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_a, container, false);
        list = (ListView) v.findViewById(R.id.list_view);
        // responsible for event listener
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.chapters, android.R.layout.simple_list_item_1);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);

        return v;

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        communicator.respond(position);

    }
    // linking appearance of fragment
   public interface Communicator {
        void respond(int index);
    }
}

