package me.dio.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity(name = "tb_account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String number;
    private String agency;
    @Column(precision = 14, scale = 2)
    private BigDecimal balance;
    @Column(name = "additional_limit", precision = 14, scale = 2)
    private BigDecimal limit;

    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getAgency() {
        return agency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
