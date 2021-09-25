package com.example.razafirstassesment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val i = intent
        val getMessage = i.getStringExtra("message")

        DisplayAtHome.text = "Warm welcome to you " + getMessage

    }
}