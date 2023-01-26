package com.example.a2022realproject_pmplusapp;

import com.google.gson.annotations.SerializedName;


public class LoginData {
    @SerializedName("userid")
    String userid;

    @SerializedName("userPwd")
    String userPwd;

    public LoginData(String userid, String userPwd) {
        this.userid = userid;
        this.userPwd = userPwd;
    }

}
