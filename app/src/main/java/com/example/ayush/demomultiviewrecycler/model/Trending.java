package com.example.ayush.demomultiviewrecycler.model;

import com.google.gson.annotations.SerializedName;

public class Trending {

    @SerializedName("trending_keyword")
    private String keyword;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
