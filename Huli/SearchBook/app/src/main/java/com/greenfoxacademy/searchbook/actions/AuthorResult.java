package com.greenfoxacademy.searchbook.actions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.greenfoxacademy.searchbook.R;
import com.greenfoxacademy.searchbook.actions.modelForAuthorSearch.Doc;
import com.greenfoxacademy.searchbook.actions.modelForAuthorSearch.DocList;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import android.content.Intent;

public class AuthorResult extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager manager;
    private RecyclerAdapterForAuthorSearch adapter;
    private DocList docList;
    private SubjectSearcher searcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author_result);

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("https://openlibrary.org/")
                .addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();

        recyclerView = findViewById(R.id.resultA);
        manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);

        searcher = retrofit.create(SubjectSearcher.class);

        Intent intent = getIntent();
        String usermessage = intent.getStringExtra("author");

        Call<DocList> call = searcher.booksByAuthor(usermessage);

        call.enqueue(new Callback<DocList>() {
            @Override
            public void onResponse(Call<DocList> call, Response<DocList> response) {
                DocList docList = response.body();
                adapter = new RecyclerAdapterForAuthorSearch(docList);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<DocList> call, Throwable t) {

            }
        });
    }
}
