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
        if (managers.contains(person.getPosition())) {
            return true;
        }
        return false;
    }

    public boolean isEmployee(Long id) {
        fillPersonMap();
        if (!managers.contains(personMap.get(id).position)){
                return true;
            }
        return false;
        }

    }

