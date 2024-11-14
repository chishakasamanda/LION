package com.example.lion

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lion.databinding.ActivitySplash2Binding

class Splash2 : AppCompatActivity() {
    private lateinit var binding:ActivitySplash2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplash2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // binding for the getstart
        binding.getStart.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
    }
}