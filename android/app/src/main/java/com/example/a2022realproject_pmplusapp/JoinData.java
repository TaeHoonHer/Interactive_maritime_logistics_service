package com.example.a2022realproject_pmplusapp;

import com.google.gson.annotations.SerializedName;

public class JoinData {

    @SerializedName("userid")
    private String userid;

    @SerializedName("userName")
    private String userName;

    @SerializedName("userEmail")
    private String userEmail;

    @SerializedName("userPwd")
    private String userPwd;

    public JoinData(String userid, String userName, String userEmail, String userPwd) {
        this.userid = userid;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPwd = userPwd;
    }

}
