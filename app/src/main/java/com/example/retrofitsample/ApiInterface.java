package com.example.retrofitsample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("UyumMESService.ashx")
    public Call<Token> getToken(
            @Query("action") String action,
            @Query("user") String user,
            @Query("pass") String pass
    );

    @POST("UyumMESService.ashx")
    public Call<Branch> GetBranch(
            @Query("action") String action,
            @Query("user") String user,
            @Query("pass") String pass,
            @Body Token token
    );
}
