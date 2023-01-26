package com.example.a2022realproject_pmplusapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity_Search_PW_Fail extends AppCompatActivity {

    ImageButton gomain;
    ImageButton retry;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_search_pw_fail);


        gomain = (ImageButton)findViewById(R.id.btn_go_pm_main_ship);
        retry = (ImageButton)findViewById(R.id.btn_replay_pw);

        gomain.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity_PM_Main.class);
            startActivity(intent);
        });

        retry.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity_Search_PW.class);
            startActivity(intent);
        });
    }
}