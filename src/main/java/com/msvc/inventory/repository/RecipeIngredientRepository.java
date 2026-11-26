package com.msvc.inventory.repository;

import com.msvc.inventory.entity.RecipeIngredient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RecipeIngredientRepository extends JpaRepository<RecipeIngredient, Long> {
    List<RecipeIngredient> findByRecipe_Id(Long recipeId);
    Optional<RecipeIngredient> findByRecipe_IdAndIngredient_Id(
            Long recipeId,
            Long ingredientId
    );
    boolean existsByRecipe_IdAndIngredient_Id(
            Long recipeId,
            Long ingredientId
    );
}
