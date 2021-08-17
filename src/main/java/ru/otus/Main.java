package ru.otus;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager();
        Client client1 = manager.addClient("Ivanov Ivan", LocalDate.of(2015, 10, 3));
        Client client2 = manager.addClient("Lincoln Avram", LocalDate.of(1970, 12, 30));

       Account account1 = manager.addAccount(client1, 1111);
       Account account2 = manager.addAccount(client1, 2222);
       Account account3 = manager.addAccount(client2, 123);

        System.out.println(manager.findClientAccounts(client1));
        System.out.println(manager.findClientAccounts(client2));
        System.out.println(manager.findClient(account1));
//        System.out.println(client2.getClientAccounts());
    }
}
