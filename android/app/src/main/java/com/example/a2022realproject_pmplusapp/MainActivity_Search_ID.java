package com.example.a2022realproject_pmplusapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;

import android.util.Patterns;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.EditText;
import android.widget.Toast;


import java.net.URISyntaxException;
import java.util.Objects;
import java.util.regex.Pattern;

import io.socket.client.IO;
import io.socket.client.Socket;

public class MainActivity_Search_ID extends AppCompatActivity {

    Socket mSocket;
    {
        try{
            mSocket = IO.socket("http://192.168.219.150:3000");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    ImageButton searchId;
    EditText username;
    EditText useremail;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_search_id);


        username = (EditText)findViewById(R.id.et_Login_id_search);
        useremail = (EditText)findViewById(R.id.et_Login_id_email_search);
        searchId = (ImageButton)findViewById(R.id.btn_go_id_result);
        Pattern pattern = Patterns.EMAIL_ADDRESS;


        toolbar = (Toolbar) findViewById(R.id.toolbar_seach_id);
        setSupportActionBar(toolbar);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.baseline_chevron_left_black_24dp);
        getSupportActionBar().setTitle("아이디 찾기");


        String inputname = username.getText().toString();
        String inputemail = useremail.getText().toString();


        searchId.setOnClickListener(v->{

            if(inputname.trim().equals("") || inputemail.trim().equals("")){
                Toast inform = Toast.makeText(this.getApplicationContext(),"빈칸 없이 모두 입력해주세요.",Toast.LENGTH_SHORT);
                inform.show();

            } else if(inputname.trim().length() < 2 ){
                Toast inform = Toast.makeText(this.getApplicationContext(),"이름을 2글자 이상으로 입력해주세요.",Toast.LENGTH_SHORT);
                inform.show();

            } else if(pattern.matcher(inputemail).matches()){
                Toast inform = Toast.makeText(this.getApplicationContext(),"이메일 형식에 맞춰 입력해주세요.",Toast.LENGTH_SHORT);
                inform.show();
            }

            else {
                Intent intent = new Intent(getApplicationContext(),MainActivity_Search_ID_Success.class);
                startActivity(intent);
            }

        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
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