package com.example.lion

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.lion.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Back arrow button to go to the previous screen
        binding.backPinkimage.setOnClickListener {
            finish() // Ends this activity and goes back to the previous screen
        }

        // Login button with validation
        binding.btnLogin.setOnClickListener {
            val usernameOrEmail = binding.etUsernameOrEmail.text.toString().trim()
            val password = binding.etPassword.text.toString().trim()

            if (usernameOrEmail.isEmpty()) {
                binding.etUsernameOrEmail.error = "Username or Email is required"
                return@setOnClickListener
            }
            if (password.isEmpty()) {
                binding.etPassword.error = "Password is required"
                return@setOnClickListener
            }

            // If both fields are filled, navigate to the Homepage
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
            finish() // Closes Login activity so user can't go back to it
        }
    }
}
