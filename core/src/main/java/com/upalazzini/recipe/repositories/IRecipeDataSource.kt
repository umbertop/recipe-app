package com.upalazzini.recipe.repositories

import com.upalazzini.recipe.domain.entities.Recipe
import kotlinx.coroutines.flow.Flow
import java.util.*

interface IRecipeDataSource {
    suspend fun getAll(): Flow<List<Recipe>>
    suspend fun getById(id: UUID): Flow<Recipe?>
}