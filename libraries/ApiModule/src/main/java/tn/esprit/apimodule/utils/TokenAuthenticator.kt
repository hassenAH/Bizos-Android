package tn.esprit.apimodule.utils

import android.content.Context
import kotlinx.coroutines.runBlocking
import okhttp3.Authenticator
import okhttp3.Request
import okhttp3.Response
import okhttp3.Route
import tn.esprit.apimodule.NetworkClient
import tn.esprit.authmodule.repos.UserAuthManagerImpl

class TokenAuthenticator constructor(private val context: Context) : Authenticator {

    override fun authenticate(route: Route?, response: Response): Request {
        val token = getToken()

        return response.request.newBuilder().addHeader("Authorization", "Bearer $token").build()
    }

    private fun getToken(): String {

        val client = NetworkClient(context)

        val authServ = UserAuthManagerImpl(context)

        val userInfo = authServ.retrieveUserInfoFromStorage()!!

        val response = runBlocking {
            client
                .getAuthService()
                .resetUserToken(userInfo.access)
                .body()!!
        }

        userInfo.apply {
            access = response.access!!
        }

        authServ.saveUserInfoToStorage(
            id = userInfo.userId,
            access = userInfo.access,
        )

        return response.access!!
    }
}