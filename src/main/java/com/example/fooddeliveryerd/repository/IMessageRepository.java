package com.example.fooddeliveryerd.repository;

import com.example.fooddeliveryerd.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMessageRepository extends JpaRepository<Message, Long> {
}
