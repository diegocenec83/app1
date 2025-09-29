package com.example.alumno.app1.network;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiService {
    @Multipart
    @POST("post")
    Call<ResponseBody> uploadImage(
        @Part MultipartBody.Part image,
        @Part("description") RequestBody description
    );
}