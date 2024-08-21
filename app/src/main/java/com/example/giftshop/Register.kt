package com.example.giftshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Register : AppCompatActivity() {
    private lateinit var regBtn: Button
    private lateinit var twobtn: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        // Initialize btn
        regBtn = findViewById(R.id.regi)
        twobtn = findViewById(R.id.no_reg_in)
        // Set OnClickListener for the button
        regBtn.setOnClickListener {
            Toast.makeText(this, "Registration successfully!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        twobtn.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}