package com.example.razafirstassesment

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_forget_pass.*

class ForgetPass : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_pass)
    }

    fun ForgetE_btn(view: android.view.View)
    {
        val dataForgetE : String = EmailForget.text.toString()

        if (dataForgetE.isNotEmpty())
        {
            if (validateEmail(dataForgetE))
            {
                startActivity(Intent(this,Home::class.java))
            }
            else
            {
                EmailForget.error="Email is invalid!"
            }
        }
        else
        {
            EmailForget.error="Field can't be empty"
            return
        }
    }

    private fun validateEmail(dataForgetE: String): Boolean
    {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(dataForgetE).matches();
    }
}


