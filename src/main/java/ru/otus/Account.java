package ru.otus;


public class Account {

    private Client client;
    private int money;

    public Account(Client client, int money) {
        this.client = client;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Счет: " + client +
                ", доступно средств - " + money;
    }
}
