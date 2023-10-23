package com.example.myrelatif

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class welcome : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val loginButton = findViewById<Button>(R.id.LOGINP)

        loginButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java) // Ganti dengan aktivitas tujuan Anda
            startActivity(intent)
        }
    }
}

