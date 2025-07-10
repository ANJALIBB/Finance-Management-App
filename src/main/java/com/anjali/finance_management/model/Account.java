package com.anjali.finance_management.model;

import jakarta.persistence.*;
import jakarta.transaction.Transaction;
import lombok.ToString;

import java.util.List;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountId;
    private String accountName;
    private String accountType;
    private double accountBalance;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Transaction> accountTransactions; /*a list of transactions associated with the account*/


    public String getAccountName() {
        return this.accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public List<Transaction> getAccountTransactions() {
        return this.accountTransactions;
    }

    public void setAccountTransactions(List<Transaction> accountTransactions) {
        this.accountTransactions = accountTransactions;
    }
}
