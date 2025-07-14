package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BankService {

    List<Client> clients = new ArrayList<>();

    Set<Account> accounts = new HashSet<>();


    Account account1 = new Account("52648", BigDecimal.valueOf(0), clients.getFirst());
   Account account2 = new Account();


    public String createAccount(Client client) {
        clients.add(client);
        accounts.add(account1);
       account1.setClient(client);
       return account1.getAccountNumber();
    }

    // transfer money from client1 to client2
    public void transferMoney(Client client1, Client client2, BigDecimal transferAmount) {
        account1.setClient(client1);
        account2.setClient(client2);
        account1.withdraw(transferAmount);
        account2.deposit(transferAmount);
    }


}
