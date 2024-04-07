package com.example.fooddeliveryerd.model;

import com.example.fooddeliveryerd.model.enumration.ECartStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "carts")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String uuid;
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;
    @ManyToOne
    @JoinColumn(name="restaurant_id", nullable=false)
    private Restaurant restaurant;

    @ManyToOne
    @JoinColumn(name="order_discount_id", nullable=false)
    private OrderDiscount orderDiscount;

    private float cartAmount;
    private float totalAmount;
    private float rebateAmount;
    private Timestamp cartDate;
    private ECartStatus cartStatus;
}

