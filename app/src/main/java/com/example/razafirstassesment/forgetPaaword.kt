package com.example.razafirstassesment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_forget_paaword.*
import kotlinx.android.synthetic.main.activity_signup.*

class forgetPaaword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_paaword)



        Fpass_btn.setOnClickListener()
        {
            val dataForgetE : String = EmailForget.text.toString()

            // EMAIL VALIDATION
            if (dataForgetE.isNotEmpty()) {
                if (validateEmail(dataForgetE)) {

                } else {
                    EmailSignup.error = "Email is invalid!"
                    return@setOnClickListener
                }
            } else {
                EmailSignup.error = "Email field can't be empty!"
                return@setOnClickListener
            }
        }
    }


    private fun validateEmail(dataForgetE: String): Boolean {

        return android.util.Patterns.EMAIL_ADDRESS.matcher(dataForgetE).matches()
    }
}