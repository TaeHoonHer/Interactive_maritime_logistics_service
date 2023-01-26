package com.example.a2022realproject_pmplusapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;

import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.EditText;

import java.util.Objects;

public class MainActivity_Search_PW extends AppCompatActivity {


    EditText userId;
    EditText userEmail;
    ImageButton searchpw;
    String ID;
    String Email;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_search_pw);

        toolbar = (Toolbar)findViewById(R.id.toolbar_search_pw);
        setSupportActionBar(toolbar); //툴바를 불러오고

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.baseline_chevron_left_black_24dp);
        getSupportActionBar().setTitle("비밀번호 찾기");


        userId = (EditText)findViewById(R.id.et_Login_pw_name);
        ID = userId.getText().toString();

        userEmail = (EditText)findViewById(R.id.et_Login_pw_email_search);
        Email = userEmail.getText().toString();


        searchpw = (ImageButton)findViewById(R.id.btn_go_pw_result);
        searchpw.setOnClickListener(v->{

            Intent intent = new Intent(getApplicationContext(),MainActivity_Search_PW_Fail.class);
            startActivity(intent);
        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { //뒤로가기 했을 때
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
            default:
                break;
        }
        return super. onOptionsItemSelected(item);
    }
}