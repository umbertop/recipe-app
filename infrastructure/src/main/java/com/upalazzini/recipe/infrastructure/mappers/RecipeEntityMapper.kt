package com.upalazzini.recipe.infrastructure.mappers

import com.upalazzini.recipe.domain.entities.Recipe
import com.upalazzini.recipe.infrastructure.entities.RecipeEntity

class RecipeEntityMapper {
    fun toRecipeEntity(recipe: Recipe): RecipeEntity {
        return RecipeEntity(
            id = recipe.id,
            title = recipe.title,
            imageUrl = recipe.imageUrl,
            ingredients = recipe.ingredients
        )
    }

    fun toRecipe(recipeEntity: RecipeEntity?): Recipe? {
        if (recipeEntity == null) return null

        return Recipe(
            id = recipeEntity.id,
            title = recipeEntity.title,
            imageUrl = recipeEntity.imageUrl,
            ingredients = recipeEntity.ingredients
        )
    }
}