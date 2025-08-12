package com.entity;


import javax.persistence.*;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String description;
    private double amount;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    // Getters & Setters
    public int getId() { return id; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
    public Account getAccount() { return account; }
    public void setAccount(Account account) { this.account = account; }
}
