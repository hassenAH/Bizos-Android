package tn.esprit.apimodule.repos;

import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;
import tn.esprit.apimodule.models.Event;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ5\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Ltn/esprit/apimodule/repos/EventApiService;", "", "getOfMonthAndYear", "Lretrofit2/Response;", "", "Ltn/esprit/apimodule/models/Event;", "month", "", "year", "(Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOfToday", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ApiModule_debug"})
public abstract interface EventApiService {
    @org.jetbrains.annotations.NotNull()
    public static final tn.esprit.apimodule.repos.EventApiService.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "events/today")
    public abstract java.lang.Object getOfToday(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<tn.esprit.apimodule.models.Event>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "events")
    public abstract java.lang.Object getOfMonthAndYear(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "month")
    java.lang.Integer month, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "year")
    java.lang.Integer year, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<tn.esprit.apimodule.models.Event>>> continuation);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ltn/esprit/apimodule/repos/EventApiService$Companion;", "", "()V", "API_ID", "", "ApiModule_debug"})
    public static final class Companion {
        private static final java.lang.String API_ID = "events";
        
        private Companion() {
            super();
        }
    }
}