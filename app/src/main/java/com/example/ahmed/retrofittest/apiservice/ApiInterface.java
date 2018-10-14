package com.example.ahmed.retrofittest.apiservice;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("gists/public")
    Call<ResponseBody> getGists();
}
