package com.example.a2022realproject_pmplusapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;

import android.text.TextUtils;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity_MshipData extends AppCompatActivity {

    Toolbar  toolbar;
    EditText mshipcode;
    EditText mshipday1;
    EditText mshipday2;
    EditText mcodecall;

    String mShipcode;
    String mShipday1;
    String mShipday2;
    String mCodecall;

    ImageButton gofind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_mship_data);

        toolbar = (Toolbar)findViewById(R.id.toolbar_mshipdata); //툴바 선언
        setSupportActionBar(toolbar); //툴바를 불러오고

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.before);
        getSupportActionBar().setTitle("선박 관제현황 조회");

       // boolean Itsture = false; //클래스로부터 데이터가 잘 받아져왔는지 신호를 받기 위한 변수, 조회된데이터가 없다면 false 아니면 true

        mshipcode = (EditText)findViewById(R.id.et_prtAgCd_mship); //청코드, 필수
        mShipcode = mshipcode.getText().toString().trim();

        mshipday1 = (EditText)findViewById(R.id.et_sde_mship); //시작날짜
        mShipday1 = mshipday1.getText().toString().trim();

        mshipday2 = (EditText)findViewById(R.id.et_ede_mship); //종료날짜, 필수
        mShipday2 = mshipday2.getText().toString().trim();

        mcodecall = (EditText)findViewById(R.id.et_clsgn_mship); //호출부호
        mCodecall = mcodecall.getText().toString().trim();


        gofind = (ImageButton)findViewById(R.id.btn_data_search);



        gofind.setOnClickListener(v -> { //조회 버튼이 눌렸을 때

                Intent intent = new Intent(MainActivity_MshipData.this, MainActivity_MshipData_Result.class);

                mShipcode = mshipcode.getText().toString().trim();
                mShipday1 = mshipday1.getText().toString().trim();
                mShipday2 = mshipday2.getText().toString().trim();
                mCodecall = mcodecall.getText().toString().trim();

                intent.putExtra("prt",mShipcode); // 020
                intent.putExtra("sde",mShipday1);
                intent.putExtra("ede",mShipday2);
                intent.putExtra("clsgnll",mCodecall);

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