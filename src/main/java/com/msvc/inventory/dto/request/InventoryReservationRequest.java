package com.msvc.inventory.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.util.List;

public class InventoryReservationRequest {

    @NotNull(message = "Order ID is required.")
    @Positive(message = "Order ID must be greater than zero.")
    private Long orderId;

    @NotEmpty(message = "Reservation must contain details.")
    private List<
            @NotNull(message = "Reservation detail cannot be null.")
            @Valid InventoryReservationDetailRequest
            > details;

    public InventoryReservationRequest() {
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public List<InventoryReservationDetailRequest> getDetails() {
        return details;
    }

    public void setDetails(List<InventoryReservationDetailRequest> details) {
        this.details = details;
    }

}
