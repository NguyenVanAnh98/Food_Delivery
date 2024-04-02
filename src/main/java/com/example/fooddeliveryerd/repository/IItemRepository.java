package com.example.fooddeliveryerd.repository;

import com.example.fooddeliveryerd.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IItemRepository extends JpaRepository<Item, Long> {
}
