package ru.otus;

import java.util.HashMap;

public class Account {

    private Client client;
    private int money;
    private HashMap<Account, Client> accounts = new HashMap<>();

    public Account(Client client, int money) {
        this.client = client;
        this.money = money;
        client.setClientAccount(this);
        accounts.put(this, client);
    }

    public Client getClient() {
        return client;
    }

    public void addAccount(Account account, Client client) {
        accounts.put(account, client);
    }

    public HashMap<Account, Client> getAccounts() {
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
                '}';
    }
}
