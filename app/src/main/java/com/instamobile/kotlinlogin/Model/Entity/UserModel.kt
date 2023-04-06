package com.instamobile.kotlinlogin.Model.Entity


data class UserModel(
    val name: String,
    val first_name: String,
    val last_name: String,
    val email: String,
    val password: String,
    val image: String,
    val signature: String,
    val role: String,
    val specialite: String,
    val experience: String,
    val location: String
)