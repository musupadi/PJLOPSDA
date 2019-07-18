package com.destiny.pjlopsda.API;

import com.destiny.pjlopsda.Model.ResponseModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiRequest {
    @FormUrlEncoded
    @POST("loginUser.php")
    Call<ResponseModel> loginUser(@Field("username") String username,
                                      @Field("password") String password);

    @FormUrlEncoded
    @POST("loginAdmin.php")
    Call<ResponseModel> loginAdmin(@Field("username") String username,
                                      @Field("password") String password);
}
