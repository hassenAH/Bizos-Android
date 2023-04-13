package tn.esprit.apimodule.repos;

import okhttp3.MultipartBody;
import retrofit2.Response;
import retrofit2.http.*;
import tn.esprit.apimodule.models.GenericResp;
import tn.esprit.apimodule.models.Product;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJQ\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\r2$\b\u0001\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000fj\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001`\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Ltn/esprit/apimodule/repos/ProductApiService;", "", "getMyProducts", "Lretrofit2/Response;", "", "Ltn/esprit/apimodule/models/Product;", "userId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadProduct", "Ltn/esprit/apimodule/models/GenericResp;", "categoryId", "image", "Lokhttp3/MultipartBody$Part;", "product", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ApiModule_debug"})
public abstract interface ProductApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Multipart()
    @retrofit2.http.POST(value = "product")
    public abstract java.lang.Object uploadProduct(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "categoryId")
    java.lang.String categoryId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part image, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PartMap()
    java.util.HashMap<java.lang.String, java.lang.Object> product, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<tn.esprit.apimodule.models.GenericResp>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "product/myProducts")
    public abstract java.lang.Object getMyProducts(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "userId")
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<tn.esprit.apimodule.models.Product>>> continuation);
}