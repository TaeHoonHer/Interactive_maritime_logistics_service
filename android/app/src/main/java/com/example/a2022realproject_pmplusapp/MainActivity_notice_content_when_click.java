package com.example.a2022realproject_pmplusapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.TextView;


import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Document;
import org.w3c.dom.Element;

import java.io.IOException;
import java.lang.ref.WeakReference;

public class MainActivity_notice_content_when_click extends AppCompatActivity {


    private String URL = "https://www.gicoms.go.kr/know/know_06_view.do";
    String msg;
    TextView title;
    TextView content_one;
    TextView content_two;
    TextView content_three;


    TextView one;
    TextView two;
    TextView three;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_notice_content_when_click);

        title = (TextView) findViewById(R.id.text_notice_contect_title);
        content_one = (TextView) findViewById(R.id.text_notice_contect_one);
        content_two = (TextView) findViewById(R.id.text_notice_contect_two);
        content_three = (TextView) findViewById(R.id.text_notice_contect_three);


        one = (TextView)findViewById(R.id.text_notice_one_main);
        two = (TextView)findViewById(R.id.text_notice_two_main);
        three = (TextView)findViewById(R.id.text_notice_three_main);



        new Thread() {
            @Override
            public void run() {
                try{

                    Document doc = Jsoup.connect(URL).get();

                    Elements content_title = doc.select(".title");
                    String title_str = content_title.text();
                    String one_str = content_title.text();

                    Elements content_writer = doc.select(".writer");
                    String writer_str = content_writer.text();

                    Elements content_date = doc.select(".date");
                    String date_str = content_date.text();

                    Elements content = doc.select(".table_con");
                    String content_str = content.text();

                } catch(IOException e){
                    e.printStackTrace();
                }
            }
        }.start();


    }

    Handler handelr = new Handler(Looper.getMainLooper()){
        @Override
        public void handleMessage(@NonNull Message msg){
            Bundle bundle = msg.getData();
            title.setText(bundle.getString("ti"));
            content_one.setText(bundle.getString(""));
        }
    };

}