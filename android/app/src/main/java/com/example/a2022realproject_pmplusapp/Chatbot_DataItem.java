package com.example.a2022realproject_pmplusapp;

public class Chatbot_DataItem {

    private String content;

    private String name;

    private int viewType;


    public Chatbot_DataItem(String content, String name, int viewType){
        this.content = content;
        this.name = name;
        this.viewType = viewType;
    }

    public String getContent(){
        return content;
    }
    public String getName(){
        return name;
    }
    public int getViewType(){
        return viewType;
    }


}
