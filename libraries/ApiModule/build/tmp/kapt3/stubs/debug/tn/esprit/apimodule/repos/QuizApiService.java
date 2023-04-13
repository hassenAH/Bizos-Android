package tn.esprit.apimodule.repos;

import retrofit2.Response;
import retrofit2.http.*;
import tn.esprit.apimodule.models.GenericResp;
import tn.esprit.apimodule.models.QuizAnswerBody;
import tn.esprit.apimodule.models.QuizModel;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Ltn/esprit/apimodule/repos/QuizApiService;", "", "answerQuiz", "Lretrofit2/Response;", "Ltn/esprit/apimodule/models/GenericResp;", "quizId", "", "quizAnswerBody", "Ltn/esprit/apimodule/models/QuizAnswerBody;", "(Ljava/lang/String;Ltn/esprit/apimodule/models/QuizAnswerBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQuiz", "Ltn/esprit/apimodule/models/QuizModel;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ApiModule_debug"})
public abstract interface QuizApiService {
    @org.jetbrains.annotations.NotNull()
    public static final tn.esprit.apimodule.repos.QuizApiService.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "quiz/{id}")
    public abstract java.lang.Object getQuiz(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String quizId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<tn.esprit.apimodule.models.QuizModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PUT(value = "quiz/{id}")
    public abstract java.lang.Object answerQuiz(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String quizId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    tn.esprit.apimodule.models.QuizAnswerBody quizAnswerBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<tn.esprit.apimodule.models.GenericResp>> continuation);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ltn/esprit/apimodule/repos/QuizApiService$Companion;", "", "()V", "API_ID", "", "ApiModule_debug"})
    public static final class Companion {
        private static final java.lang.String API_ID = "quiz/{id}";
        
        private Companion() {
            super();
        }
    }
}