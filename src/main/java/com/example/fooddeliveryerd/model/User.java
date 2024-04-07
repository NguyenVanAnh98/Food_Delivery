package com.example.fooddeliveryerd.model;

import com.example.fooddeliveryerd.model.enumration.ERole;
import com.example.fooddeliveryerd.model.enumration.EUserType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String uuid;
    private String email;
    private String password;

    @ManyToOne
    @JoinColumn(name = "restaurant_id", referencedColumnName = "id")
    private Restaurant restaurant;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userInfo_id", referencedColumnName = "id")
    private UserInfo userInfo;

    private EUserType userType;
    private ERole eRole;
    private boolean currentStatus;
}

