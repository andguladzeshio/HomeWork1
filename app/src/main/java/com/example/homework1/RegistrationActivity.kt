package com.example.homework1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistrationActivity : AppCompatActivity() {
    private lateinit var registerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        registerButton = findViewById(R.id.registerButton)

        registerButton.setOnClickListener {
            val intent = Intent(this, AddImageActivity::class.java)
            startActivity(intent)
        }
    }
}