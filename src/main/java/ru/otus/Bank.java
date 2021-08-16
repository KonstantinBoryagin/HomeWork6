package ru.otus;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;

public class Bank {
    public static void main(String[] args) {


        Client client1 = new Client("Ivanov Ivan", LocalDate.of(2015, 10, 3));
        Client client2 = new Client("Lincoln Avram", LocalDate.of(1970, 12, 30));
        Client client3 = new Client("Gorbachev Michail", LocalDate.of(1954, 1, 28));
        Client client4 = new Client("Barak Obama", LocalDate.of(1988, 5, 4));
        Client client5 = new Client("Laden Osama", LocalDate.of(1973, 12, 13));

        Account account1 = new Account(client1, 354);
        Account account2 = new Account(client2, 45234);
        Account account3 = new Account(client3, 243);
        Account account4 = new Account(client4, 35);
        Account account5 = new Account(client5, 2345);
        Account account6 = new Account(client1, 4567);
        Account account7 = new Account(client2, 3456);
        Account account8 = new Account(client3, 3444);
        Account account9 = new Account(client4, 1_000_000);
        Account account10 = new Account(client5, 352156);
        Account account11 = new Account(client1, 3587873);
        Account account12 = new Account(client2, 355453);
        Account account13 = new Account(client3, 355451);

        account13.print(account13.getAccounts());


        ListOfClients clientsList = new ListOfClients();
        ListOfAccounts accountsList = new ListOfAccounts();





//        clientsList.addClient(client1);
//        clientsList.addClient(client2);
//        clientsList.addClient(client3);
//        clientsList.addClient(client4);
//        clientsList.addClient(client5);
//
//        System.out.println(clientsList);


    }

}
