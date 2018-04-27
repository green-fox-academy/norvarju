package com.greenfoxacademy.searchbook.actions.action;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.greenfoxacademy.searchbook.R;

public class SearchById extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_by_id);
    }

    public void onClickToIDSearchResult(View view) {

        Intent i = new Intent(this, IDResult.class);

        EditText editText = (EditText) findViewById(R.id.idToSearch);
        String isbn = editText.getText().toString();

        i.putExtra("isbn", isbn);
        startActivity(i);

    }
}
