package com.instamobile.kotlinlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val ProfileEmailTextView = findViewById<TextView>(R.id.ProfileEmail)

        val Nametxt = findViewById<TextView>(R.id.Nametxt)
    }
}