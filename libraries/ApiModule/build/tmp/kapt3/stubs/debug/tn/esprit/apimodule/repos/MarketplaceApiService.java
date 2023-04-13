package tn.esprit.apimodule.repos;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Response;
import retrofit2.http.*;
import tn.esprit.apimodule.models.Category;
import tn.esprit.apimodule.models.GenericResp;
import tn.esprit.apimodule.models.PagedProductsData;
import tn.esprit.apimodule.models.Product;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 &2\u00020\u0001:\u0001&J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\'\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\'\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007JG\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0018\u001a\u00020\u00062$\b\u0001\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001b0\u001aj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001b`\u001cH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJa\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u001f\u001a\u00020\u00062\b\b\u0001\u0010 \u001a\u00020!2$\b\u0001\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u001aj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001`\u001cH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"JW\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u001f\u001a\u00020\u00062$\b\u0001\u0010$\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u001aj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001`\u001cH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\'"}, d2 = {"Ltn/esprit/apimodule/repos/MarketplaceApiService;", "", "deleteProduct", "Lretrofit2/Response;", "Ltn/esprit/apimodule/models/GenericResp;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "", "Ltn/esprit/apimodule/models/Category;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllProducts", "Ltn/esprit/apimodule/models/PagedProductsData;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyProducts", "Ltn/esprit/apimodule/models/Product;", "userId", "getOneProduct", "idProd", "hideProduct", "publishProduct", "categoryId", "body", "Ljava/util/HashMap;", "Lokhttp3/RequestBody;", "Lkotlin/collections/HashMap;", "(Ljava/lang/String;Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateWithImage", "categoryName", "image", "Lokhttp3/MultipartBody$Part;", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/MultipartBody$Part;Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateWithoutImage", "updateBody", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ApiModule_debug"})
public abstract interface MarketplaceApiService {
    @org.jetbrains.annotations.NotNull()
    public static final tn.esprit.apimodule.repos.MarketplaceApiService.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "category")
    public abstract java.lang.Object getAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<tn.esprit.apimodule.models.Category>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Multipart()
    @retrofit2.http.POST(value = "product")
    public abstract java.lang.Object publishProduct(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "categoryId")
    java.lang.String categoryId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PartMap()
    java.util.HashMap<java.lang.String, okhttp3.RequestBody> body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<tn.esprit.apimodule.models.GenericResp>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "product")
    public abstract java.lang.Object getAllProducts(@retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<tn.esprit.apimodule.models.PagedProductsData>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "product/{id}")
    public abstract java.lang.Object getOneProduct(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String idProd, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<tn.esprit.apimodule.models.Product>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.DELETE(value = "product/{id}")
    public abstract java.lang.Object deleteProduct(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<tn.esprit.apimodule.models.GenericResp>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "product/myProducts")
    public abstract java.lang.Object getMyProducts(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "userId")
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<tn.esprit.apimodule.models.Product>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PUT(value = "product/hide/{id}")
    public abstract java.lang.Object hideProduct(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<tn.esprit.apimodule.models.Product>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PUT(value = "product/update2/{id}")
    public abstract java.lang.Object updateWithoutImage(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "categoryName")
    java.lang.String categoryName, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.util.HashMap<java.lang.String, java.lang.Object> updateBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<tn.esprit.apimodule.models.Product>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PUT(value = "product/update/{id}")
    @retrofit2.http.Multipart()
    public abstract java.lang.Object updateWithImage(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "categoryName")
    java.lang.String categoryName, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part image, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PartMap()
    java.util.HashMap<java.lang.String, java.lang.Object> body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<tn.esprit.apimodule.models.Product>>> continuation);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ltn/esprit/apimodule/repos/MarketplaceApiService$Companion;", "", "()V", "API_ID", "", "ApiModule_debug"})
    public static final class Companion {
        private static final java.lang.String API_ID = "product";
        
        private Companion() {
            super();
        }
    }
}