package ru.otus.ohmyval.java.basic.homeworks.hw17;

import java.util.*;

public class PersonDataBase {
    private List<Person> list;

    public PersonDataBase(List<Person> list) {
        this.list = list;
    }

    public List<Person> getList() {
        return list;
    }

    @Override
    public String toString() {
        return list.toString();
    }

    Set<Position> managers = Set.of(Position.MANAGER, Position.DIRECTOR,
            Position.BRANCH_DIRECTOR, Position.SENIOR_MANAGER);
    Map<Long, Person> personMap = new HashMap<>();

    public void fillPersonMap() {
        for (int i = 0; i < list.size(); i++) {
            personMap.put(list.get(i).id, list.get(i));
        }
    }

    public Person findById(Long id) {
        fillPersonMap();
        return personMap.get(id);
    }

    public void add(Person person) {
        list.add(person);
    }

    public boolean isManager(Person person) {
        return managers.contains(person.getPosition());
    }

    public boolean isEmployee(Long id) {
        fillPersonMap();
        return !managers.contains(personMap.get(id).position);
    }

}

