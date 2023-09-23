package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class loginScreen extends AppCompatActivity {

    TextView signUp, forgetPassword;

    ImageButton backArrow;
    Button login;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        signUp = findViewById(R.id.tv_signUp);
        forgetPassword = findViewById(R.id.tv_forgetPassword);
        login = findViewById(R.id.bt_login);

        backArrow = findViewById(R.id.ib_backArrow);

        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(loginScreen.this, mainscreen.class);
                startActivity(i);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(loginScreen.this, HomeScreen.class);
                startActivity(i);
            }
        });

        forgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(loginScreen.this, forgetPassword.class);
                startActivity(i);
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(loginScreen.this, signUp.class);
                startActivity(i);
            }
        });

    }
}