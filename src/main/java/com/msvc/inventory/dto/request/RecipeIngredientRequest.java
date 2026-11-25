package com.msvc.inventory.dto.request;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public class RecipeIngredientRequest {

    @NotNull(message = "Ingredient ID is required.")
    @Positive(message = "Ingredient ID must be greater than zero.")
    private Long ingredientId;

    @NotNull(message = "Quantity is required.")
    @Positive(message = "Ingredient quantity must be greater than zero.")
    @Digits(
            integer = 9,
            fraction = 3,
            message = "Ingredient quantity must have up to 9 integer digits and 3 decimal places."
    )
    private BigDecimal quantity;

    public RecipeIngredientRequest() {
    }

    public Long getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(Long ingredientId) {
        this.ingredientId = ingredientId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

}
