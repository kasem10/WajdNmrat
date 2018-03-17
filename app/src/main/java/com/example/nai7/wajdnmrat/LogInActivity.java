package com.example.nai7.wajdnmrat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LogInActivity extends AppCompatActivity {

    private EditText etUserName;
    private EditText etPassword;
    private Button btnLogIn;
    private Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        etUserName=(EditText)findViewById(R.id.etUserName);
        etPassword=(EditText)findViewById(R.id.etPassword);
        btnLogIn=(Button)findViewById(R.id.btnLogIn);
        btnSignUp=(Button)findViewById(R.id.btnSignUp);


    }


    public void checkUserNamePassword(View view) {

        String UserName = etUserName.getText().toString();



    }
}
