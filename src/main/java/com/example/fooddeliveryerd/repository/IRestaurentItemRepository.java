package com.example.fooddeliveryerd.repository;

import com.example.fooddeliveryerd.model.RestaurantItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRestaurentItemRepository extends JpaRepository<RestaurantItem, Long> {
}
