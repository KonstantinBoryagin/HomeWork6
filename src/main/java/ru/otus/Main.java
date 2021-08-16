package ru.otus;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("Ivanov Ivan", LocalDate.of(2015, 10, 3));
        Account account1 = new Account(client1, 354);
        Account account2 = new Account(client1, 352);


        System.out.println(client1.getClientAccounts());
       // System.out.println(account1.getClient());

    }
}
