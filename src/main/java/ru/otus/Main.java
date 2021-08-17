package ru.otus;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Client client1 = new Client("Ivanov Ivan", LocalDate.of(2015, 10, 3));
//        Account account1 = new Account(client1, 354);
//        Account account2 = new Account(client1, 352);


        Manager manager = new Manager();
        Client ivanov = manager.createClient("Ivanov Ivan", LocalDate.of(2015, 10, 3));
        Client lincoln = manager.createClient("Lincoln Avram", LocalDate.of(2015, 10, 3));
        manager.createAccount(ivanov, 354);
        manager.createAccount(ivanov, 45435);
        manager.createAccount(lincoln, 1111111);
        manager.createAccount(lincoln, 22222);
        System.out.println(manager.getClients());
       // System.out.println(ivanov.getClientAccounts());
//        System.out.println(manager.getClients());
       // System.out.println(account1.getClient());
        List<Account> list = manager.findAccountsForClient(ivanov);
        System.out.println(list);

    }
}
