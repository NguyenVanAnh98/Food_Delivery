package com.example.fooddeliveryerd.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "order_discounts")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDiscount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String uuid;
//    private int restaurent_id;
    @ManyToOne
    @JoinColumn(name="restaurent_id", nullable=false)
    private Restaurent restaurent;

    private float max_amount;
    private float min_amount;
    private float discount_rate;
    private Timestamp start_date;
    private Timestamp end_date;
    private Timestamp created_date;

}

