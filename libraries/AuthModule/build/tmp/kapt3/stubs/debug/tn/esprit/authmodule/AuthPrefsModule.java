package tn.esprit.authmodule;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import tn.esprit.authmodule.repos.JWTManager;
import tn.esprit.authmodule.repos.JWTManagerImpl;
import tn.esprit.authmodule.repos.UserAuthManager;
import tn.esprit.authmodule.repos.UserAuthManagerImpl;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Ltn/esprit/authmodule/AuthPrefsModule;", "", "()V", "provideJWTManager", "Ltn/esprit/authmodule/repos/JWTManager;", "impl", "Ltn/esprit/authmodule/repos/JWTManagerImpl;", "provideUserAuthManager", "Ltn/esprit/authmodule/repos/UserAuthManager;", "Ltn/esprit/authmodule/repos/UserAuthManagerImpl;", "AuthModule_debug"})
@dagger.Module()
public abstract class AuthPrefsModule {
    
    public AuthPrefsModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract tn.esprit.authmodule.repos.UserAuthManager provideUserAuthManager(@org.jetbrains.annotations.NotNull()
    tn.esprit.authmodule.repos.UserAuthManagerImpl impl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract tn.esprit.authmodule.repos.JWTManager provideJWTManager(@org.jetbrains.annotations.NotNull()
    tn.esprit.authmodule.repos.JWTManagerImpl impl);
}