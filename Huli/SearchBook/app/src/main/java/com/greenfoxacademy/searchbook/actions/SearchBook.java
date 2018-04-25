package com.greenfoxacademy.searchbook.actions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import java.util.List;

import com.greenfoxacademy.searchbook.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SearchBook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_book);
    }

    public void onClick1(View view) {
        Intent i = new Intent(this, SearchBySubject.class);
        startActivity(i);
    }

    public void onClick2(View view) {
        Intent i2 = new Intent(this, SearchByAuthor.class);
        startActivity(i2);
    }

    public void onClick3(View view) {
        Intent i3 = new Intent(this, SearchById.class);
        startActivity(i3);
    }
}
