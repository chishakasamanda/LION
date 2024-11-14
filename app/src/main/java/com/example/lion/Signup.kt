package com.example.lion

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.lion.databinding.ActivitySignupBinding

class Signup : AppCompatActivity() {
    private lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backPinkimage.setOnClickListener {
            finish() // Ends this activity and goes back to the previous screen
        }

        binding.btnSignup.setOnClickListener {
            val username = binding.etUsername.text.toString().trim()
            val email = binding.etEmail.text.toString().trim()
            val password = binding.etPassword.text.toString().trim()

            // Validation logic
            if (username.isEmpty()) {
                binding.etUsername.error = "Username is required"
                return@setOnClickListener
            }
            if (email.isEmpty()) {
                binding.etEmail.error = "Email is required"
                return@setOnClickListener
            }
            if (password.isEmpty()) {
                binding.etPassword.error = "Password is required"
                return@setOnClickListener
            }

            // If all fields are filled, proceed to Homepage
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
        }
    }
}
