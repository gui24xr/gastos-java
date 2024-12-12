package com.myexpenses.models;

import jakarta.persistence.*;

import java.sql.Date;

@MappedSuperclass
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "card_name", nullable = false)
    private String name;
    @Column(name="expiration_date", nullable = false)
    private Date expirationDate;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}




