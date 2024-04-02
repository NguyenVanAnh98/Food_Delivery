package com.example.fooddeliveryerd.repository;

import com.example.fooddeliveryerd.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOderRepository extends JpaRepository<Order, Long> {
}
