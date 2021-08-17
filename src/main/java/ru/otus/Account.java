package ru.otus;


public class Account {

    private Client client;
    private int money;

    public Account(Client client, int money) {
        this.client = client;
        this.money = money;
        client.setClintAccounts(this);
    }

    @Override
    public String toString() {
        return "Account{" +
                "client=" + client +
                ", money=" + money +
                '}';
    }
}
