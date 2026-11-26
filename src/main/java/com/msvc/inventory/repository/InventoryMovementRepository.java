package com.msvc.inventory.repository;

import com.msvc.inventory.entity.InventoryMovement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventoryMovementRepository extends JpaRepository<InventoryMovement, Long> {
    List<InventoryMovement> findByIngredientIdOrderByCreatedAtDesc(Long ingredientId);
    List<InventoryMovement> findByOrderIdOrderByCreatedAtDesc(Long orderId);
    List<InventoryMovement> findByReservationIdOrderByCreatedAtDesc(Long reservationId);
}
