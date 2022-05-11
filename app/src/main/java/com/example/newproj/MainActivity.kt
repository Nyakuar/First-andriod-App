package com.example.newproj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnBmi: Button
//    lateinit var btnsendmoney: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBmi = findViewById(R.id.btnBmi )
        btnBmi.setOnClickListener {
            val  intent = Intent (this, calculateBmiactivity::class.java )
            startActivity(intent)
        }
//        btnsendmoney = findViewById(R.id.btnSendmoney)
//        btnsendmoney.setOnClickListener {
//            val  intent = Intent (this, sendmoney::class.java )
//            startActivity(intent)


    }
}