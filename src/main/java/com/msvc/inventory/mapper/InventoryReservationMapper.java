package com.msvc.inventory.mapper;

import com.msvc.inventory.config.CentralMapperConfig;
import com.msvc.inventory.dto.request.InventoryReservationRequest;
import com.msvc.inventory.dto.response.InventoryReservationResponse;
import com.msvc.inventory.entity.InventoryReservation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(
        config = CentralMapperConfig.class,
        uses = InventoryReservationDetailMapper.class
)
public interface InventoryReservationMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "status", ignore = true)
    @Mapping(target = "version", ignore = true)
    @Mapping(target = "details", ignore = true)
    @Mapping(target = "expiresAt", ignore = true)
    @Mapping(target = "confirmedAt", ignore = true)
    @Mapping(target = "releasedAt", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    InventoryReservation toEntity(InventoryReservationRequest request);

    InventoryReservationResponse toResponse(InventoryReservation inventoryReservation);

    List<InventoryReservationResponse> toResponseList(
            List<InventoryReservation> inventoryReservations
    );

}
