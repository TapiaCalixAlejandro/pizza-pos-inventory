package com.msvc.inventory.mapper;

import com.msvc.inventory.config.CentralMapperConfig;
import com.msvc.inventory.dto.request.InventoryReservationDetailRequest;
import com.msvc.inventory.dto.response.InventoryReservationDetailResponse;
import com.msvc.inventory.entity.InventoryReservationDetail;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(config = CentralMapperConfig.class)
public interface InventoryReservationDetailMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "reservation", ignore = true)
    @Mapping(target = "ingredient", ignore = true)
    InventoryReservationDetail toEntity(InventoryReservationDetailRequest request);

    @Mapping(source = "reservation.id", target = "reservationId")
    @Mapping(source = "ingredient.id", target = "ingredientId")
    @Mapping(source = "ingredient.name", target = "ingredientName")
    @Mapping(source = "ingredient.unit", target = "unit")
    InventoryReservationDetailResponse toResponse(InventoryReservationDetail detail);

    List<InventoryReservationDetailResponse> toResponseList(
            List<InventoryReservationDetail> details
    );

}
