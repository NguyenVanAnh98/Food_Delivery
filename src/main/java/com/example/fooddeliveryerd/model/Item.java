package com.example.fooddeliveryerd.model;

import com.example.fooddeliveryerd.model.enumration.*;
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
    private EItemType eItemType;
    private EMealType eMealType;
    private EMealState eMealState;
    private EMealFlavor eMealFlavor;
    @ManyToOne
    @JoinColumn(name="restaurant_id", nullable=false)
    private Restaurant restaurant;
    private float price;
    private float discountRate;
    private float max_orderQty;
    private float minOrderQty;
    private EItemStatus eItemStatus;
    private Timestamp createdDate;

}
