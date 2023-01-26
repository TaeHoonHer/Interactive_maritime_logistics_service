package com.example.a2022realproject_pmplusapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;

import java.net.URISyntaxException;
import java.util.Objects;

import io.socket.client.IO;
import io.socket.client.Socket;
public class MainActivity_Login extends AppCompatActivity {


    ImageButton goLogin;
    EditText userID;
    EditText userPW;
    Button MemberConversion;
    Button searchpw;
    Button searchid;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        goLogin = (ImageButton) findViewById(R.id.btn_go_login_login);
        MemberConversion = (Button)findViewById(R.id.btn_go_member);
        searchid = (Button)findViewById(R.id.btn_findID);
        searchpw = (Button)findViewById(R.id.btn_findPW);

        userID = (EditText)findViewById(R.id.et_Login_ID);
        userPW = (EditText)findViewById(R.id.et_Login_PW);

        toolbar = (Toolbar)findViewById(R.id.toolbar_login);
        setSupportActionBar(toolbar); //툴바를 불러오고

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.baseline_chevron_left_black_24dp);
        getSupportActionBar().setTitle("");


        MemberConversion.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity_Membership.class);
            startActivity(intent);

        }); //람다식(익명함수)으로 작성, 회원가입 버튼 클릭 시  화면 전환

        searchid.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(),MainActivity_Search_ID.class);
            startActivity(intent);

        });

        searchpw.setOnClickListener(v ->{
            Intent intent = new Intent(getApplicationContext(), MainActivity_Search_PW.class);
            startActivity(intent);

        });


        goLogin.setOnClickListener(v -> {
            String ID = userID.getText().toString();
            String PW = userPW.getText().toString();

            if(ID.trim().equals("") || PW.trim().equals("")){

                Toast.makeText(getApplicationContext(), "빈칸없이 입력해주세요.", Toast.LENGTH_SHORT).show();

            } else if(ID.length() < 1){
                Toast.makeText(getApplicationContext(), "아이디를 두글자 이상 입력해주세요.", Toast.LENGTH_SHORT).show();

            }  else if(PW.length() < 4) {
                Toast.makeText(getApplicationContext(), "비밀번호를 다섯글자 이상 입력해주세요.", Toast.LENGTH_SHORT).show();

            }

            else{
                Intent intent = new Intent(getApplicationContext(),MainActivity_PM_Main.class);
                startActivity(intent);
            }

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