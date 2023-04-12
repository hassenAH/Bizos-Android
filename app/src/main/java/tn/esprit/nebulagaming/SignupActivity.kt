package tn.esprit.nebulagaming

import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.EditorInfo.IME_ACTION_DONE
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import tn.esprit.nebulagaming.utils.HelperFunctions.toastMsg
import tn.esprit.nebulagaming.utils.hideKeyboard
import tn.esprit.nebulagaming.utils.on
import tn.esprit.nebulagaming.viewmodels.RegisterViewModel

class SignupActivity : AppCompatActivity() {

    private lateinit var haveacc: TextView
    private lateinit var btnRegister: Button
    private lateinit var FirstNameTextLayout: TextInputLayout
    private lateinit var LastNameTextLayout: TextInputLayout
    private lateinit var EmailTextLayout: TextInputLayout
    private lateinit var PasswordTextLayout: TextInputLayout
    private lateinit var PasswordInputText: TextInputEditText
    private lateinit var FirstNameInputText: TextInputEditText
    private lateinit var LastNameInputText: TextInputEditText
    private lateinit var EmailInputText: TextInputEditText




    private val RegVm: RegisterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        btnRegister = findViewById(R.id.buttonSubmit)
        FirstNameTextLayout = findViewById(R.id.firstNameTextLay)
        LastNameTextLayout = findViewById(R.id.lastNameTextLay)
        EmailTextLayout = findViewById(R.id.emailTextLay)
        PasswordTextLayout = findViewById(R.id.passwordTextLay)
        FirstNameInputText = findViewById(R.id.firstName)
        LastNameInputText = findViewById(R.id.lastName)
        EmailInputText = findViewById(R.id.email)
        PasswordInputText = findViewById(R.id.password)
        haveacc = findViewById(R.id.haveAccount)


        btnRegister.setOnClickListener {
            if (FirstNameInputText.text.toString().isEmpty()) {
                FirstNameTextLayout.error = "Name Required"
            } else if (EmailInputText.text.toString().isEmpty()) {
                EmailTextLayout.error = "Email Required"
            } else if (PasswordInputText.text.toString().isEmpty()) {
                PasswordTextLayout.error = "Password Required"
            } else if (LastNameInputText.text.toString().isEmpty()) {
                LastNameTextLayout.error = "Phone Required"
            } else {
                RegVm.handleRegister(
                    this,
                    listOf(FirstNameInputText, EmailInputText, PasswordInputText, LastNameInputText),
                    listOf(FirstNameTextLayout, EmailTextLayout, PasswordTextLayout, LastNameTextLayout)
                )
                RegVm.errorMessage.observe(this) { error ->
                    if (error != null) {
                        when (error) {
                            "Email already exists" -> {
                                EmailTextLayout.error = error
                            }
                        }
                        toastMsg(this, error)
                    } else {
                        toastMsg(this, "Success in !")
                        Intent(this, LoginActivity::class.java).apply {
                            startActivity(this)
                        }
                        finish()
                    }
                }


            }
        }

        haveacc.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }


}