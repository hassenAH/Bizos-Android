package tn.esprit.apimodule.repos

import retrofit2.Response
import retrofit2.http.*
import tn.esprit.apimodule.models.*

interface AuthApiService {

    @POST("user/Signin")
    suspend fun login(@Body emailPassword: LoginReqBody): Response<AuthResp>

    @POST("user/compte")
    suspend fun register(@Body emailPasswordinfo: UserRegister): Response<GenericResp>

    @POST("user/resetpassword")
    suspend fun verifyCode(@Body code: AuthReqBody): String

    @POST("resetVerif")
    suspend fun resetVerifCode(@Body email: AuthReqBody): Response<GenericResp>

    @POST("verifyAccount")
    suspend fun accountVerificationWithGencode(@Body codeEmail: AuthReqBody): Response<GenericResp>

    @POST("user/resetpwd")
    suspend fun forgetPasswordRequest(@Body email: AuthReqBody): Response<GenericResp>

    @POST("forgetPassword")
    suspend fun unsecureChangePassword(@Body emailCodePassword: AuthReqBody): Response<GenericResp>

    @POST("refresh-token")
    @FormUrlEncoded
    suspend fun resetUserToken(
        @Header("Authorization") refreshToken: String
    ): Response<AuthResp>
}