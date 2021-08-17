package ru.otus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Client {

    private String name;
    private LocalDate birthday;
    private List<Account> clientAccounts;

    public Client(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
        clientAccounts = new ArrayList<>();
    }

    public void setClintAccounts(Account account) {
        clientAccounts.add(account);
    }

    public List<Account> getClientAccounts() {
        return clientAccounts;
    }


}
