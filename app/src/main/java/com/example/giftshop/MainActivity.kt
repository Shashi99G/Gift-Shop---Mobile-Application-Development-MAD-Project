package com.example.giftshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var medlogoLoad: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Initialize medlogoLoad
        medlogoLoad = findViewById(R.id.medlogoLod)

        medlogoLoad.alpha = 0f
        medlogoLoad.animate().setDuration(2500).alpha(1f).withEndAction {
            val i = Intent(this, PageOne::class.java) // Replace NextActivity with the actual name of your next activity
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}