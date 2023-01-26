package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.shapes.Shape;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ExpandableListView expandableListView1;
    ExpandableListView expandableListView2;

    List<String> applistGroup;
    List<String> portlistGroup;
    HashMap<String, List<String>> listItem;

    ExpandableListAdapter listAdapter;

    MainAdapter AppNoticeAdapter;
    PortAdapter portNoticeAdapter;

    Shape shape;

    TextView Textview_Title_warning;
    TextView Textview_Detail_warning;
    TextView Textview_Title_normal;
    TextView Textview_Detail_normal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expandableListView1 = findViewById(R.id.expandable_listview1);
        expandableListView2 = findViewById(R.id.expandable_listview2);

        Textview_Title_normal = findViewById(R.id.expand_child_title_normal);
        Textview_Detail_normal = findViewById(R.id.expand_child_detail_normal);
        Textview_Title_warning = findViewById(R.id.expand_child_title_warning);
        Textview_Detail_warning = findViewById(R.id.expand_child_detail_warning);

        String compare_detail = "경고";

        applistGroup = new ArrayList<>();
        portlistGroup = new ArrayList<>();
        listItem = new HashMap<>();

        AppNoticeAdapter = new MainAdapter(this, applistGroup, listItem);
        portNoticeAdapter = new PortAdapter(this, portlistGroup, listItem);

        expandableListView1.setAdapter(AppNoticeAdapter);
        expandableListView2.setAdapter(portNoticeAdapter);


        if(compare_detail.equals(Textview_Title_warning)){
            Textview_Detail_warning.setVisibility(View.VISIBLE);
            Textview_Title_warning.setVisibility(View.VISIBLE);
            Textview_Detail_normal.setVisibility(View.INVISIBLE);
            Textview_Title_normal.setVisibility(View.INVISIBLE);
        }

        expandableListView1.setOnChildClickListener(new OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {

                return false;
            }
        });

        expandableListView2.setOnChildClickListener(new OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                return false;
            }
        });

        initListDataApp();
        initListDataPort();
    }

    private void initListDataPort() {
        applistGroup.add("g1");

        AppNoticeAdapter.notifyDataSetChanged();
    }

    private void initListDataApp() {
        applistGroup.add(getString(R.string.app_group1));

        String[] array;

        List<String> app_list1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.app_group1);
        for (String item : array) {
            app_list1.add(item);
        }

            listItem.put(applistGroup.get(0), app_list1);
            AppNoticeAdapter.notifyDataSetChanged();

        }



    }