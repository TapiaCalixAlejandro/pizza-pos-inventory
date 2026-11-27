package com.msvc.inventory.mapper;

import com.msvc.inventory.config.CentralMapperConfig;
import com.msvc.inventory.dto.request.RecipeRequest;
import com.msvc.inventory.dto.response.RecipeResponse;
import com.msvc.inventory.entity.Recipe;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(
        config = CentralMapperConfig.class,
        uses = RecipeIngredientMapper.class
)
public interface RecipeMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "status", ignore = true)
    @Mapping(target = "version", ignore = true)
    @Mapping(target = "ingredients", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    Recipe toEntity(RecipeRequest request);

    RecipeResponse toResponse(Recipe recipe);

    List<RecipeResponse> toResponseList(List<Recipe> recipes);

}
