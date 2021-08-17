package ru.otus;

import java.util.HashMap;

public class Account {

    private Client client;
    private int money;


    Manager manager = new Manager();

    public Account(Client client, int money) {
        this.client = client;
        this.money = money;
//        manager.setClientAccount(this);
//        manager.addAccount(this, client);
    }

    public Client getClient() {
        return client;
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
        return "Счет " +
                "клиент - " + client +
                ", средства - " + money + " | \n";
    }
}
