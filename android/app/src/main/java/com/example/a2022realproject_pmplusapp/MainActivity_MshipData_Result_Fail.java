package com.example.a2022realproject_pmplusapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity_MshipData_Result_Fail extends AppCompatActivity {

    ImageButton replay;
    ImageButton gomain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_mship_data_result_fail);


        gomain = (ImageButton)findViewById(R.id.btn_replay_mshipdata);
        replay = (ImageButton)findViewById(R.id.btn_go_pm_main_mship);


        gomain.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity_PM_Main.class);
            startActivity(intent);
        });

        replay.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity_MshipData.class);
            startActivity(intent);
        });


    }
}