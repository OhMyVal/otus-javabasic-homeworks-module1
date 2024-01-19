package ru.otus.ohmyval.java.basic.homeworks.hw15;

import java.util.ArrayList;

public class Employee {
    private String name;
    private int age;
    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
       return "Employee " + name + ", " + age;
    }
    public static ArrayList printName(ArrayList<Employee> list){
        ArrayList<String> nameList = new ArrayList<>(list.size());
        for (int i = 0; i < list.size(); i++) {
            nameList.add(i, list.get(i).name);
        }
        return nameList;
    }
    public static ArrayList ageSelection(ArrayList<Employee> list, int minAge){
        ArrayList<Employee> ageSelectionList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).age >= minAge){
                ageSelectionList.add(list.get(i));
            }
        }
        return ageSelectionList;
    }

}
