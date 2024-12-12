package com.myexpenses.models;
import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name="credit_cards_periods")
public class CreditCardPeriod {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private Date initialDate;
    @Column
    private Date finalDate;
    @ManyToOne
    @JoinColumn(name = "credit_card_id", referencedColumnName = "id")
    private CreditCard creditCard;


}
