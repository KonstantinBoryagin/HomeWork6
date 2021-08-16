package ru.otus;

import java.time.LocalDate;
import java.util.ArrayList;

public class ListOfClients {

    private ArrayList<Client> clients = new ArrayList<>();

    public void addClient(Client client) {
        clients.add(client);
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    @Override
    public String toString() {
        return "ListOfClients{" +
                "clients=" + clients +
                '}';
    }


}
