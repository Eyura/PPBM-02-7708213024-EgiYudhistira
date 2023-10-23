package com.example.myrelatif

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class menu1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val menucyber = findViewById<ImageButton>(R.id.menucyber)
        val menuapp = findViewById<ImageButton>(R.id.menuapp)
        val menu3 = findViewById<ImageButton>(R.id.menu3)
        val settingButton = findViewById<ImageButton>(R.id.setting)

        menucyber.setOnClickListener {
            val intent = Intent(this, develop::class.java)
            startActivity(intent)
        }

        menuapp.setOnClickListener {
            val intent = Intent(this, mobileapp::class.java)
            startActivity(intent)
        }

        menu3.setOnClickListener {
            val intent = Intent(this, ask::class.java)
            startActivity(intent)
        }

        settingButton.setOnClickListener {
            val intent = Intent(this, Setting::class.java)
            startActivity(intent)
        }
    }
}