package com.msvc.inventory.dto.request;

import com.msvc.inventory.enums.UnitOfMeasurement;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public class InventoryRequest {

    @NotBlank(message = "Ingredient name is required.")
    @Size(
            max = 150,
            message = "Ingredient name cannot exceed 150 characters."
    )
    private String name;

    @NotNull(message = "Unit of measurement is required.")
    private UnitOfMeasurement unit;

    @NotNull(message = "Minimum stock is required.")
    @PositiveOrZero(message = "Current stock cannot be negative.")
    @Digits(
            integer = 9,
            fraction = 3,
            message = "Minimum stock must have up to 9 integer and 3 decimal places."
    )
    private BigDecimal minimumStock;

    @NotNull(message = "Cost per unit is required.")
    @PositiveOrZero(message = "Cost per unit cannot be negative.")
    @Digits(
            integer = 8,
            fraction = 4,
            message = "Cost per unit must have up to 8 integer digits and 4 decimal places."
    )
    private BigDecimal costPerUnit;

    public InventoryRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UnitOfMeasurement getUnit() {
        return unit;
    }

    public void setUnit(UnitOfMeasurement unit) {
        this.unit = unit;
    }

    public BigDecimal getMinimumStock() {
        return minimumStock;
    }

    public void setMinimumStock(BigDecimal minimumStock) {
        this.minimumStock = minimumStock;
    }

    public BigDecimal getCostPerUnit() {
        return costPerUnit;
    }

    public void setCostPerUnit(BigDecimal costPerUnit) {
        this.costPerUnit = costPerUnit;
    }

}
