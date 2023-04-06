package com.instamobile.kotlinlogin.otp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.instamobile.kotlinlogin.MainActivity
import com.instamobile.kotlinlogin.R

class ForgetPassword : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)
        val txtEmail = findViewById<EditText>(R.id.txtEmail)
        val btn_send = findViewById<EditText>(R.id.btn_send)
        btn_send.setOnClickListener()
        {
            val intent = Intent(this@ForgetPassword, Otp::class.java)
            startActivity(intent)
            finish()
        }
    }
}