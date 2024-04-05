package com.example.fooddeliveryerd.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "restaurantItems")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String uuid;
    @ManyToOne
    @JoinColumn(name="restaurant_id", nullable=false)
    private Restaurant restaurant;
    @ManyToOne
    @JoinColumn(name="item_id", nullable=false)
    private Item item;

    private float sellCount;
}
