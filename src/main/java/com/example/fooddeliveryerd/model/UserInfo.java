package com.example.fooddeliveryerd.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user_infos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String uuid;
    private String name;
    private String address;

    @OneToOne(mappedBy = "userInfo")
    private User user;

}
