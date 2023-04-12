package tn.esprit.authmodule.repos

import tn.esprit.authmodule.utils.UserInfo


interface UserAuthManager {

    fun saveUserInfoToStorage(id: String, access: String)

    fun retrieveUserInfoFromStorage(): UserInfo?

    fun checkIfUserLoggedIn(): Boolean

    fun logOutUser()
}