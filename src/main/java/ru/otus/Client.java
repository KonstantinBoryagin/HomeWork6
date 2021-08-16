package ru.otus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {

    private String name;
    private LocalDate birthDate;
    private List<Account> clientAccounts = new ArrayList<>();



    public Client(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public void setClientAccount(Account account) {
        clientAccounts.add(account);
    }

    public List<Account> getClientAccounts() {
        return clientAccounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return name.equals(client.name) && birthDate.equals(client.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthDate);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
