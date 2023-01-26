package com.example.a2022realproject_pmplusapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

public class MainActivity_ChatBot extends AppCompatActivity {

    private ArrayList<Chatbot_DataItem> ChatdataList;

    ImageButton send_to_chatbot;
    TextView today;
    EditText user_say;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_chat_bot);


        toolbar = (Toolbar)findViewById(R.id.toolbar_chatbot_main);

        setSupportActionBar(toolbar);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.baseline_chevron_left_white_24dp);
        getSupportActionBar().setTitle("PM+ 매니저");


        send_to_chatbot = (ImageButton)findViewById(R.id.btn_send_chatbot_message);
        user_say = (EditText)findViewById(R.id.et_chatbot_usersay);

        initData();
    }

    private void initData(){
        ChatdataList = new ArrayList<>();
        ChatdataList.add(new Chatbot_DataItem("안녕하세요. PM+ 매니저입니다.",null,Chatbot_Content_Code.ViewType.LEFT_Content));
        ChatdataList.add(new Chatbot_DataItem("원하시는 서비스를 선택해주세요.",null,Chatbot_Content_Code.ViewType.LEFT_Content));
        ChatdataList.add(new Chatbot_DataItem("사용자 입력값 출력",null,Chatbot_Content_Code.ViewType.RIGHT_Content));
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