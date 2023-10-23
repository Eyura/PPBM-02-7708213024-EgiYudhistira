package com.example.myrelatif

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class registrastion : AppCompatActivity() {

    private lateinit var firstName: EditText
    private lateinit var lastName: EditText
    private lateinit var email: EditText
    private lateinit var password: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)

        firstName = findViewById(R.id.firstname)
        lastName = findViewById(R.id.lastname)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)

        val registerButton: Button = findViewById(R.id.register)
        val loginButton: Button = findViewById(R.id.login)

        registerButton.setOnClickListener {
            val enteredFirstName = firstName.text.toString()
            val enteredLastName = lastName.text.toString()
            val enteredEmail = email.text.toString()
            val enteredPassword = password.text.toString()

            if (enteredFirstName.isNotEmpty() && enteredLastName.isNotEmpty() && enteredEmail.isNotEmpty() && enteredPassword.isNotEmpty()) {

                // Simpan email dan password ke SharedPreferences
                val sharedPref = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
                val editor = sharedPref.edit()
                editor.putString("email", enteredEmail)
                editor.putString("password", enteredPassword)
                editor.apply()

                // After successful registration, you may want to navigate to the login page
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Please fill in all the fields.", Toast.LENGTH_SHORT).show()
            }
        }

        loginButton.setOnClickListener {
            // Navigasi ke halaman login
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
