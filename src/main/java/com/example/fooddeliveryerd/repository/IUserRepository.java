package com.example.fooddeliveryerd.repository;

import com.example.fooddeliveryerd.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
}
