package com.example.a2022realproject_pmplusapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Objects;
import java.io.InputStreamReader;

public class MainActivity_Weather extends AppCompatActivity {


    Toolbar toolbar;
    ImageButton save_weather;
    Button search_weather;
    EditText user_search_weather;
    TextView ocean_name;
    TextView degree;
    TextView sky;
    TextView wind_detail;
    TextView wave_height;
    TextView rain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_weather);

        toolbar = (Toolbar)findViewById(R.id.toolbar_main_weather);
        setSupportActionBar(toolbar);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.baseline_chevron_left_white_24dp);
        getSupportActionBar().setTitle("해상 날씨 예보 조회");

        user_search_weather = (EditText)findViewById(R.id.et_weather_user_inform_write);


        ocean_name = (TextView) findViewById(R.id.ocean_name_weather);
        degree = (TextView)findViewById(R.id.degree_ocean_weather);
        sky = (TextView)findViewById(R.id.sky_weather);
        wind_detail = (TextView)findViewById(R.id.wind_weather_detail);
        wave_height = (TextView)findViewById(R.id.wave_height_detail);
        rain = (TextView)findViewById(R.id.rain_weather_detail);



        search_weather=(Button)findViewById(R.id.btn_weather_search);

        search_weather.setOnClickListener(v->{

            String searchdata = user_search_weather.getText().toString();

        });



        save_weather = (ImageButton)findViewById(R.id.btn_mainweather_continue);
        save_weather.setOnClickListener(v->{
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

