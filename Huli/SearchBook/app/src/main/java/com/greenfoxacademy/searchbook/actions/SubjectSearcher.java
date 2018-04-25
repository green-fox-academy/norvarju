package com.greenfoxacademy.searchbook.actions;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SubjectSearcher {

    @GET("/jokes/random")
    Call<Books> booksBySubject();
}
