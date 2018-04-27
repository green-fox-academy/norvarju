package com.greenfoxacademy.searchbook.actions;

import com.greenfoxacademy.searchbook.actions.modelForAuthorSearch.Doc;
import com.greenfoxacademy.searchbook.actions.modelForAuthorSearch.DocList;
import com.greenfoxacademy.searchbook.actions.modelForSubjectSearch.WorksBySubjectResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import java.util.List;

public interface SubjectSearcher {

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @GET("/search.json")
    Call<DocList> booksByAuthor(@Query("author") String author);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @GET("/subjects/{subject}/")
    Call<WorksBySubjectResponse> booksBySubject(@Path("subject") String subject);

}
