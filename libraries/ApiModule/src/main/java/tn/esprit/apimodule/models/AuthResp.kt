package tn.esprit.apimodule.models


data class AuthResp(
    val error: String? = null,
    val access: String? = null,
    val message: String? = null,
    val user: User
)