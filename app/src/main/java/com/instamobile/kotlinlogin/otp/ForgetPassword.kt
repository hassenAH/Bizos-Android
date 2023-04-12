package com.instamobile.kotlinlogin.otp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

import com.instamobile.kotlinlogin.MainActivity
import com.instamobile.kotlinlogin.R

class ForgetPassword : AppCompatActivity() {

       override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)
        val txtEmail = findViewById<EditText>(R.id.txtEmail)
         var btn_send = findViewById<Button>(R.id.btn_send);
        btn_send.setOnClickListener()
        {
            val intent = Intent(this@ForgetPassword, Otp::class.java)
            startActivity(intent)
            finish()
        }
    }

}