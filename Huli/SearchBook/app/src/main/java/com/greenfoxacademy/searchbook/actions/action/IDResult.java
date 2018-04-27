package com.greenfoxacademy.searchbook.actions.action;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.greenfoxacademy.searchbook.R;
import com.greenfoxacademy.searchbook.actions.SubjectSearcher;
import com.greenfoxacademy.searchbook.actions.adapter.RecyclerAdapterForAuthorSearch;
import com.greenfoxacademy.searchbook.actions.adapter.RecyclerAdapterForIDSearch;
import com.greenfoxacademy.searchbook.actions.modelForAuthorSearch.DocList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class IDResult extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager manager;
    private RecyclerAdapterForIDSearch adapter;
    private DocList docList;
    private SubjectSearcher searcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idresult);

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("https://openlibrary.org/")
                .addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();

        recyclerView = findViewById(R.id.resultID);
        manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);

        searcher = retrofit.create(SubjectSearcher.class);

        Intent intent = getIntent();
        String usermessage = intent.getStringExtra("isbn");

        Call<DocList> call = searcher.booksByID(usermessage);

        call.enqueue(new Callback<DocList>() {
            @Override
            public void onResponse(Call<DocList> call, Response<DocList> response) {
                DocList docList = response.body();
                adapter = new RecyclerAdapterForIDSearch(docList);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<DocList> call, Throwable t) {

            }
        });
    }
}
