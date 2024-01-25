package ru.otus.ohmyval.java.basic.homeworks.hw15;

import java.util.ArrayList;
import java.util.List;

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
    public static List printName(List<Employee> list){
        List<String> nameList = new ArrayList<>(list.size());
        for (int i = 0; i < list.size(); i++) {
            nameList.add(i, list.get(i).name);
        }
        return nameList;
    }
    public static List ageSelection(List<Employee> list, int minAge){
        List<Employee> ageSelectionList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).age >= minAge){
                ageSelectionList.add(list.get(i));
            }
        }
        return ageSelectionList;
    }
    public static boolean middleAgeSelection(List<Employee> list, int minMiddleAge){
        int sumAge = 0;
        for (int i = 0; i < list.size(); i++) {
            sumAge += list.get(i).age;
            }
            int middleAge = sumAge/list.size();
            if (middleAge > minMiddleAge){
                return true;
            }
        return false;
    }
    public static Employee minAgeSearch(List<Employee> list){
        int minAge = list.get(0).age;
        int index = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).age < minAge){
                minAge = list.get(i).age;
                index = i;
                }
            }
        return list.get(index);
    }
    // В предыдущем методе minAgeSearch возвращается ссылка на сотрудника минимального возраста.
    // Но если их несколько, то выводится только один такой сотрудник. Это происходит из-за того, что переписывается index.
    // Я не поняла, можно ли вернуть ссылки не по индексу, а по наличию у объектов поля, удовлетворяющего условию.
    // Поэтому я создала еще один похожий метод newMinAgeSearch. Он может быть void и печатать ссылки
    // на сотрудников, либо создает новый список и возвращает его с сотрудниками минимального возраста.
    public static void newMinAgeSearch(List<Employee> list){ // вместо void - List
//        List<Employee> minAgeSearchList = new ArrayList<>();
        int minAge = list.get(0).age;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).age < minAge){
                minAge = list.get(i).age;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).age == minAge){
                System.out.println(list.get(i));
//                minAgeSearchList.add(list.get(i));
            }
        }
//        return minAgeSearchList;
    }

}

