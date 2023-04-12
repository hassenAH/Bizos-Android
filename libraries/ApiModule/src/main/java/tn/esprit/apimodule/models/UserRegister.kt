package tn.esprit.apimodule.models

data class UserRegister(
    val first_name: String,
    val last_name: String,
    val email: String,
    val password: String,
)
