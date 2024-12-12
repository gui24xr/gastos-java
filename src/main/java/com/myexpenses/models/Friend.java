package com.myexpenses.models;

import jakarta.persistence.*;

@Entity
@Table(name="friends")
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;
}
