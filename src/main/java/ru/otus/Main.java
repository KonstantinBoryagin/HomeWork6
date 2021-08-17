package ru.otus;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("Ivanov Ivan", LocalDate.of(2015, 10, 3));
        Client client2 = new Client("Lincoln Avram", LocalDate.of(1970, 12, 30));

        Account account1 = new Account(client1, 354);
        Account account2 = new Account(client1, 777);
        Account account3 = new Account(client2, 8888);
        Account account4 = new Account(client2, 999);

        System.out.println(client1.getClientAccounts());
        System.out.println(client2.getClientAccounts());
    }
}
