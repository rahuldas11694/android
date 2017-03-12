package com.example.rahul.floatinglabeledittext;

import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.view.View;
import android.widget.Button;

public class SignUpActivity extends AppCompatActivity implements OnClickListener   {
    private static final String TAG = "RegisterActivity";
    private Vibrator vib;
    private EditText signupInputName, signupInputEmail, signupInputPassword, signupInputDOB;
    private TextInputLayout signupInputLayoutName, signupInputLayoutEmail,
    signupInputLayoutPassword, signupInputLayoutDOB;
    private Button btnSignUP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_activity);

        signupInputLayoutName = (TextInputLayout) findViewById(R.id.signup_input_layout_name);
        signupInputLayoutEmail = (TextInputLayout) findViewById(R.id.signup_input_layout_email);
        signupInputLayoutPassword = (TextInputLayout) findViewById(R.id.signup_input_layout_password);
        signupInputLayoutDOB = (TextInputLayout) findViewById(R.id.signup_input_layout_dob);

        signupInputName = (EditText) findViewById(R.id.signup_input_name);
        signupInputEmail = (EditText) findViewById(R.id.signup_input_email);
        signupInputPassword = (EditText) findViewById(R.id.signup_input_password);
        signupInputDOB = (EditText) findViewById(R.id.signup_input_dob);


        btnSignUP = (Button) findViewById(R.id.btn_signup);

        btnSignUP.setOnClickListener(this);
    } // end of oncreate function


    @Override
    public void onClick(View v) {

    }
}
