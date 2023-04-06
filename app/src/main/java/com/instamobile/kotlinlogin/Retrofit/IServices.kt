package com.instamobile.kotlinlogin.Retrofit

import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface IServices {
    @POST("user/compte")
    @FormUrlEncoded
    fun registerUser(@Field("first_name") firstName:String,
                     @Field("last_name") lastName:String,
                     @Field("email") email:String,
                     @Field("password") password:String
                     )
    @POST("user/Signin")
    @FormUrlEncoded
    fun loginUser( @Field("email") email:String,
                   @Field("password") password:String)
}