package com.msvc.inventory.mapper;

import com.msvc.inventory.config.CentralMapperConfig;
import com.msvc.inventory.dto.request.InventoryRequest;
import com.msvc.inventory.dto.response.InventoryResponse;
import com.msvc.inventory.entity.Inventory;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(config = CentralMapperConfig.class)
public interface InventoryMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "currentStock", ignore = true)
    @Mapping(target = "reservedStock", ignore = true)
    @Mapping(target = "status", ignore = true)
    @Mapping(target = "version", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    Inventory toEntity(InventoryRequest request);

    InventoryResponse toResponse(Inventory inventory);

    List<InventoryResponse> toResponseList(List<Inventory> inventories);

}
