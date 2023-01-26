package com.example.a2022realproject_pmplusapp;


public class NoticeData {
    private String title;
    private String writer;
    private String date;
    private String content;

    public NoticeData(String title, String writer, String date, String content) {
        this.title = title;
        this.writer = writer;
        this.date = date;
        this.content = content;
    }

    public String getTitle(){
        return title;
    }

    public String getWriter(){
        return writer;
    }

    public String getDate(){
        return date;
    }

    public String getContent(){
        return content;
    }






}
