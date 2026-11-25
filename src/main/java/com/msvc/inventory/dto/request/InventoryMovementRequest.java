package com.msvc.inventory.dto.request;

import com.msvc.inventory.enums.MovementType;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public class InventoryMovementRequest {

    @NotNull(message = "Ingredient ID is required.")
    @Positive(message = "Ingredient ID must be greater than zero.")
    private Long ingredientId;

    @NotNull(message = "Movement type is required.")
    private MovementType type;

    @NotNull(message = "Quantity is required.")
    @Positive(message = "Quantity must be greater than zero.")
    @Digits(
            integer = 9,
            fraction = 3,
            message = "Quantity must have up to 9 integer digits and 3 decimal places."
    )
    private BigDecimal quantity;

    @Size(
            max = 300,
            message = "Description must not exceed 300 characters."
    )
    private String description;

    public InventoryMovementRequest() {
    }

    private Long orderId;

    public Long getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(Long ingredientId) {
        this.ingredientId = ingredientId;
    }

    public MovementType getType() {
        return type;
    }

    public void setType(MovementType type) {
        this.type = type;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

}
