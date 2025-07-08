package org.example;

import java.math.BigDecimal;

public class Account {
    private String accountNumber;

    BigDecimal balance = new BigDecimal("0");
    Client client;

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public void withdraw(BigDecimal amount) {
        balance = balance.subtract(amount);
    }

}
