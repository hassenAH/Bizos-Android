package tn.esprit.apimodule.repos;

import retrofit2.Response;
import retrofit2.http.*;
import tn.esprit.apimodule.models.*;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0019\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001b\u0010\u001a\u001a\u00020\u00152\b\b\u0001\u0010\u001b\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Ltn/esprit/apimodule/repos/AuthApiService;", "", "accountVerificationWithGencode", "Lretrofit2/Response;", "Ltn/esprit/apimodule/models/GenericResp;", "codeEmail", "Ltn/esprit/apimodule/models/AuthReqBody;", "(Ltn/esprit/apimodule/models/AuthReqBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forgetPasswordRequest", "email", "login", "Ltn/esprit/apimodule/models/AuthResp;", "emailPassword", "Ltn/esprit/apimodule/models/LoginReqBody;", "(Ltn/esprit/apimodule/models/LoginReqBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "register", "emailPasswordinfo", "Ltn/esprit/apimodule/models/UserRegister;", "(Ltn/esprit/apimodule/models/UserRegister;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetUserToken", "refreshToken", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetVerifCode", "unsecureChangePassword", "emailCodePassword", "verifyCode", "code", "ApiModule_debug"})
public abstract interface AuthApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "user/Signin")
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    tn.esprit.apimodule.models.LoginReqBody emailPassword, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<tn.esprit.apimodule.models.AuthResp>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "user/compte")
    public abstract java.lang.Object register(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    tn.esprit.apimodule.models.UserRegister emailPasswordinfo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<tn.esprit.apimodule.models.GenericResp>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "user/resetpassword")
    public abstract java.lang.Object verifyCode(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    tn.esprit.apimodule.models.AuthReqBody code, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "resetVerif")
    public abstract java.lang.Object resetVerifCode(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    tn.esprit.apimodule.models.AuthReqBody email, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<tn.esprit.apimodule.models.GenericResp>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "verifyAccount")
    public abstract java.lang.Object accountVerificationWithGencode(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    tn.esprit.apimodule.models.AuthReqBody codeEmail, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<tn.esprit.apimodule.models.GenericResp>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "user/resetpwd")
    public abstract java.lang.Object forgetPasswordRequest(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    tn.esprit.apimodule.models.AuthReqBody email, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<tn.esprit.apimodule.models.GenericResp>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "forgetPassword")
    public abstract java.lang.Object unsecureChangePassword(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    tn.esprit.apimodule.models.AuthReqBody emailCodePassword, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<tn.esprit.apimodule.models.GenericResp>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "refresh-token")
    public abstract java.lang.Object resetUserToken(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String refreshToken, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<tn.esprit.apimodule.models.AuthResp>> continuation);
}