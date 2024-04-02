package com.example.fooddeliveryerd.repository;

import com.example.fooddeliveryerd.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICartRepository extends JpaRepository<Cart, Long> {
}
