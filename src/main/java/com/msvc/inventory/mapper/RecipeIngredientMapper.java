package com.msvc.inventory.mapper;

import com.msvc.inventory.config.CentralMapperConfig;
import com.msvc.inventory.dto.request.RecipeIngredientRequest;
import com.msvc.inventory.dto.response.RecipeIngredientResponse;
import com.msvc.inventory.entity.RecipeIngredient;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(config = CentralMapperConfig.class)
public interface RecipeIngredientMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "recipe", ignore = true)
    @Mapping(target = "ingredient", ignore = true)
    RecipeIngredient toEntity(RecipeIngredientRequest request);

    @Mapping(source = "recipe.id", target = "recipeId")
    @Mapping(source = "ingredient.id", target = "ingredientId")
    @Mapping(source = "ingredient.name", target = "ingredientName")
    @Mapping(source = "ingredient.unit", target = "unit")
    RecipeIngredientResponse toResponse(RecipeIngredient recipeIngredient);

    List<RecipeIngredientResponse> toResponseList(
            List<RecipeIngredient> recipeIngredients
    );

}
