package ru.otus;

import java.time.LocalDate;

public class Client {

    private String name;
    private LocalDate birthDate;

    public Client(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
