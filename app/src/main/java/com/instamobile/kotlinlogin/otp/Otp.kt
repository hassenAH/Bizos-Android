package com.instamobile.kotlinlogin.otp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.instamobile.kotlinlogin.MainActivity
import com.instamobile.kotlinlogin.R

class Otp : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)
        val otpText = findViewById<EditText>(R.id.otpText)
        val btn_verify = findViewById<EditText>(R.id.btn_verify)
        btn_verify.setOnClickListener()
        {
            val intent = Intent(this@Otp, ChangePassword::class.java)
            startActivity(intent)
            finish()
        }
    }
}