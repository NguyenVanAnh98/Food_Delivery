package com.example.fooddeliveryerd.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cartItems")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   private String uuid;
//   private int itemId;
    @ManyToOne
    @JoinColumn(name="item_id", nullable=false)
    private Item item;

//   private int cartId;
    @ManyToOne
    @JoinColumn(name="cart_id", nullable=false)
    private Cart cart;

   private float qty;
   private float amount;
   private float totalAmount;
}
