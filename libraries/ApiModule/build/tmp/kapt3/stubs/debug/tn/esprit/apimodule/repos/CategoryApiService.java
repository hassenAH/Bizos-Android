package tn.esprit.apimodule.repos;

import okhttp3.MultipartBody;
import retrofit2.Response;
import retrofit2.http.*;
import tn.esprit.apimodule.models.*;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Ltn/esprit/apimodule/repos/CategoryApiService;", "", "getAllCategories", "Lretrofit2/Response;", "", "Ltn/esprit/apimodule/models/Category;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ApiModule_debug"})
public abstract interface CategoryApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "category")
    public abstract java.lang.Object getAllCategories(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<tn.esprit.apimodule.models.Category>>> continuation);
}