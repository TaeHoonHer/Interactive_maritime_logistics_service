package com.example.a2022realproject_pmplusapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageButton;

import java.util.Objects;

public class MainActivity_Search_PW_Success extends AppCompatActivity {

    ImageButton gologin;
    ImageButton gomain;
    TextView resultPw;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_search_pw_success);

        gologin = (ImageButton)findViewById(R.id.btn_go_login_searchpw_success);
        gomain = (ImageButton)findViewById(R.id.btn_go_main_searchpw_success);
        resultPw = (TextView)findViewById(R.id.text_user_pw);
        String userPw;


        gologin.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(),MainActivity_Login.class);
            startActivity(intent);
        });

        gomain.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity_PM_Main.class);
            startActivity(intent);
        });

        resultPw.setText("서버와 연결해서 가져온 데이터를 저장");
        String UserIdData = resultPw.getText().toString();



    }
}