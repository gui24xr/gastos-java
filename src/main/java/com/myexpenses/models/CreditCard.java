package com.myexpenses.models;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="credit_cards")
public class CreditCard extends Card {
    @OneToMany(mappedBy = "creditCard")
    private List<CreditCardPeriod>  periods;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

}
