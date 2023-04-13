package tn.esprit.apimodule;

import android.content.Context;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.Retrofit.Builder;
import retrofit2.converter.gson.GsonConverterFactory;
import tn.esprit.apimodule.repos.*;
import tn.esprit.apimodule.utils.AuthInterceptor;
import tn.esprit.apimodule.utils.TokenAuthenticator;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\"J\u001e\u0010#\u001a\u0002H$\"\u0006\b\u0000\u0010$\u0018\u00012\u0006\u0010%\u001a\u00020\u0006H\u0082\b\u00a2\u0006\u0002\u0010&J\u0006\u0010\'\u001a\u00020(J\b\u0010)\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR#\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\t\u00a8\u0006*"}, d2 = {"Ltn/esprit/apimodule/NetworkClient;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "defaultClient", "Lretrofit2/Retrofit;", "kotlin.jvm.PlatformType", "getDefaultClient", "()Lretrofit2/Retrofit;", "defaultClient$delegate", "Lkotlin/Lazy;", "secureClient", "getSecureClient", "secureClient$delegate", "defaultInterceptor", "Lokhttp3/OkHttpClient;", "getAdminService", "Ltn/esprit/apimodule/repos/AdminApiService;", "getArticleService", "Ltn/esprit/apimodule/repos/ArticleApiService;", "getAuthService", "Ltn/esprit/apimodule/repos/AuthApiService;", "getCategoryService", "Ltn/esprit/apimodule/repos/CategoryApiService;", "getEventService", "Ltn/esprit/apimodule/repos/EventApiService;", "getMarketplaceService", "Ltn/esprit/apimodule/repos/MarketplaceApiService;", "getOffreService", "Ltn/esprit/apimodule/repos/JobOfferApiService;", "getProductService", "Ltn/esprit/apimodule/repos/ProductApiService;", "getQuizService", "Ltn/esprit/apimodule/repos/QuizApiService;", "getService", "T", "client", "(Lretrofit2/Retrofit;)Ljava/lang/Object;", "getUserService", "Ltn/esprit/apimodule/repos/UserApiService;", "secureHttpInterceptor", "ApiModule_debug"})
public final class NetworkClient {
    private final android.content.Context context = null;
    private final kotlin.Lazy secureClient$delegate = null;
    private final kotlin.Lazy defaultClient$delegate = null;
    
    public NetworkClient(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    private final retrofit2.Retrofit getSecureClient() {
        return null;
    }
    
    private final retrofit2.Retrofit getDefaultClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tn.esprit.apimodule.repos.AuthApiService getAuthService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tn.esprit.apimodule.repos.ArticleApiService getArticleService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tn.esprit.apimodule.repos.UserApiService getUserService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tn.esprit.apimodule.repos.EventApiService getEventService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tn.esprit.apimodule.repos.MarketplaceApiService getMarketplaceService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tn.esprit.apimodule.repos.JobOfferApiService getOffreService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tn.esprit.apimodule.repos.QuizApiService getQuizService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tn.esprit.apimodule.repos.AdminApiService getAdminService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tn.esprit.apimodule.repos.CategoryApiService getCategoryService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tn.esprit.apimodule.repos.ProductApiService getProductService() {
        return null;
    }
    
    /**
     * Initialize OkhttpClient with token authenticator
     */
    private final okhttp3.OkHttpClient secureHttpInterceptor() {
        return null;
    }
    
    /**
     * Initialize OkhttpClient with a default interceptor
     */
    private final okhttp3.OkHttpClient defaultInterceptor() {
        return null;
    }
}