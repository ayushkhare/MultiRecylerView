package com.example.ayush.demomultiviewrecycler.rest;

import com.example.ayush.demomultiviewrecycler.model.DiscoveryResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("professionals/discovery")
    Call<DiscoveryResponse> getProfessionalsDiscovery(@Query("access_token") String accessToken);
}
