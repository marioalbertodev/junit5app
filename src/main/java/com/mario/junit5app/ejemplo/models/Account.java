package com.mario.junit5app.ejemplo.models;

import java.math.BigDecimal;

public class Account {
    private String client;
    private BigDecimal balance;

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
