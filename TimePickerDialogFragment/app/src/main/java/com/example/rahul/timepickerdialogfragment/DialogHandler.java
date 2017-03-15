package com.example.rahul.timepickerdialogfragment;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.FragmentManager;
import android.text.format.DateFormat;
import android.icu.util.Calendar;
import android.os.Bundle;

/**
 * Created by rahul on 13/03/17.
 */

public class DialogHandler extends DialogFragment {
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        Calendar calendar = Calendar.getInstance();  // factory method , gives the vurrent date and time

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        TimePickerDialog dialog;
        // now we need a object of TimeSetting class to


        TimeSettings timeSettings = new TimeSettings(getActivity());

        dialog = new TimePickerDialog(getActivity(),timeSettings,hour,minute, DateFormat.is24HourFormat(getActivity())); // second agr should be the obj which handles the click event of time picker

        return dialog;
//        return super.onCreateDialog(savedInstanceState);
    }


    public void show(FragmentManager supportFragmentManager, String time_picker) {

    }
}
