package com.example.fooddeliveryerd.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "messages")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String uuid;
//    private int senderId;
    @ManyToOne
    @JoinColumn(name="sender_id", nullable=false)
    private User sender;
//    private int receiverId;
    @ManyToOne
    @JoinColumn(name="receiver_id", nullable=false)
    private User receiver;

    private String topic;
    private String content;
    private Timestamp postDate;
    private boolean deleted;

}
