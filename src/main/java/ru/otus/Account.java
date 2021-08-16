package ru.otus;

import java.util.Arrays;
import java.util.HashMap;

public class Account {

    private Client client;
    private int money;
    private HashMap<Integer, Account> accounts = new HashMap<>();
    static int number = 0;

    public Account(Client client, int money) {
        this.client = client;
        this.money = money;
        accounts.put(number, this);
        number++;
    }

    public HashMap<Integer, Account> getAccounts() {
        return accounts;
    }

    public void print(HashMap<Integer, Account> accounts){
        System.out.println(Arrays.asList(accounts));
    }
//    @Override
//    public String toString() {
//        return "Account{" +
//                "client=" + client +
//                ", money=" + money +
//                ", accounts=" + accounts +
//                '}';
//    }
}
