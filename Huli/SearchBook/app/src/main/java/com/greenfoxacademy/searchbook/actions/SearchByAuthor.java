package com.greenfoxacademy.searchbook.actions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;
import android.widget.TextView;

import com.greenfoxacademy.searchbook.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import android.view.View;
import android.content.Intent;

public class SearchByAuthor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seach_by_author);
    }

    public void onClickToAuthorSearchResult(View view) {

        Intent i = new Intent(this, AuthorResult.class);

        EditText editText = (EditText) findViewById(R.id.authorname);
        String author = editText.getText().toString();

        i.putExtra("author", author);
        startActivity(i);

    }
}
