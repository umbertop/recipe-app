package com.upalazzini.recipe.infrastructure.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "recipes")
data class RecipeEntity(
    @PrimaryKey
    val id: UUID,
    @ColumnInfo(name = "title")
    val title: String,
    @ColumnInfo(name = "image_url")
    val imageUrl: String,
    @ColumnInfo(name = "ingredients")
    val ingredients: List<String>
)