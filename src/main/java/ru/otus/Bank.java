package ru.otus;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;

public class Bank {



    public static void main(String[] args) {

        Manager manager = new Manager();

        Client ivanov = manager.addClient("Ivanov Ivan", LocalDate.of(2015, 10, 3));
        Client lincoln = manager.addClient("Lincoln Avram", LocalDate.of(1970, 12, 30));
        Client gorbachev = manager.addClient("Gorbachev Michail", LocalDate.of(1954, 1, 28));
        Client barak = manager.addClient("Barak Obama", LocalDate.of(1988, 5, 4));
        Client laden = manager.addClient("Laden Osama", LocalDate.of(1973, 12, 13));

        Account account1 = manager.addAccount(ivanov, 123);
        Account account2 = manager.addAccount(lincoln, 233323);
        Account account3 = manager.addAccount(gorbachev, 0);
        Account account4 = manager.addAccount(barak, 567);
        Account account5 = manager.addAccount(laden, 12568563);
        Account account6 = manager.addAccount(ivanov, 123879);
        Account account7 = manager.addAccount(gorbachev, 7890780);
        Account account8 = manager.addAccount(barak, 1267863);
        Account account9 = manager.addAccount(gorbachev, 126783);
        Account account10 = manager.addAccount(ivanov, 167867823);

        System.out.println(manager.findClientAccounts(gorbachev));
        System.out.println(manager.findClientAccounts(barak));

        System.out.println(manager.findClient(account4));
        System.out.println(manager.findClient(account10));



    }


}
