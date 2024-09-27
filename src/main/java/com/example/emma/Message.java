package com.example.emma;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String content;
    // Constructors, Getters, Setters
    public Message() {}

    public Message(String content) {

        this.content = content;
    }

    // Getters
    public Integer getId() {

        return this.id;
    }
    public String getContent(){
        return this.content;
    }
}
