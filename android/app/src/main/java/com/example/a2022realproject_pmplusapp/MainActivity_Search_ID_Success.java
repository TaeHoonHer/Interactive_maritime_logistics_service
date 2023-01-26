package com.example.a2022realproject_pmplusapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageButton;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class MainActivity_Search_ID_Success extends AppCompatActivity {

    TextView resultText;
    ImageButton goLoginMain;
    ImageButton goMainPM;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_search_id_success);

        resultText = (TextView)findViewById(R.id.et_result_text_ID);
        goLoginMain = (ImageButton)findViewById(R.id.btn_go_login_searchid_success);
        goMainPM = (ImageButton)findViewById(R.id.btn_go_pmmain_search_id_success);


        goLoginMain.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(),MainActivity_Login.class);
            startActivity(intent);
        });

        goMainPM.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(),MainActivity_PM_Main.class);
            startActivity(intent);
        });

        resultText.setText("서버와 연결해서 가져온 데이터를 저장");
        String UserIdData = resultText.getText().toString();

    }
}