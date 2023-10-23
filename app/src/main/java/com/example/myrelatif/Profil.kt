package com.example.myrelatif

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Profil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)
        val setting = findViewById<ImageButton>(R.id.setting)
        val keluar = findViewById<ImageButton>(R.id.keluar)

        setting.setOnClickListener {
            val Intent = Intent(this, Setting::class.java)
            startActivity(intent)

            keluar.setOnClickListener {
                val Intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)

            }
        }
    }
}