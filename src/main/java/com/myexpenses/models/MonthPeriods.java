package com.myexpenses.models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="months_periods")
public class MonthPeriods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Date initialDate;
    @Column
    private Date finalDate;
}
