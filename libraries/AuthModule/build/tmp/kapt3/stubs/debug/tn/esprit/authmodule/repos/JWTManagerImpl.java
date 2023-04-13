package tn.esprit.authmodule.repos;

import com.auth0.android.jwt.JWT;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\t"}, d2 = {"Ltn/esprit/authmodule/repos/JWTManagerImpl;", "Ltn/esprit/authmodule/repos/JWTManager;", "()V", "extractRoleFromJWT", "", "token", "", "extractStatusFromJWT", "extractUserIdFromJWT", "AuthModule_debug"})
public final class JWTManagerImpl implements tn.esprit.authmodule.repos.JWTManager {
    
    @javax.inject.Inject()
    public JWTManagerImpl() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String extractUserIdFromJWT(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return null;
    }
    
    @java.lang.Override()
    public int extractRoleFromJWT(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return 0;
    }
    
    @java.lang.Override()
    public int extractStatusFromJWT(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return 0;
    }
}