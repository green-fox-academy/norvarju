package com.greenfoxacademy.trial;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import java.util.List;

public interface Searchable {

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @GET("/posts/1/comments")
    Call<List<Result>> getSearchResult();
}
