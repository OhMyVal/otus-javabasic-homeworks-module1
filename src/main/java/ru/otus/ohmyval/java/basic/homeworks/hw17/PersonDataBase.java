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

    public Person findById(Long id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).id.equals(id)) {
                return list.get(i);
            }
        }
        return null;
    }

    public void add(Person person) {
        list.add(person);
    }

    public boolean isManager(Person person) {
        if (managers.contains(person.getPosition())) {
            return true;
        }
        return false;
    }

    public boolean isEmployee(Long id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).id.equals(id) && !managers.contains(list.get(i).position)) {
                return true;
            }
        }
        return false;
    }
}
