package com.greenfoxacademy.searchbook.actions.action;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.greenfoxacademy.searchbook.R;

public class SearchBySubject extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_by_subject);
    }

    public void onClickToSubjectSearchResult(View view) {

        Intent i = new Intent(this, SubjectResult.class);

        EditText editText = (EditText) findViewById(R.id.subject);
        String subject = editText.getText().toString();

        i.putExtra("subject", subject);
        startActivity(i);

    }
}
