package com.example.fooddeliveryerd.repository;

import com.example.fooddeliveryerd.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderItemRepository extends JpaRepository<OrderItem, Long> {
}
