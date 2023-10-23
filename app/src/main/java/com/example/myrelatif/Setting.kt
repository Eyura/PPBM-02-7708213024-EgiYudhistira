package com.example.myrelatif

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Setting : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        val homeButton = findViewById<Button>(R.id.homeB)
        val aboutButton = findViewById<Button>(R.id.about)
        val exitButton = findViewById<Button>(R.id.Out)

        homeButton.setOnClickListener {
            val intent = Intent(this, menu1::class.java) // Ganti dengan aktivitas tujuan Anda
            startActivity(intent)
        }

        aboutButton.setOnClickListener {
            val intent = Intent(this, Profil::class.java) // Ganti dengan aktivitas tujuan Anda
            startActivity(intent)
        }

        exitButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java) // Ganti dengan aktivitas tujuan Anda
            startActivity(intent)
        }
    }
}