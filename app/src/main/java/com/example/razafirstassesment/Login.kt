package com.example.razafirstassesment

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)




        forgotpass.setOnClickListener()
        {
            val i = Intent(this, ForgetPass::class.java)
            startActivity(i)
        }



        signuplink.setOnClickListener()
        {
            val i = Intent(this, Signup::class.java)
            startActivity(i)
        }

    }

    fun login(view: android.view.View)
    {
        val dataUsername : String = UserName.text.toString()
        val dataPassword : String = password.text.toString()

        if (dataUsername.isNotEmpty())
        {


        }
        else
        {
            UserName.error="Field can't be empty"
            return
        }

        if (dataPassword.isNotEmpty())
        {


        }
        else
        {
            password.error="Field can't be empty"
            return
        }

        val i =Intent(this,Home::class.java)
        i.putExtra("message",dataUsername)
        startActivity(i)
    }


}