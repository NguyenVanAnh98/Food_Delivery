package com.example.fooddeliveryerd.repository;

import com.example.fooddeliveryerd.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRestaurentRepository extends JpaRepository<Restaurant, Long> {
}
