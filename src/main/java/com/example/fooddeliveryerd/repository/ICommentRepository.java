package com.example.fooddeliveryerd.repository;

import com.example.fooddeliveryerd.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommentRepository extends JpaRepository<Comment, Long> {
}
