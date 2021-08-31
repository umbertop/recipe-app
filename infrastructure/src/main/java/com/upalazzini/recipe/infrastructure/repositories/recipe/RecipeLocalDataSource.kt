package com.upalazzini.recipe.infrastructure.repositories.recipe

import com.upalazzini.recipe.domain.entities.Recipe
import com.upalazzini.recipe.infrastructure.db.RecipeDao
import com.upalazzini.recipe.infrastructure.mappers.RecipeEntityMapper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import java.util.*

class RecipeLocalDataSource(
    private val recipeDao: RecipeDao,
    private val recipeEntityMapper: RecipeEntityMapper
) : IRecipeLocalDataSource {

    override suspend fun getAllRecipes(): Flow<List<Recipe>> {
        return recipeDao.getAll().map { list ->
            list.mapNotNull { entity ->
                recipeEntityMapper.toRecipe(entity)
            }
        }
    }

    override suspend fun getRecipe(id: UUID): Flow<Recipe?> {
        return recipeDao.getById(id).map { entity ->
            recipeEntityMapper.toRecipe(entity)
        }
    }
}