package tn.esprit.apimodule.repos;

import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;
import tn.esprit.apimodule.models.PagedArticlesData;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Ltn/esprit/apimodule/repos/ArticleApiService;", "", "downloadArticles", "Lretrofit2/Response;", "Ltn/esprit/apimodule/models/PagedArticlesData;", "pageNumber", "", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ApiModule_debug"})
public abstract interface ArticleApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "articles")
    public abstract java.lang.Object downloadArticles(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "page")
    java.lang.Integer pageNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<tn.esprit.apimodule.models.PagedArticlesData>> continuation);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
    }
}