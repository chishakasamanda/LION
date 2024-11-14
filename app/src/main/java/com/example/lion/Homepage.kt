package com.example.lion

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lion.databinding.ActivityHomepageBinding

class Homepage : AppCompatActivity() {
    private lateinit var binding:ActivityHomepageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityHomepageBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_homepage)

        binding.firstNoteCreate.setOnClickListener {
            val intent = Intent(this, CreateNote::class.java)
            startActivity(intent)
        }

    }
}