package com.example.rahul.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class first_activity extends AppCompatActivity {
        TextView final_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);
        final_result =  (TextView) findViewById(R.id.result);
        final_result.setEnabled(false);

    }

    public void onRadioButtonClicked(View view){
            boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()){
                case R.id.fruit_apple:
                    if(checked) {
                        final_result.setText("you select apple");
                        final_result.setEnabled(true);
                    }else{
                        final_result.setEnabled(false);
                    }
                    break;

            case R.id.fruit_banana:
                if(checked){
                    final_result.setText("you selected banana");
                    final_result.setEnabled(true);
                }else{
                    final_result.setEnabled(false);
                }
            case R.id.fruit_grapes:
                if(checked){
                    final_result.setText("you selected grapes");
                    final_result.setEnabled(true);
                    final_result.setAllCaps(true);
                }else{
                    final_result.setEnabled(false);
                }
            }


        }
}
