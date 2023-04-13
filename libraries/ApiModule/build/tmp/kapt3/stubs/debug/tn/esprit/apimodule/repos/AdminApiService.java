package tn.esprit.apimodule.repos;

import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import tn.esprit.apimodule.models.*;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Ltn/esprit/apimodule/repos/AdminApiService;", "", "disableUser", "Lretrofit2/Response;", "Ltn/esprit/apimodule/models/User;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enableUser", "getAllMethodProducts", "Ltn/esprit/apimodule/models/AllCategProduct;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllUsers", "", "getCountAllEnableDiscableCount", "Ltn/esprit/apimodule/models/AllEDusers;", "getCountAllUsers", "Ltn/esprit/apimodule/models/AllCountUsers;", "ApiModule_debug"})
public abstract interface AdminApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "admin/getAllMethod")
    public abstract java.lang.Object getCountAllUsers(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<tn.esprit.apimodule.models.AllCountUsers>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "admin/getCountAllEnableDiscableCount")
    public abstract java.lang.Object getCountAllEnableDiscableCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<tn.esprit.apimodule.models.AllEDusers>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "admin/statProduct")
    public abstract java.lang.Object getAllMethodProducts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<tn.esprit.apimodule.models.AllCategProduct>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "admin/allUsers")
    public abstract java.lang.Object getAllUsers(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<tn.esprit.apimodule.models.User>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PATCH(value = "admin/enable/{id}")
    public abstract java.lang.Object enableUser(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<tn.esprit.apimodule.models.User>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PATCH(value = "admin/disable/{id}")
    public abstract java.lang.Object disableUser(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<tn.esprit.apimodule.models.User>> continuation);
}