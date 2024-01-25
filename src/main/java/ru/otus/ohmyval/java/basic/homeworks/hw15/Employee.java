package ru.otus.ohmyval.java.basic.homeworks.hw15;


public class Employee {
    protected String name;
    protected int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee " + name + ", " + age;
    }
}

