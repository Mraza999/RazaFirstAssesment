package com.example.razafirstassesment

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({splashInt()}, 3000)
    }

    private fun splashInt()
    {
        val i = Intent(this,login::class.java)
        startActivity(i)
        finish()

    }
}