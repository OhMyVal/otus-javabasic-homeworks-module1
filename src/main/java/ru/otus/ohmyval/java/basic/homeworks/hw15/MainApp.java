package ru.otus.ohmyval.java.basic.homeworks.hw15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainApp {
    public static void main(String[] args) {
        System.out.println(serialList(5, 11));
        System.out.println(sumAndPrint(new ArrayList<>(Arrays.asList(1, 3, 5, -7, 10, 4, 2, 0, 13))));
        fillList(7, new ArrayList<>(Arrays.asList(1, 3, 5, -7, 10, 4, 2, 0, 13)));
        increaseList(5, new ArrayList<>(Arrays.asList(1, 3, 5, -7, 10, 4, 2, 0, 13)));

//  Вторая часть ДЗ

        List<Employee> employeeList = new ArrayList<>(Arrays.asList(
                new Employee("Boris", 32),
                new Employee("Egor", 23),
                new Employee("Ivan", 54),
                new Employee("Denis", 23),
                new Employee("Alex", 38)));

        System.out.println(employeeList);
        System.out.println(EmployeesUtils.getEmployeeName(employeeList));
        System.out.println(EmployeesUtils.ageSelection(employeeList, 35));
        System.out.println(EmployeesUtils.middleAgeSelection(employeeList, 37));
        System.out.println(EmployeesUtils.minAgeSearch(employeeList));
        System.out.println();
        System.out.println(EmployeesUtils.newMinAgeSearch(employeeList));
    }


    public static List<Integer> serialList(int min, int max) {
        List<Integer> serialNumberList = new ArrayList<>();
        for (int i = 0; i <= max - min; i++) {
            serialNumberList.add(min + i);
        }
        return serialNumberList;
    }

    public static int sumAndPrint(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 5) {
                sum += list.get(i);
            }
        }
        return sum;
    }

    public static void fillList(int a, List<Integer> list) {
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, a);
        }
        System.out.println(list);
        System.out.println();
    }

    public static void increaseList(int a, List<Integer> list) {
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + a);
        }
        System.out.println(list);
        System.out.println();
    }

}
