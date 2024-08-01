package com.example.weatherapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "MainActivity started")

        // Remove API calls temporarily
        val description = "Sunny"
        val temperature = 25.0f

        val intent = Intent(this, WeatherDetailsActivity::class.java).apply {
            putExtra("description", description)
            putExtra("temperature", temperature)
        }
        startActivity(intent)
    }
}