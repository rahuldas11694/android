package com.example.rahul.myapplication;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by rahul on 28/03/17.
 */

public class MyDialog extends DialogFragment implements View.OnClickListener {
    Button btn_no, btn_yes;
    Communicator communicator;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
//        assign object of out activity to this communicator
        communicator = (Communicator) context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("2MyDialog------>","on create view");
        // here null bcz Gialog fragment is seperate part and it does not require parent
        View view = inflater.inflate(R.layout.my_dialog,null);

        btn_no = (Button) view.findViewById(R.id.no_btn);
        btn_yes = (Button) view.findViewById(R.id.yes_btn);

        btn_no.setOnClickListener(this);
        btn_yes.setOnClickListener(this);

        /** if you click outside of the fragment then dialogfragment gets invisible
         *  so to avoid this the following mehod is used
        */
        setCancelable(false);

        return view;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.no_btn :
                communicator.onDialogMessage("NO was clicked");
                dismiss();
                //Toast.makeText(getActivity(),"No Button was clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.yes_btn :
                communicator.onDialogMessage("YES was clicked");
                dismiss();
                //Toast.makeText(getActivity(),"Yes Button was clicked",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    interface  Communicator {

         void onDialogMessage(String message);

    }

}
