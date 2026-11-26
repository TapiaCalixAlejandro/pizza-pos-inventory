package com.msvc.inventory.repository;

import com.msvc.inventory.entity.InventoryReservation;
import com.msvc.inventory.enums.ReservationStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface InventoryReservationRepository extends JpaRepository<InventoryReservation, Long> {
    Optional<InventoryReservation> findByOrderId(Long orderId);
    boolean existsByOrderId(Long orderId);
    List<InventoryReservation> findByStatus(ReservationStatus status);
    List<InventoryReservation> findByStatusAndExpiresAtBefore(
            ReservationStatus status,
            LocalDateTime dateTime
    );
}
