package com.example.fooddeliveryerd.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;


@Entity
@Table(name = "comments")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String uuid;
//    private int restaurentId;
    @ManyToOne
    @JoinColumn(name="restaurent_id", nullable=false)
    private Restaurent restaurent;


//   private int userId;
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

   private String content;
   private Timestamp postDate;
   private boolean deleted;
}
