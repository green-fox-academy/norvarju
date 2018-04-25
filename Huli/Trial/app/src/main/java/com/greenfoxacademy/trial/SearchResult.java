package com.greenfoxacademy.trial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SearchResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();

        Searchable searchable = retrofit.create(Searchable.class);

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
        });
    }
}
