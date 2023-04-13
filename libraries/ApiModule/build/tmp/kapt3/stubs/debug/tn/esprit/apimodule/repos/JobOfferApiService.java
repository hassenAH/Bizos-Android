package tn.esprit.apimodule.repos;

import retrofit2.Response;
import retrofit2.http.*;
import tn.esprit.apimodule.models.*;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0006\bf\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Ltn/esprit/apimodule/repos/JobOfferApiService;", "", "addOfferJob", "Lretrofit2/Response;", "Ltn/esprit/apimodule/models/GenericResp;", "companyId", "", "jobOfferBody", "Ltn/esprit/apimodule/models/OffreJob;", "(Ljava/lang/String;Ltn/esprit/apimodule/models/OffreJob;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteOffreJob", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllOffers", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOffreJobbyId", "updateOffreJob", "offrejobbody", "Companion", "ApiModule_debug"})
public abstract interface JobOfferApiService {
    @org.jetbrains.annotations.NotNull()
    public static final tn.esprit.apimodule.repos.JobOfferApiService.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "offrejob")
    public abstract java.lang.Object getAllOffers(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<tn.esprit.apimodule.models.OffreJob>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "offrejob/saveoffrejob")
    public abstract java.lang.Object addOfferJob(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "companyId")
    java.lang.String companyId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    tn.esprit.apimodule.models.OffreJob jobOfferBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<tn.esprit.apimodule.models.GenericResp>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PUT(value = "offrejob/updateoffre/{id}")
    @retrofit2.http.Headers(value = {"Content-Type:application/json"})
    public abstract java.lang.Object updateOffreJob(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    tn.esprit.apimodule.models.OffreJob offrejobbody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<tn.esprit.apimodule.models.GenericResp>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.DELETE(value = "offrejob/deleteoffre/{id}")
    public abstract java.lang.Object deleteOffreJob(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<tn.esprit.apimodule.models.GenericResp>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "offrejob/{id}")
    public abstract java.lang.Object getOffreJobbyId(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<tn.esprit.apimodule.models.OffreJob>> continuation);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ltn/esprit/apimodule/repos/JobOfferApiService$Companion;", "", "()V", "API_ID", "", "ApiModule_debug"})
    public static final class Companion {
        private static final java.lang.String API_ID = "offrejob";
        
        private Companion() {
            super();
        }
    }
}