package com.example.giftshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Catagory : AppCompatActivity() {
    private lateinit var hombtn: ImageView
    private lateinit var catbtn: ImageView
    private lateinit var probtn: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catagory)
        // Initialize btn
        hombtn = findViewById(R.id.home)
        catbtn = findViewById(R.id.cat)
        probtn = findViewById(R.id.pro)

        hombtn.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        catbtn.setOnClickListener {
            val intent = Intent(this, Catagory::class.java)
            startActivity(intent)
        }
        probtn.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
    }
}