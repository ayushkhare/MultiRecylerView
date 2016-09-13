package com.example.ayush.demomultiviewrecycler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.ayush.demomultiviewrecycler.model.Data;
import com.example.ayush.demomultiviewrecycler.model.DiscoveryResponse;
import com.example.ayush.demomultiviewrecycler.rest.ApiClient;
import com.example.ayush.demomultiviewrecycler.rest.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private MyAdapter adapter;

    private final static String ACCESS_TOKEN = "cF7BTF3CIcAVhtQ7plmQlhbSLwDe3OCkQqOscI9R";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupRecyclerView();
        updateAdapter();
        getDataFromApi();
    }

    private void setupRecyclerView() {
        List<DiscoveryItem> discoveryItems = new ArrayList<>();
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new MyAdapter(discoveryItems);
        recyclerView.setAdapter(adapter);
    }

    private void updateAdapter() {
        adapter.notifyDataSetChanged();
    }

    public void getDataFromApi() {
        ApiInterface apiService = ApiClient.getCient().create(ApiInterface.class);
        Call<DiscoveryResponse> call = apiService.getProfessionalsDiscovery(ACCESS_TOKEN);
        call.enqueue(new Callback<DiscoveryResponse>() {
            @Override
            public void onResponse(Call<DiscoveryResponse> call, Response<DiscoveryResponse> response) {
                Data data = response.body().getData();
                DiscoveryResponseConverter converter = new DiscoveryResponseConverter(data);
                final List<DiscoveryItem> items = converter.convert();
                MainActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        adapter.setData(items);
                        adapter.notifyDataSetChanged();
                    }
                });
            }

            @Override
            public void onFailure(Call<DiscoveryResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_LONG).show();
                DiscoveryResponseConverter converter = new DiscoveryResponseConverter(FakeData.getFakeData());
                final List<DiscoveryItem> items = converter.convert();
                MainActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        adapter.setData(items);
                        adapter.notifyDataSetChanged();
                    }
                });
            }
        });
    }
}
