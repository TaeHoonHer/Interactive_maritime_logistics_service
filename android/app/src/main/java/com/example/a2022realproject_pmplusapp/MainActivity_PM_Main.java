package com.example.a2022realproject_pmplusapp;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;
import java.util.Objects;

public class MainActivity_PM_Main extends AppCompatActivity {

    Toolbar toolbar;
    ImageButton miniweather;
    ImageButton gochatbot;
    ImageButton gonotice;

    TextView weather_sky;
    TextView weather_rain;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pm_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar); //툴바 선언
        setSupportActionBar(toolbar); //툴바를 불러오고

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.baseline_menu_white_24dp);
        getSupportActionBar().setDisplayShowTitleEnabled(false); //타이틀 이름 지우기


        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout); //activity_main_pm에서 선언한 레이아웃
        navigationView = (NavigationView) findViewById(R.id.navigation_view); //activity_main_pm 메뉴화면을 만든 레이아웃을 가져옴
        //드로어 레이아웃 안에 네비게이션 뷰를 적용한거임

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        item.setChecked(true);
                        drawerLayout.closeDrawers();

                        int id = item.getItemId();

                        if (id == R.id.LoginandMembership) {
                            Intent membership = new Intent(getApplicationContext(), MainActivity_Login.class);

                            startActivity(membership); //로그인/회원가입

                        } else if (id == R.id.DatagetShip) {
                            Intent shipdata = new Intent(getApplicationContext(), MainActivity_ShipData.class);

                            startActivity(shipdata); //선별 입출항 현황

                        } else if (id == R.id.DataControlShip){
                            Intent controlData = new Intent(getApplicationContext(), MainActivity_MshipData.class);

                            startActivity(controlData); //선별 관제 현황

                        } else if (id == R.id.WeatherData){
                            Intent weather = new Intent(getApplicationContext(), MainActivity_Weather.class);

                            startActivity(weather);

                        } else if (id == R.id.GoTochatbot){
                            Intent chatbot = new Intent(getApplicationContext(), MainActivity_ChatBot.class);

                            startActivity(chatbot);
                        } else if(id == R.id.informboard){
                            Intent inform = new Intent(getApplicationContext(), MainActivity_message_board.class);

                            startActivity(inform);
                        } else if(id == R.id.Setting){
                            Intent setting = new Intent(getApplicationContext(), MainActivity_Setting.class);

                            startActivity(setting);
                        }

                        return true;
                    }
                });

        miniweather = (ImageButton)findViewById(R.id.btn_mini_weather);
        miniweather.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity_Weather.class);
            startActivity(intent);
        });

        gochatbot =(ImageButton)findViewById(R.id.btn_go_chatbot);
        gochatbot.setOnClickListener(v ->{
            Intent intent = new Intent(getApplicationContext(),MainActivity_ChatBot.class);
            startActivity(intent);
        });

        gonotice = (ImageButton)findViewById(R.id.btn_go_notice);
        gonotice.setOnClickListener(v ->{
            Intent intent = new Intent(getApplicationContext(),MainActivity_Notice_Gathering.class); //모아보기로 이동
            startActivity(intent);
        });


        weather_sky = (TextView)findViewById(R.id.text_miniweather_sky);
        weather_rain = (TextView)findViewById(R.id.text_miniweather_rain);



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { //메뉴 버튼을 눌렀을 때
        if (item.getItemId() == android.R.id.home) {
            drawerLayout.openDrawer(GravityCompat.START);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

        @Override
        public void onBackPressed() { //뒤로가기 했을 때
            if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                drawerLayout.closeDrawer(GravityCompat.START);
            } else {
                super.onBackPressed();
            }
        }



    }


