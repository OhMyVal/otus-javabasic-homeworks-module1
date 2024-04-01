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
    public Person findById(Long id){
        return person;
    }
    public void add(Person person){

    }
    public boolean isManager(Person person){
        return false;
    }
    public boolean isEmployee(Long id){
        return false;
    }
}
