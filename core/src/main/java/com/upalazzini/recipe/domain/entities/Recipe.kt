package com.upalazzini.recipe.domain.entities

import java.util.*

data class Recipe(
    val id: UUID,
    val title: String,
    val imageUrl: String,
    val ingredients: List<String>
)