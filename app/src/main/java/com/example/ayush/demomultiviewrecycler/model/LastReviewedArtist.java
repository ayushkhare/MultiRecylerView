package com.example.ayush.demomultiviewrecycler.model;

import com.google.gson.annotations.SerializedName;

public class LastReviewedArtist {

    @SerializedName("username")
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
