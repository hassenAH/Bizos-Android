package tn.esprit.nebulagaming.viewmodels

import android.content.Context
import android.util.Patterns
import android.widget.EditText
import com.google.android.material.textfield.TextInputLayout
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import tn.esprit.apimodule.NetworkClient
import tn.esprit.apimodule.models.UserRegister
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor() : DefaultViewModel() {

    //on click register button
    fun handleRegister(
        context: Context,
        inputs: List<EditText>,
        textLayouts: List<TextInputLayout>
    ) {

        if (validateInputs(inputs, textLayouts).toList().all { it })

            processRegister(
                first_name = inputs[0].text.toString(),
                last_name = inputs[1].text.toString(),
                email = inputs[2].text.toString(),
                password = inputs[3].text.toString(),
                context = context
            )
    }

    private fun processRegister(
        first_name: String,
        last_name: String,
        email: String,
        password: String,
        context: Context
    ) {

        val authClient = NetworkClient(context)

        val apiService = authClient.getAuthService()

        job = CoroutineScope(Dispatchers.IO).launch {

            val registerResp = apiService.register(
                UserRegister(
                    email = email,
                    password = password,
                    first_name = first_name,
                    last_name = last_name,

                )
            )
            withContext(Dispatchers.Main) {
                try {
                    if (registerResp.isSuccessful)
                        onSuccess()
                    else
                        onError(registerResp)
                } catch (e: Exception) {
                    super.onError()
                }
            }
        }
    }

    private fun validateInputs(
        inputs: List<EditText>,
        textLayouts: List<TextInputLayout>
    ): Pair<Boolean, Boolean> {

        when {

            inputs.all { it.text.isBlank() } -> {
                textLayouts.forEach {
                    it.apply {
                        error = "Field mustn't be blank!"
                    }
                }
                return Pair(false, false)
            }

            !Patterns.EMAIL_ADDRESS.matcher(inputs[1].text.toString()).matches() -> {
                textLayouts[1].apply {
                    isErrorEnabled = true
                    error = "Invalid email !"
                }
                return Pair(false, true)
            }

            else -> {
                textLayouts.forEach {
                    it.apply {
                        error = null
                    }
                }
                return Pair(true, true)
            }
        }
    }
}
