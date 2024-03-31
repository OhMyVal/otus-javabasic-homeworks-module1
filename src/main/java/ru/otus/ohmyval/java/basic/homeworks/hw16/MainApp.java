package ru.otus.ohmyval.java.basic.homeworks.hw16;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainApp {
    public static void main(String[] args) {

        Map<String, Set<String>> phoneBookMap = new HashMap<>();
        PhoneBook phoneBook = new PhoneBook(phoneBookMap);

        phoneBook.add("Ivanov Ivan", "100-400");
        phoneBook.add("Ivanov Ivan", "100-500");
        phoneBook.add("Ivanov Ivan", "100-400");
        phoneBook.add("Petrov Petr", "100-600");
        phoneBook.add("Egorov Egor", "100-700");
        phoneBook.add("Ivanov Sergey", "100-800");
        phoneBook.add("Petrov Konstantin", "100-500");
        phoneBook.add("Egorov Konstantin", "100-600");
        System.out.println(phoneBookMap.entrySet());
        System.out.println(phoneBookMap.values());
        System.out.println(phoneBookMap.size());
        System.out.println(phoneBook.containsPhoneNumber("100-400"));
        phoneBook.find("Ivanov Ivan");
    }
}
