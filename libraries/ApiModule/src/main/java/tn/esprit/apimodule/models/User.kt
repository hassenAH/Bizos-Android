package tn.esprit.apimodule.models

import java.util.*

data class User(
    val _id: String,
    val first_name: String,
    val last_name: String,
    val email: String,
    val password: String,
    val image: String,
    val signature: String,
    val role: String,
    val specialite: String,
    val experience: Int,
    val location: String
)
