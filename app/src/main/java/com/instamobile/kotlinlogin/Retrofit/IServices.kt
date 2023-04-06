package com.instamobile.kotlinlogin.Retrofit

import retrofit2.http.*


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

    /*@GET("user/resetpassword/{email}")
    fun Forgetpassword(@Path("email") email: String?)*/


    @POST("user/resetpassword")
    fun Forgetpassword(@Field("email") email:String)
    @POST("user/resetpwd")
    fun OTPVerification(@Field("code") code:String)
    @POST("user/changepwd")
    fun Changepassword(@Field("email") email:String,@Field("password") password:String)
}