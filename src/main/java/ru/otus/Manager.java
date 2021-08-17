package ru.otus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Manager {
    private HashMap<Client, List<Account>> clientBase = new HashMap<>();
    private HashMap<Account, Client> accountBase = new HashMap<>();
    private List<Account> clientAccounts;

    /**
     * Создает клиента
     * @param name - имя клиента
     * @param birthdate - дата рождения
     * @return клиента
     */
    public Client addClient(String name, LocalDate birthdate) {
        Client client = new Client(name, birthdate);
        clientAccounts = new ArrayList<>();
        clientBase.put(client, clientAccounts);
        return client;
    }

    /**
     * Создает счет для клиента
     * @param client - клиент {@link Client#Client(String, LocalDate)}
     * @param money - количество средств на счету
     * @return - счет
     */
    public Account addAccount(Client client, int money) {
        Account account = new Account(client, money);
        accountBase.put(account, client);
        setClintAccounts(client, account);
        return account;
    }

    private void setClintAccounts(Client client, Account account) {
        List<Account> clientAccounts = clientBase.get(client);
        clientAccounts.add(account);
    }

    public List<Account> findClientAccounts(Client client) {
        System.out.println("Для клиента " + client.getName() + " найдены счета:");
        return clientBase.get(client);
    }

    public Client findClient (Account account) {
        return accountBase.get(account);
    }

}
