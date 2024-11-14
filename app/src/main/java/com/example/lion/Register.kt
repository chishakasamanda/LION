package com.example.lion

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lion.databinding.ActivityRegisterBinding

class Register : AppCompatActivity() {
    private lateinit var binding:ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }
        binding.button2.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }


    }
}