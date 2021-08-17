package ru.otus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Client {

    private String name;
    private LocalDate birthday;

    public Client(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Клиент - '" + name + "\'";
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
