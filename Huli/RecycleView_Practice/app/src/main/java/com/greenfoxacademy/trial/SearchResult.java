package com.greenfoxacademy.trial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SearchResult extends AppCompatActivity {

    public static final String BASE_URL = "https://jsonplaceholder.typicode.com/";

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager manager;
    private RecyclerAdapter adapter;
    private List<Result> resultList;
    private Searchable searchable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();

        recyclerView = findViewById(R.id.recycler);
        manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);

        searchable = retrofit.create(Searchable.class);

        Call<List<Result>> call = searchable.getSearchResult();

        call.enqueue(new Callback<List<Result>>() {
            @Override
            public void onResponse(Call<List<Result>> call, Response<List<Result>> response) {
                resultList = response.body();
                adapter = new RecyclerAdapter(resultList);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Result>> call, Throwable t) {

            }
        });

        /*Searchable searchable = retrofit.create(Searchable.class);

        Call<Result> call = searchable.getSearchResult();

        call.enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                Result result = response.body();
                TextView textView = findViewById(R.id.textView66);
                textView.setText(result.getTitle());
                System.out.println(result);
            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {
                Toast.makeText(SearchResult.this, "Ooooops", Toast.LENGTH_SHORT).show();
            }
        });*/
    }
}
