package ru.otus;

import java.time.LocalDate;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return name.equals(client.name) && birthday.equals(client.birthday);
    }

    @Override
    public int hashCode() {
       // return Objects.hash(name, birthday);
        int result1 = name == null ? 0 : name.hashCode();
        int result2 = birthday == null ? 0 : birthday.hashCode();
        int result = 31 * result1 + result2;
        return result;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
