package ru.otus.ohmyval.java.basic.homeworks.hw17;

import java.util.List;

public class PersonDataBase {
    List<Person> list;

    public PersonDataBase(List<Person> list) {
        this.list = list;
    }

    public List<Person> getList() {
        return list;
    }
}
