package ru.otus.ohmyval.java.basic.homeworks.hw16;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainApp {
    public static void main(String[] args) {

//       Map<String, Set<String>> phoneBookMap = new HashMap<>();
//       Set<String> phoneNumbers = new HashSet<>();
//        phoneNumbers.add("34563");
//        phoneNumbers.add("23895");
//        phoneNumbers.add("98645");
//        phoneNumbers.add("28643");
//        phoneNumbers.add("65119");
//        phoneNumbers.add("55744");
//        phoneNumbers.add("98846");
//        phoneNumbers.add("30913");
        Map<String, String> phoneBookMap = new HashMap<>();
        phoneBookMap.put("Ivanov", "36984");
        phoneBookMap.put("Petrov", "88762");
        phoneBookMap.put("Sidorov", "65498");
        phoneBookMap.put("Egorov", "25987");

        System.out.println(phoneBookMap.entrySet());
        PhoneBook.add(phoneBookMap, "Alekseev", "90217");
        System.out.println(phoneBookMap.entrySet());
        PhoneBook.find(phoneBookMap,"Sidorov");
        System.out.println(PhoneBook.containsPhoneNumber(phoneBookMap,"77984"));


    }
}
