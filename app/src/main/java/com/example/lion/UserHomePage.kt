package com.example.lion

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lion.databinding.ActivityHomepageBinding

class UserHomePage : AppCompatActivity() {
    private lateinit var binding:ActivityHomepageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityHomepageBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_user_home_page)

        binding.firstNoteCreate.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}