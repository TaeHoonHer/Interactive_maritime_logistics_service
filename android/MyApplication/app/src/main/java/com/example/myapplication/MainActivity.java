package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.shapes.Shape;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ExpandableListView expandableListView1;
    ExpandableListView expandableListView2;

    List<String> applistGroup;
    List<String> portlistGroup;
    HashMap<String, List<String>> listItem;

    MainAdapter AppNoticeAdapter;
    PortAdapter portNoticeAdapter;

    Shape shape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expandableListView1 = findViewById(R.id.expandable_listview1);
        expandableListView2 = findViewById(R.id.expandable_listview2);

        applistGroup = new ArrayList<>();
        portlistGroup = new ArrayList<>();
        listItem = new HashMap<>();

        AppNoticeAdapter = new MainAdapter(this, applistGroup, listItem);
        portNoticeAdapter = new PortAdapter(this, portlistGroup, listItem);
        expandableListView1.setAdapter(AppNoticeAdapter);
        expandableListView2.setAdapter(portNoticeAdapter);
        initListDataApp();
        initListDataPort();
    }

    private void initListDataPort() {
        String [] array;
        portlistGroup.add(getString(R.string.port_group1));
        portlistGroup.add(getString(R.string.port_group2));
        portlistGroup.add(getString(R.string.port_group3));
        portlistGroup.add(getString(R.string.port_group4));

        List<String> port_list1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.port_group1);
        for (String port_item : array) {
            port_list1.add(port_item);
        }
        List<String> port_list2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.port_group2);
        for (String port_item : array) {
            port_list2.add(port_item);
        }
        List<String> port_list3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.port_group3);
        for (String port_item : array) {
            port_list3.add(port_item);
        }
        List<String> port_list4 = new ArrayList<>();
        array = getResources().getStringArray(R.array.port_group4);
        for (String port_item : array) {
            port_list4.add(port_item);
        }

        listItem.put(portlistGroup.get(0), port_list1);
        listItem.put(portlistGroup.get(1), port_list2);
        listItem.put(portlistGroup.get(2), port_list3);
        listItem.put(portlistGroup.get(3), port_list4);

        AppNoticeAdapter.notifyDataSetChanged();
    }

    private void initListDataApp() {
        applistGroup.add(getString(R.string.app_group1));
        applistGroup.add(getString(R.string.app_group2));
        applistGroup.add(getString(R.string.app_group3));
        applistGroup.add(getString(R.string.app_group4));

        //listGroup.add(getString(R.string.group5));

        String[] array;

        List<String> app_list1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.app_group1);
        for (String item : array) {
            app_list1.add(item);
        }

        List<String> app_list2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.app_group2);
        for (String app_item : array) {
            app_list2.add(app_item);
        }
        List<String> app_list3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.app_group3);
        for (String app_item : array) {
            app_list3.add(app_item);
        }
        List<String> app_list4 = new ArrayList<>();
        array = getResources().getStringArray(R.array.app_group4);
        for (String app_item : array) {
            app_list4.add(app_item);
        }



            listItem.put(applistGroup.get(0), app_list1);
            listItem.put(applistGroup.get(1), app_list2);
            listItem.put(applistGroup.get(2), app_list3);
            listItem.put(applistGroup.get(3), app_list4);

            //listItem.put(listGroup.get(4), list5);
            AppNoticeAdapter.notifyDataSetChanged();


        }
    }