package ru.otus;


import java.util.Objects;

public class Account {

    private Client client;
    private int money;

    public Account(Client client, int money) {
        this.client = client;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Счет: доступно средств - " + money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return money == account.money && client.equals(account.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(client);
    }
}
