package com.example.giftshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PageTwo : AppCompatActivity() {
    private lateinit var OneBtn: TextView
    private lateinit var twobtn: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_two)
        // Initialize btn
        OneBtn = findViewById(R.id.skipTwo)
        twobtn = findViewById(R.id.nexttwo)
        // Set OnClickListener for the button
        OneBtn.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
        twobtn.setOnClickListener {
            val intent = Intent(this, PageThree::class.java)
            startActivity(intent)
        }
    }
}