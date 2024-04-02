package com.example.fooddeliveryerd.repository;

import com.example.fooddeliveryerd.model.Restaurent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRestaurentRepository extends JpaRepository<Restaurent, Long> {
}
