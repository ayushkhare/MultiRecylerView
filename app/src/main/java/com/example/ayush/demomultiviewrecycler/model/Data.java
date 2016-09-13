package com.example.ayush.demomultiviewrecycler.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Data {

    @SerializedName("last_booked_artists")
    private List<LastBookedArtist> lastBookedArtistList = new ArrayList<>();

    @SerializedName("last_reviewed_artists")
    private List<LastReviewedArtist> lastReviewedArtistList = new ArrayList<>();

    @SerializedName("trendings")
    private List<Trending> trendingList = new ArrayList<>();

    public List<LastBookedArtist> getLastBookedArtistList() {
        return lastBookedArtistList;
    }

    public void setLastBookedArtistList(List<LastBookedArtist> lastBookedArtistList) {
        this.lastBookedArtistList = lastBookedArtistList;
    }

    public List<LastReviewedArtist> getLastReviewedArtistList() {
        return lastReviewedArtistList;
    }

    public void setLastReviewedArtistList(List<LastReviewedArtist> lastReviewedArtistList) {
        this.lastReviewedArtistList = lastReviewedArtistList;
    }

    public List<Trending> getTrendingList() {
        return trendingList;
    }

    public void setTrendingList(List<Trending> trendingList) {
        this.trendingList = trendingList;
    }
}
