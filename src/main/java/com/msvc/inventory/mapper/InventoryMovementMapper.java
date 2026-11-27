package com.msvc.inventory.mapper;

import com.msvc.inventory.config.CentralMapperConfig;
import com.msvc.inventory.dto.request.InventoryMovementRequest;
import com.msvc.inventory.dto.response.InventoryMovementResponse;
import com.msvc.inventory.entity.InventoryMovement;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(config = CentralMapperConfig.class)
public interface InventoryMovementMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "ingredient", ignore = true)
    @Mapping(target = "previousStock", ignore = true)
    @Mapping(target = "newStock", ignore = true)
    @Mapping(target = "referenceId", ignore = true)
    @Mapping(target = "orderId", ignore = true)
    @Mapping(target = "reservationId", ignore = true)
    @Mapping(target = "createdBy", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    InventoryMovement toEntity(InventoryMovementRequest request);

    @Mapping(source = "ingredient.id", target = "ingredientId")
    @Mapping(source = "ingredient.name", target = "ingredientName")
    InventoryMovementResponse toResponse(InventoryMovement inventoryMovement);

    List<InventoryMovementResponse> toResponseList(
            List<InventoryMovement> inventoryMovements
    );

}
