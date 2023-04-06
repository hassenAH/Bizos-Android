package com.instamobile.kotlinlogin.otp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.instamobile.kotlinlogin.MainActivity
import com.instamobile.kotlinlogin.R

class ChangePassword : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_password)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val etConfirmPassword = findViewById<EditText>(R.id.etConfirmPassword)
        val btn_Confirm = findViewById<EditText>(R.id.btn_Confirm)
        btn_Confirm.setOnClickListener()
        {
            val intent = Intent(this@ChangePassword, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

}