package com.moringaschool.barterpata;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.btn_login)
    Button _loginButton;
    @BindView(R.id.btn_signup)
    TextView _signupButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

          _signupButton.setOnClickListener(this);
          _loginButton.setOnClickListener(this);

        };


        @Override
        public void onClick(View v) {
            // Start the Signup activity
            if(v == _signupButton) {

                Intent intent = new Intent(getApplicationContext(), SignupActivity.class);
                startActivity(intent);
            }
            if(v == _loginButton) {

                Intent intent = new Intent(getApplicationContext(),Login.class);
                startActivity(intent);
            }




        }





}


