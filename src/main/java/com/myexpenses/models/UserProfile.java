package com.myexpenses.models;

import jakarta.persistence.*;

@Entity
@Table(name="users_profiles")
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
}
