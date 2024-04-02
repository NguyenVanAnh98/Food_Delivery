package com.example.fooddeliveryerd.repository;

import com.example.fooddeliveryerd.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserInfoRepository extends JpaRepository<UserInfo, Long> {
}
