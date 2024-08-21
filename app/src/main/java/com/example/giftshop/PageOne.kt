package com.example.giftshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PageOne : AppCompatActivity() {
    private lateinit var OneBtn: TextView
    private lateinit var twobtn: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_one)
        // Initialize btn
        OneBtn = findViewById(R.id.skipOne)
        twobtn = findViewById(R.id.nextone)
        // Set OnClickListener for the button
        OneBtn.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
        twobtn.setOnClickListener {
            val intent = Intent(this, PageTwo::class.java)
            startActivity(intent)
        }
    }
}