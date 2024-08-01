package com.example.weatherapp

// Data class for the main weather response
data class WeatherResponse(
    val weather: List<Weather>,
    val main: Main
)

// Data class for weather details
data class Weather(
    val description: String
)

// Data class for main details like temperature
data class Main(
    val temp: Float
)

