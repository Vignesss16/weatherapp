package com.example.weatherapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WeatherDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather_details)

        // Retrieve data passed from the MainActivity
        val description = intent.getStringExtra("description") ?: "No description"
        val temperature = intent.getFloatExtra("temperature", 0.0f)

        // Find the TextViews and set their text
        val weatherDescription = findViewById<TextView>(R.id.weatherDescription)
        val tempTextView = findViewById<TextView>(R.id.temperature)

        weatherDescription.text = description
        tempTextView.text = getString(R.string.temperature_format, temperature)
    }
}