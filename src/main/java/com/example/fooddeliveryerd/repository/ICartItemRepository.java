package com.example.fooddeliveryerd.repository;

import com.example.fooddeliveryerd.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICartItemRepository extends JpaRepository<CartItem, Long> {
}
