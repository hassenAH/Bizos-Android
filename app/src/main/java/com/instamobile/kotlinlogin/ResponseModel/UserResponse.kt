package com.instamobile.kotlinlogin.ResponseModel

import com.instamobile.kotlinlogin.Model.Entity.UserModel

data class UserResponse (
    val token: String,
    val success: Boolean,
    val error: String,
    val status: Int,
    val user: UserModel
)