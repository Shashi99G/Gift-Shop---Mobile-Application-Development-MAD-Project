package com.example.giftshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Login : AppCompatActivity() {
    private lateinit var logBtn: Button
    private lateinit var twobtn: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        // Initialize btn
        logBtn = findViewById(R.id.login)
        twobtn = findViewById(R.id.no_sing_in)
        // Set OnClickListener for the button
        logBtn.setOnClickListener {
            Toast.makeText(this, "Login successfully!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        twobtn.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
    }
}