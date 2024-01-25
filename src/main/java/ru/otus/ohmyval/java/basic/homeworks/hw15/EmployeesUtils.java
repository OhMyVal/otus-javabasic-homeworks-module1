package ru.otus.ohmyval.java.basic.homeworks.hw15;

import java.util.ArrayList;
import java.util.List;

public class EmployeesUtils {

    public static List<String> getEmployeeName(List<Employee> list) {
        List<String> nameList = new ArrayList<>(list.size());
        for (int i = 0; i < list.size(); i++) {
            nameList.add(i, list.get(i).name);
        }
        return nameList;
    }

    public static List<Employee> ageSelection(List<Employee> list, int minAge) {
        List<Employee> ageSelectionList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).age >= minAge) {
                ageSelectionList.add(list.get(i));
            }
        }
        return ageSelectionList;
    }

    public static boolean middleAgeSelection(List<Employee> list, int minMiddleAge) {
        int sumAge = 0;
        for (int i = 0; i < list.size(); i++) {
            sumAge += list.get(i).age;
        }
        int middleAge = sumAge / list.size();
        if (middleAge > minMiddleAge) {
            return true;
        }
        return false;
    }

    public static Employee minAgeSearch(List<Employee> list) { // в этом методе возвращается ссылка только на одного сотрудника минимального возраста
        int minAge = list.get(0).age;
        int index = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).age < minAge) {
                minAge = list.get(i).age;
                index = i;
            }
        }
        return list.get(index);
    }

    public static List<Employee> newMinAgeSearch(List<Employee> list) { // метод создает новый список и возвращает его со всеми сотрудниками минимального возраста
        List<Employee> minAgeSearchList = new ArrayList<>();
        int minAge = list.get(0).age;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).age < minAge) {
                minAge = list.get(i).age;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).age == minAge) {
                minAgeSearchList.add(list.get(i));
            }
        }
        return minAgeSearchList;
    }
}
