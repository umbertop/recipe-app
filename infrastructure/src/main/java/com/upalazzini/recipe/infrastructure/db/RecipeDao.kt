package com.upalazzini.recipe.infrastructure.db

import androidx.room.Dao
import androidx.room.Query
import com.upalazzini.recipe.infrastructure.entities.RecipeEntity
import kotlinx.coroutines.flow.Flow
import java.util.*

@Dao
interface RecipeDao {

    @Query("SELECT * FROM recipes")
    fun getAll(): Flow<List<RecipeEntity>>

    @Query("SELECT * FROM recipes WHERE id = :id")
    fun getById(id: UUID): Flow<RecipeEntity?>
}