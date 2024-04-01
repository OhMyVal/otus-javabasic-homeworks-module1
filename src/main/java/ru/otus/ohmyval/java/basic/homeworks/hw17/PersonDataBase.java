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

//    Map<List<Person>,List<Person>> map = new HashMap<>;
//    Map<Person,Person> map = new HashMap<>;

    Set<Position> managers = Set.of(Position.MANAGER, Position.DIRECTOR,
            Position.BRANCH_DIRECTOR, Position.SENIOR_MANAGER);

    public String findById(Long id) {
        Map<Long, String> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i).id, list.get(i).name);
        }
        return map.get(id);
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
        Map<Long, Position> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i).id, list.get(i).position);
        }
        if (!managers.contains(map.get(id))) {
            return true;
        }
        return false;
    }
}
