package tn.esprit.authmodule.repos;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import dagger.hilt.android.qualifiers.ApplicationContext;
import tn.esprit.authmodule.utils.UserInfo;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Ltn/esprit/authmodule/repos/UserAuthManagerImpl;", "Ltn/esprit/authmodule/repos/UserAuthManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "gson", "Lcom/google/gson/Gson;", "sharedPrefs", "Landroid/content/SharedPreferences;", "checkIfUserLoggedIn", "", "logOutUser", "", "retrieveUserInfoFromStorage", "Ltn/esprit/authmodule/utils/UserInfo;", "saveUserInfoToStorage", "id", "", "access", "AuthModule_debug"})
public final class UserAuthManagerImpl implements tn.esprit.authmodule.repos.UserAuthManager {
    private android.content.SharedPreferences sharedPrefs;
    private final com.google.gson.Gson gson = null;
    
    @javax.inject.Inject()
    public UserAuthManagerImpl(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public tn.esprit.authmodule.utils.UserInfo retrieveUserInfoFromStorage() {
        return null;
    }
    
    @java.lang.Override()
    public boolean checkIfUserLoggedIn() {
        return false;
    }
    
    @java.lang.Override()
    public void logOutUser() {
    }
    
    @java.lang.Override()
    public void saveUserInfoToStorage(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String access) {
    }
}