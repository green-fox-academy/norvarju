package com.greenfoxacademy.searchbook.actions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.greenfoxacademy.searchbook.R;
import com.greenfoxacademy.searchbook.actions.modelForSubjectSearch.WorksBySubjectResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SubjectResult extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager manager;
    private RecyclerAdapter adapter;
    private WorksBySubjectResponse worksBySubjectResponse;
    private SubjectSearcher searcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_result);

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("https://openlibrary.org/")
                .addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();

        recyclerView = findViewById(R.id.resultS);
        manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);

        searcher = retrofit.create(SubjectSearcher.class);

        Intent intent = getIntent();
        String usermessage = intent.getStringExtra("subject");

        Call<WorksBySubjectResponse> call = searcher.booksBySubject(usermessage);

        call.enqueue(new Callback<WorksBySubjectResponse>() {
            @Override
            public void onResponse(Call<WorksBySubjectResponse> call, Response<WorksBySubjectResponse> response) {
                worksBySubjectResponse = response.body();
                adapter = new RecyclerAdapter(worksBySubjectResponse.getWorks());
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<WorksBySubjectResponse> call, Throwable t) {

            }
        });

    }

}
