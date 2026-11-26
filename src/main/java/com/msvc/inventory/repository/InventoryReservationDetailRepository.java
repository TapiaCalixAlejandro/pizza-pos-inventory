package com.msvc.inventory.repository;

import com.msvc.inventory.entity.InventoryReservationDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InventoryReservationDetailRepository extends
        JpaRepository<InventoryReservationDetail, Long> {
    List<InventoryReservationDetail> findByReservationId(Long reservationId);
    Optional<InventoryReservationDetail> findByReservationIdAndIngredientId(
            Long reservationId,
            Long ingredientId
    );
}
