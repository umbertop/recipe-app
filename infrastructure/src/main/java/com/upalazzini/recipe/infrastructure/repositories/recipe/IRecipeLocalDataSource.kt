package com.upalazzini.recipe.infrastructure.repositories.recipe

import com.upalazzini.recipe.domain.entities.Recipe
import kotlinx.coroutines.flow.Flow
import java.util.*

interface IRecipeLocalDataSource {
    suspend fun getAllRecipes(): Flow<List<Recipe>>
    suspend fun getRecipe(id: UUID): Flow<Recipe?>
}