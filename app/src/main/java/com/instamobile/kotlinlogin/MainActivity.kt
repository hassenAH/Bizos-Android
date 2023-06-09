package com.instamobile.kotlinlogin

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException

import com.instamobile.kotlinlogin.otp.ForgetPassword
import com.instamobile.kotlinlogin.otp.Otp

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  internal var compositeDisposable = CompositeDisposable()
    override fun onStop() {
        compositeDisposable.clear()
        super.onStop()
    }

    lateinit var btnSignIn: Button
    lateinit var emailEt: EditText
    lateinit var passwordEd: EditText

    private val RC_SIGN_IN = 1
    lateinit var txtForget: TextView
    lateinit var googleSignInClient: GoogleSignInClient
    lateinit var callbackManager: CallbackManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        callbackManager = CallbackManager.Factory.create()
        LoginManager.getInstance()
            .registerCallback(callbackManager, object : FacebookCallback<LoginResult> {
                override fun onSuccess(result: LoginResult?) {
                    Log.e("facebook", "onSuccess")
                    //TODO: handle facebook sign in here
                }

                override fun onCancel() {
                    Log.e("facebook", "onCancel")

                }

                override fun onError(error: FacebookException?) {
                    loginError.text = error?.message
                }
            })
        setContentView(R.layout.activity_sign_up)


        btnSignIn = findViewById(R.id.btnLogin)
        emailEt = findViewById(R.id.etEmail)
        passwordEd = findViewById(R.id.etPassword)





        btnSignIn.setOnClickListener {
            val intent = Intent(this,LawyerHome::class.java)
            startActivity(intent)
           // Toast.makeText(this@MainActivity,"hdgjzhegdjz",).show()
            //loginUser(emailEt.text.toString(),passwordEd.text.toString())
        }




         txtForget = findViewById(R.id.Forget)
        txtForget.setOnClickListener{
    val forgetPasswordIntent = Intent(this, ForgetPassword::class.java)
    startActivity(forgetPasswordIntent)
            finish()
}
        //google sign in
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestEmail()
            .build()
        googleSignInClient = GoogleSignIn.getClient(this, gso)

        googleButton.setOnClickListener {
            loading.visibility = View.VISIBLE
            val signInIntent = googleSignInClient.signInIntent
            startActivityForResult(signInIntent, RC_SIGN_IN)
        }
        // facebook sign in
        btLoginFacebook.setOnClickListener {
            LoginManager.getInstance().logInWithReadPermissions(this, listOf("public_profile"))
        }

    }




    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        callbackManager.onActivityResult(requestCode, resultCode, data)

        //google sign in
        if (requestCode == RC_SIGN_IN) {
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            try {
                val account = task.getResult(ApiException::class.java)
                loading.visibility = View.GONE
                //TODO: handle google sign in here
            } catch (e: ApiException) {
                e.printStackTrace()
                loading.visibility = View.GONE
                loginError.text = e.message
            }
        }
    }
}