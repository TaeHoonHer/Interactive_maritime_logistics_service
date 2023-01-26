package com.example.a2022realproject_pmplusapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import android.content.Intent;
import android.os.Bundle;

import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.Objects;

public class MainActivity_ShipData extends AppCompatActivity {


    Toolbar  toolbar;
    EditText shipcode;
    EditText shipday1;
    EditText shipday2;
    EditText codecall;

    ImageButton gofind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ship_data);


        toolbar = (Toolbar)findViewById(R.id.toolbar_main_ship_data); //툴바 선언
        setSupportActionBar(toolbar); //툴바를 불러오고

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.before);
        getSupportActionBar().setTitle("선박 입출항 조회");




        shipcode = (EditText)findViewById(R.id.et_prtAgCd_ship); //청코드, 필수

        shipday1 = (EditText)findViewById(R.id.et_sde_ship); //시작날짜

        shipday2 = (EditText)findViewById(R.id.et_ede_ship); //종료날짜, 필수

        codecall = (EditText)findViewById(R.id.et_clsgn_ship); //호출부호


        gofind = (ImageButton)findViewById(R.id.btn_data_search);

        gofind.setOnClickListener(v -> { //조회 버튼이 눌렸을 때 입력받은 값을 결과화면으로 보내고 화면 전환

            String Shipcode = shipcode.getText().toString().trim(); //청코드
            String Shipday1 = shipday1.getText().toString().trim();
            String Shipday2 = shipday2.getText().toString().trim();
            String Codecall = codecall.getText().toString().trim(); //호출부호

            Intent intent = new Intent(MainActivity_ShipData.this, MainActivity_Shipdata_Result.class);

            intent.putExtra("prt",Shipcode); // 020
            intent.putExtra("sde",Shipday1);
            intent.putExtra("ede",Shipday2);
            intent.putExtra("clsgnll",Codecall);

            startActivity(intent);
       });

        //데이터 출력하는 건 결과 화면에서..
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