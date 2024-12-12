package com.myexpenses.models;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name="users")
public class User {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String Email;
    private String password;
    private Date lastConnection;
    @OneToMany(mappedBy = "user")
    private List<DebitCard> creditCards;
    @OneToMany(mappedBy = "user")
    private List<CreditCard> debitCards;


}
