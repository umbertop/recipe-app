package com.upalazzini.recipe.infrastructure.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.upalazzini.recipe.infrastructure.entities.RecipeEntity

@Database(entities = [RecipeEntity::class], version = 1)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun recipeDao(): RecipeDao
}