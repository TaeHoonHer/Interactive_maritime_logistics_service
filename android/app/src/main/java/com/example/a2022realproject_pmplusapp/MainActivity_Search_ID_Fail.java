package com.example.a2022realproject_pmplusapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;

import android.widget.ImageButton;

import java.util.Objects;


public class MainActivity_Search_ID_Fail extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        ImageButton gomain;
        ImageButton retry;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_search_id_fail);


        gomain = (ImageButton)findViewById(R.id.btn_go_pm_main_ship);
        retry = (ImageButton)findViewById(R.id.btn_replay_id);


        gomain.setOnClickListener(v ->{
            Intent intent = new Intent(getApplicationContext(), MainActivity_PM_Main.class);
            startActivity(intent);
        });

        retry.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity_Search_ID.class);
            startActivity(intent);
        });
    }
}