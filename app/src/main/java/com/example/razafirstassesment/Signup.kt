package com.example.razafirstassesment

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_signup.*

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        loginlink.setOnClickListener()
        {
            startActivity(Intent(this,Login::class.java))
        }
}

    fun SignUp(view: android.view.View)
    {

        val dataFname: String = FName.text.toString()
        val dataLname: String = LName.text.toString()
        val dataEmail: String = EmailSignup.text.toString()
        val dataPassword: String = PassSignup.text.toString()


        // FIRSTNAME VALIDATION
        if (dataFname.isNotEmpty())
        {
            if (dataFname.length <= 8)
            {

            }
            else
            {
                FName.error = "First Name length must be less than or equal 8"
                return
            }

        }
        else
        {
            FName.error = "First Name can't be empty"
            return
        }


        // LASTNAME VALIDATION
        if (dataLname.isNotEmpty())
        {
            if (dataLname.length <= 8)
            {

            }
            else
            {
                LName.error = "Last Name length must be less than or equal 8"
                return
            }

        }
        else
        {
            LName.error = "Last Name can't be empty"
            return
        }


        // EMAIL VALIDATION
        if (dataEmail.isNotEmpty())
        {
            if (validateEmail(dataEmail))
            {

            }
            else
            {
                EmailSignup.error = "Email is invalid!"
                return
            }
        }
        else
        {
            EmailSignup.error = "Email field can't be empty!"
            return
        }


        // PASSWORD VALIDATION
        if (dataPassword.isNotEmpty())
        {
            if (dataPassword.length <= 8)
            {

            }
            else
            {
                password.error = "Password must be less than or equal to 8"
                return
            }

        }
        else
        {
            password.error = "Password field can't be empty!"
            return
        }


        // RADIO BUTTON VALIDATION
        if (radioBtnMale.isChecked() || radioBtnFemale.isChecked())
        {

        }
        else
        {
            Toast.makeText(this, "Please choose gender", Toast.LENGTH_LONG).show()
            return
        }


        val i = Intent(this, Home::class.java)

        // To Remove very previous Activity
        i.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(i)

    }


    private fun validateEmail(dataEmail: String): Boolean
    {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(dataEmail).matches();
    }
}


