package com.example.rahul.myapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by rahul on 28/03/17.
 */

public class MyAlert extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity()); // getActivity will get type casted to context

        builder.setTitle("This is the title");

//        builder.setMessage("Dialog message");
        builder.setMultiChoiceItems(R.array.days, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                Toast.makeText(getActivity(),"item was selected "+which+" was selected "+isChecked,Toast.LENGTH_SHORT).show();
            }
        });

        /**
         *    we can display list indide the dialog

        builder.setItems(R.array.days, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"Item was selected "+which , Toast.LENGTH_SHORT).show();
            }
        });
         */

        builder.setNegativeButton(R.string.cancle, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"negative button was clicked",Toast.LENGTH_SHORT).show();
            }
        });

        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"positive button was clicked",Toast.LENGTH_SHORT).show();
            }
        });

//        builder.setCancelable(false);
        Dialog dialog = builder.create();
        dialog.setCancelable(false);

        return dialog ;// when you return the system shows the dialog to the user

    }
}
