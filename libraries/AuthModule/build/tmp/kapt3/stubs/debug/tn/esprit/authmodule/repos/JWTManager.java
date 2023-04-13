package tn.esprit.authmodule.repos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Ltn/esprit/authmodule/repos/JWTManager;", "", "extractRoleFromJWT", "", "token", "", "extractStatusFromJWT", "extractUserIdFromJWT", "AuthModule_debug"})
public abstract interface JWTManager {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String extractUserIdFromJWT(@org.jetbrains.annotations.NotNull()
    java.lang.String token);
    
    public abstract int extractRoleFromJWT(@org.jetbrains.annotations.NotNull()
    java.lang.String token);
    
    public abstract int extractStatusFromJWT(@org.jetbrains.annotations.NotNull()
    java.lang.String token);
}