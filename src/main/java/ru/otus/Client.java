package ru.otus;

import java.time.LocalDate;

public class Client {

    private String name;
    private LocalDate birthDate;

    public Client(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
}
