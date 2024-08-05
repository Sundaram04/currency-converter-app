package com.example.currencyconverterapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val edt: EditText = findViewById(R.id.txtAmount)
        val btnRupees: Button = findViewById(R.id.buttonR)
        val btnDollar: Button = findViewById(R.id.buttonD)
        val txt: TextView = findViewById(R.id.textedit)

        btnRupees.setOnClickListener {
            val amount = edt.text.toString().toInt()
            val rupeeAmount = 80*amount
            txt.text = "Converted Amount : $rupeeAmount"
        }

        btnDollar.setOnClickListener {
            val amount = edt.text.toString().toInt()
            val dollarAmount = amount/80
            txt.text = "Converted Amount : $dollarAmount"
        }

    }
}