package com.example.fooddeliveryerd.repository;

import com.example.fooddeliveryerd.model.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INewsRepository extends JpaRepository<News, Long> {
}
