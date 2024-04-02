package com.example.fooddeliveryerd.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "items")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String uuid;
    private String name;
   private String icon;
   private String image;
//   private int restaurentId;
   @ManyToOne
   @JoinColumn(name="restaurent_id", nullable=false)
   private Restaurent restaurent;
   private float price;
   private float discountRate;
   private float max_orderQty;
   private float minOrderQty;
  private Timestamp createdDate;

}
