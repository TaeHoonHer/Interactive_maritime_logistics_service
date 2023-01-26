package com.example.a2022realproject_pmplusapp;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {

    @SerializedName("code")
    private int code;

    @SerializedName("message")
    private String message;

    @SerializedName("userid")
    private int userid;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public int getUserid() {
        return userid;
    }
}
