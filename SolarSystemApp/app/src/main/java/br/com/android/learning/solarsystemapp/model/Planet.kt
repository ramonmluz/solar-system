package br.com.android.learning.solarsystemapp.model

class Planet(
    val id: String,
    val name: String,
    val type: String,
    val resume: String,
    val introduction: String,
    val images: List<String>,
    val searchTags: List<String>,
    val geography: String,
    val feature: Features,
)