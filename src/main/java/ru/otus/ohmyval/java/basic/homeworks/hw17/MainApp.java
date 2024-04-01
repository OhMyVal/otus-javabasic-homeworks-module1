package ru.otus.ohmyval.java.basic.homeworks.hw17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainApp {
    public static void main(String[] args) {
        List<Person> listPerson = new ArrayList<>(Arrays.asList(
                new Person("Alex", Position.MANAGER, 12345L),
                new Person("Max", Position.DIRECTOR, 23456L),
                new Person("Egor", Position.DRIVER, 34567L),
                new Person("Tom", Position.ENGINEER, 45678L),
                new Person("Anton", Position.SENIOR_MANAGER, 56789L),
                new Person("Boris", Position.DEVELOPER, 67890L),
                new Person("Dima", Position.QA, 78901L),
                new Person("Sergey", Position.JANITOR, 89012L),
                new Person("Afonya", Position.PLUMBER, 90123L),
                new Person("Slava", Position.BRANCH_DIRECTOR, 98765L),
                new Person("Andrey", Position.JUNIOR_DEVELOPER, 87654L)));
        PersonDataBase personDataBase = new PersonDataBase(listPerson);

        System.out.println(personDataBase);
        System.out.println(personDataBase.findById(34567L));
        System.out.println(personDataBase.findById(3456L));
        personDataBase.add(new Person("Nik", Position.JUNIOR_DEVELOPER, 76543L));
        System.out.println(personDataBase);
        System.out.println("isManager = " + personDataBase.isManager(new Person("Alex", Position.MANAGER, 12345L)));
        System.out.println("isEmployee = " + personDataBase.isEmployee(34567L));
        System.out.println("isEmployee = " + personDataBase.isEmployee(56789L));
    }
}
