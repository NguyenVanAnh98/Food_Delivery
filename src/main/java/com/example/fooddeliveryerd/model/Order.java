package com.example.fooddeliveryerd.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String uuid;
//    private int userId;
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

//    private int restaurentId;
    @ManyToOne
    @JoinColumn(name="restaurent_id", nullable=false)
    private Restaurent restaurent;

//    private int orderDiscountId;
    @ManyToOne
    @JoinColumn(name="order_discount_id", nullable=false)
    private OrderDiscount orderDiscount;

    private String serialNumber;
    private float orderAmount;
    private float rebateAmount;
    private float totalAmount;
    private Timestamp orderDate;


}
