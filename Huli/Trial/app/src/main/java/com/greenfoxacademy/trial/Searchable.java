package com.greenfoxacademy.trial;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface Searchable {

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @GET("/posts/1")
    Call<Result> getSearchResult();
}
