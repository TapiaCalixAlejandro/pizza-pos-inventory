package com.msvc.inventory.repository;

import com.msvc.inventory.entity.Recipe;
import com.msvc.inventory.enums.RecipeStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findByProductId(Long productId);
    List<Recipe> findByProductIdAndStatus(Long productId, RecipeStatus status);
    boolean existsByProductId(Long productId);
}
