package org.example;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println();




        Account account1 = new Account();
        Account account2 = new Account();

        account1.deposit(BigDecimal.valueOf(90));
        System.out.println(account1.balance);

        account1.deposit(BigDecimal.valueOf(90));
        System.out.println(account1.balance);

        account2.deposit(BigDecimal.valueOf(90));
        System.out.println(account2.balance);

        account2.deposit(BigDecimal.valueOf(90));
        System.out.println(account2.balance);

    }
}