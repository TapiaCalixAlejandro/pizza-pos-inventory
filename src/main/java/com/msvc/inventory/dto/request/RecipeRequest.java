package com.msvc.inventory.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.util.List;

public class RecipeRequest {

    @NotNull(message = "Product ID is required.")
    @Positive(message = "Product ID must be greater than zero.")
    private Long productId;

    @NotBlank(message = "Recipe name is required.")
    @Size(
            max = 150,
            message = "Recipe name cannot exceed 150 characters."
    )
    private String name;

    @NotEmpty(message = "A recipe must contain at least one ingredient.")
    private List<
            @NotNull(message = "Recipe ingredient cannot be null.")
            @Valid RecipeIngredientRequest
            > ingredients;

    public RecipeRequest() {
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RecipeIngredientRequest> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<RecipeIngredientRequest> ingredients) {
        this.ingredients = ingredients;
    }

}
