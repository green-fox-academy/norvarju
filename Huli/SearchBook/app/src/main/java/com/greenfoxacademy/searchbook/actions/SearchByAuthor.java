package com.greenfoxacademy.searchbook.actions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.greenfoxacademy.searchbook.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SearchByAuthor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seach_by_author);

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("https://api.chucknorris.io/")
                .addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();

        SubjectSearcher searcher = retrofit.create(SubjectSearcher.class);
        Call<Books> call = searcher.booksBySubject();

        call.enqueue(new Callback<Books>() {
            @Override
            public void onResponse(Call<Books> call, Response<Books> response) {
                Books books = response.body();
                TextView textView = findViewById(R.id.textView2);
                textView.setText(books.getValue());
            }

            @Override
            public void onFailure(Call<Books> call, Throwable t) {
            }
    });
    }
}
