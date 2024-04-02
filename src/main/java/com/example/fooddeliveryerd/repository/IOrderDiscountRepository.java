package com.example.fooddeliveryerd.repository;

import com.example.fooddeliveryerd.model.OrderDiscount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderDiscountRepository extends JpaRepository<OrderDiscount, Long> {
}
