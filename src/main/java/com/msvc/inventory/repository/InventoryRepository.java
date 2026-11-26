package com.msvc.inventory.repository;

import com.msvc.inventory.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    Optional<Inventory> findByNameIgnoreCase(String name);
    boolean existsByNameIgnoreCase(String name);
}
