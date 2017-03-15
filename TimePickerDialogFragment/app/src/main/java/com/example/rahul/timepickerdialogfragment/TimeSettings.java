package com.example.rahul.timepickerdialogfragment;

import android.app.TimePickerDialog;
import android.content.Context;
import android.widget.TimePicker;
import android.widget.Toast;

/** THe purpose of this java class is to handle the click event of the time picker
 * Created by rahul on 13/03/17.
 */

public class TimeSettings implements TimePickerDialog.OnTimeSetListener{
    // here we need context object
    Context context;

    public TimeSettings(Context context) {
        this.context = context;
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        Toast.makeText(context,"Selected time is hour:"+hourOfDay+"minutes"+minute,Toast.LENGTH_SHORT);

    }
}
