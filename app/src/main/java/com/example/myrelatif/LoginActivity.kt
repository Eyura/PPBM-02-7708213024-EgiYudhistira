package com.example.myrelatif

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myrelatif.R.id.lastname


class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        supportActionBar?.hide()
        findViewById<EditText>(R.id.firstname)
        findViewById<EditText>(lastname)
        val email = findViewById<EditText>(R.id.email)
        val password = findViewById<EditText>(R.id.password)
        val tombollogin = findViewById<Button>(R.id.tombollogin)
        val register = findViewById<Button>(R.id.register)
        val googleButton: Button = findViewById(R.id.googlebutton)

        googleButton.setOnClickListener(View.OnClickListener {
            // Membuka Google dalam peramban web
            val uri: Uri = Uri.parse("http://www.google.com")
            val intent: Intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        })
        val registerButton = findViewById<Button>(R.id.tombolregister)

        registerButton.setOnClickListener {
            // Implementasi logika pendaftaran di sini
            val intent = Intent(this, registrastion::class.java)
            startActivity(intent)
        }


        tombollogin.setOnClickListener {
            val enteredEmail = email.text.toString()
            val enteredPassword = password.text.toString()

            if (enteredEmail.isNotEmpty() && enteredPassword.isNotEmpty()) {
                if (isLoginValid(enteredEmail, enteredPassword)) {
                    // Login berhasil, arahkan ke halaman menu.
                    val intent = Intent(this, menu1::class.java)
                    startActivity(intent)
                    finish() // Optional: Tutup halaman login.
                } else {
                    Toast.makeText(
                        this,
                        "Login gagal. Cek kembali email dan password Anda.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            } else {
                Toast.makeText(this, "Isi email dan password terlebih dahulu.", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }

    private fun isLoginValid(enteredEmail: String, enteredPassword: String): Boolean {
            val sharedPref = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
            val savedEmail = sharedPref.getString("email", "")
            val savedPassword = sharedPref.getString("password", "")

            Log.d("SharedPreferences", "Saved Email: $savedEmail")
            Log.d("SharedPreferences", "Saved Password: $savedPassword")

            return enteredEmail == savedEmail && enteredPassword == savedPassword
        }

    fun openGoogle(view: View) {}
}