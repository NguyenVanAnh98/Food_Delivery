package com.example.fooddeliveryerd.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "orderItems")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String uuid;
//    private int orderId;
    @ManyToOne
    @JoinColumn(name="order_id", nullable=false)
    private Order order;

//    private int itemId;
    @ManyToOne
    @JoinColumn(name="item_id", nullable=false)
    private Item item;

    private float qty;
    private float amount;
    private float totalAmount;


}
