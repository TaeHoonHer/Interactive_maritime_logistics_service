package com.example.a2022realproject_pmplusapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;

import android.widget.ImageButton;
public class MainActivity_Success_membership extends AppCompatActivity {

    ImageButton gomain;
    ImageButton goLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_success_membership);


        gomain = (ImageButton)findViewById(R.id.btn_go_main);
        goLogin =(ImageButton)findViewById(R.id.btn_go_login);

       gomain.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity_PM_Main.class);
           startActivity(intent);

        });

        goLogin.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity_Login.class);
            startActivity(intent);
        });



    }
}