package com.example.rahul.togglebutton;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.os.Vibrator;


import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;


public class first_act extends AppCompatActivity implements View.OnClickListener {
    ToggleButton toggleButton;
    TextView textView;
    Switch switchB;
    LinearLayout ll;
    WifiManager wifiManager;
    Vibrator vibrate;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_act);

        wifiManager = (WifiManager) this.getSystemService(Context.WIFI_SERVICE);
        vibrate = (Vibrator) this.getSystemService(Context.VIBRATOR_SERVICE);


        ll = (LinearLayout) findViewById(R.id.first_act);

        textView = (TextView) findViewById(R.id.result);

        textView.setVisibility(View.INVISIBLE);

        toggleButton = (ToggleButton) findViewById(R.id.toggle_button_1);
        toggleButton.setOnClickListener(this);

        switchB = (Switch) findViewById(R.id.switch_button);
        // Toggle button and switch buttons are subcless of compound button

        switchB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textView.setText("wifi on");
                    ll.setBackgroundColor(Color.BLACK);
                    wifiManager.setWifiEnabled(isChecked);

                    textView.setVisibility(View.VISIBLE);
                } else {
                    textView.setText("wifi off");
                    ll.setBackgroundColor(Color.BLUE);
                    wifiManager.setWifiEnabled(isChecked);
//                    textView.setVisibility(View.INVISIBLE);
                }
            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void onClick(View view) {
        boolean checked = ((ToggleButton) view).isChecked();

        if (checked) {
            textView.setText("Vibrate on");
            // Vibrate for 500 milliseconds
//            vibrate.vibrate(5* 60 * 1000);
            long[] pattern = {0, 100, 100,600};
            vibrate.vibrate(pattern,0);


            textView.setVisibility(View.VISIBLE);
            textView.setTextColor(Color.WHITE);
        } else {
            textView.setText("Vibrate off");
            textView.setTextColor(Color.YELLOW);
            vibrate.cancel();
//                   textView.setVisibility(View.INVISIBLE);
        }
//            case R.id.switch_button :
//                if(true) {
//                }


    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("first_act Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}

