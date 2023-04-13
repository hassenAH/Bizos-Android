package tn.esprit.authmodule.repos;

import tn.esprit.authmodule.utils.UserInfo;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH&\u00a8\u0006\f"}, d2 = {"Ltn/esprit/authmodule/repos/UserAuthManager;", "", "checkIfUserLoggedIn", "", "logOutUser", "", "retrieveUserInfoFromStorage", "Ltn/esprit/authmodule/utils/UserInfo;", "saveUserInfoToStorage", "id", "", "access", "AuthModule_debug"})
public abstract interface UserAuthManager {
    
    public abstract void saveUserInfoToStorage(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String access);
    
    @org.jetbrains.annotations.Nullable()
    public abstract tn.esprit.authmodule.utils.UserInfo retrieveUserInfoFromStorage();
    
    public abstract boolean checkIfUserLoggedIn();
    
    public abstract void logOutUser();
}