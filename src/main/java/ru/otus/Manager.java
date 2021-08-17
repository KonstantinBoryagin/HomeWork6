package ru.otus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Manager {
    private static HashMap<Client, List<Account>> clients = new HashMap<>();
    //private static List<Account> clientAccounts = new ArrayList<>();
    private static HashMap<Account, Client> accounts = new HashMap<>();


    public Client createClient(String name, LocalDate birthdayDate) {
        Client client = new Client(name, birthdayDate);
        addClientToClients(client, client.getClientAccounts());
        return client;
    }
    
    public List<Account> findAccountsForClient(Client client) {
        return clients.get(client);
    }

    public void createAccount(Client client, int money) {
        Account account = new Account(client, money);
        client.setClientAccount(account);
        addAccount(account, client);
    }

    public void addClientToClients(Client client, List<Account> clientAccounts) {
        clients.put(client, clientAccounts);
    }


    public void addAccount(Account account, Client client) {
        accounts.put(account, client);
    }

    public HashMap<Account, Client> getAccounts() {
        return accounts;
    }

    public static HashMap<Client, List<Account>> getClients() {
        return clients;
    }

}
