package com.example.newproj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var btnsendmoney:Button
lateinit var btnCancel:Button
lateinit var btnSend:Button

class calculateBmiactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate_bmiactivity)
        btnsendmoney = findViewById(R.id.btnSendmoney)
        btnsendmoney.setOnClickListener {
            val intent = Intent(this, sendmoney::class.java)
            startActivity(intent)

            setContentView(R.layout.activity_calculate_bmiactivity)
            btnCancel = findViewById(R.id.btnSendmoney)
            btnCancel.setOnClickListener {
                val intent = Intent(this, sendmoney::class.java)
                startActivity(intent)

                setContentView(R.layout.activity_calculate_bmiactivity)
                btnSend = findViewById(R.id.btnSendmoney)
                btnSend.setOnClickListener {
                    val intent = Intent(this, sendmoney::class.java)
                    startActivity(intent)

                }
            }
        }
    }
}
