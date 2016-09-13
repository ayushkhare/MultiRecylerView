package com.example.ayush.demomultiviewrecycler.model;

import com.google.gson.annotations.SerializedName;

public class Professionals {

    @SerializedName("_id")
    private String id;

    @SerializedName("username")
    private String userName;

    @SerializedName("brand_name")
    private String brandName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
