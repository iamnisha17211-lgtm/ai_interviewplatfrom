package com.nisha.aiintervi.model;


import jakarta.persistence.*;

@Entity
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private int score;
    private String feedback;

    // Getters & Setters
}
