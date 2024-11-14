package com.example.lion

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        // Delay for the splash screen (e.g., 3 seconds)
        Handler().postDelayed({
            // Navigate to SplashActivity2
            val intent = Intent(this, Splash2::class.java)
            startActivity(intent)
            finish() // Close SplashActivity1
        }, 3000) // Delay time in milliseconds (e.g., 3000ms = 3s)
    }
}