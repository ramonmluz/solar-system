package br.com.android.learning.solarsystemapp.model

data class Features(
    val orbitalPeriod: List<String>,
    val orbitalSpeed: String,
    val rotationDuration: String,
    val radius: String,
    val diameter: String,
    val sunDistance: String,
    val oneWayLightToTheSun: String,
    val satellites: Satellites,
    val temperature: String,
    val gravity: String,
)