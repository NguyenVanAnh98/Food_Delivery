package com.example.fooddeliveryerd.repository;

import com.example.fooddeliveryerd.model.RestaurentItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRestaurentItemRepository extends JpaRepository<RestaurentItem, Long> {
}
