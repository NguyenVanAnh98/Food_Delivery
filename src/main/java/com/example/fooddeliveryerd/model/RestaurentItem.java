package com.example.fooddeliveryerd.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "restaurentItems")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RestaurentItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String uuid;
//    private int restaurentId;
    @ManyToOne
    @JoinColumn(name="restaurent_id", nullable=false)
    private Restaurent restaurent;
    //    private int itemId;
    @ManyToOne
    @JoinColumn(name="item_id", nullable=false)
    private Item item;

    private float sellCount;
}
