package ru.otus;

import java.util.Arrays;
import java.util.HashMap;

public class Account {

    private Client client;
    private int money;
    private HashMap<Integer, Account> accounts = new HashMap<>();
    private HashMap<Account, Client> accounts1 = new HashMap<>();
    static int number = 0;


    public Account(Client client, int money) {
        this.client = client;
        this.money = money;
    }

    public void addAccount(Account account) {
        accounts.put(number, account);
        number++;
    }

    public HashMap<Integer, Account> getAccounts() {
        return accounts;
    }

    public void print(HashMap<Integer, Account> accounts){
        for (Integer element: accounts.keySet()){
            String key = element.toString();
            String value = accounts.get(element).toString();
            System.out.println(key + " " + value);
        }

    }
    @Override
    public String toString() {
        return "Account{" +
                "client=" + client +
                ", money=" + money +
                ", accounts=" + accounts +
                '}';
    }
}
