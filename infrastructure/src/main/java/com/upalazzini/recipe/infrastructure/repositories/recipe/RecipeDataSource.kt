package com.upalazzini.recipe.infrastructure.repositories.recipe

import com.upalazzini.recipe.domain.entities.Recipe
import com.upalazzini.recipe.repositories.IRecipeDataSource
import kotlinx.coroutines.flow.Flow
import java.util.*

internal class RecipeDataSource(
    private val localDataSource: IRecipeLocalDataSource
) : IRecipeDataSource {

    override suspend fun getAll(): Flow<List<Recipe>> {
        return localDataSource.getAllRecipes()
    }

    override suspend fun getById(id: UUID): Flow<Recipe?> {
        return localDataSource.getRecipe(id)
    }
}