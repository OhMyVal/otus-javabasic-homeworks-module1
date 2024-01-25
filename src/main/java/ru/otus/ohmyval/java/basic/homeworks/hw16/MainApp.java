package ru.otus.ohmyval.java.basic.homeworks.hw16;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainApp {
    public static void main(String[] args) {

        Map<String, Set<String>> phoneBookMap = new HashMap<>();
        PhoneBook phoneBook = new PhoneBook(phoneBookMap);

        phoneBook.add(phoneBookMap,"Ivanov Ivan", "100-400");
        phoneBook.add(phoneBookMap,"Ivanov Ivan", "100-500");
        phoneBook.add(phoneBookMap,"Ivanov Ivan", "100-500");
        phoneBook.add(phoneBookMap,"Petrov Petr", "100-600");
        phoneBook.add(phoneBookMap,"Egorov Egor", "100-700");
        phoneBook.add(phoneBookMap,"Ivanov Sergey", "100-800");
        phoneBook.add(phoneBookMap,"Petrov Konstantin", "100-900");
        System.out.println(phoneBookMap.entrySet());
        System.out.println(phoneBookMap.values());
        System.out.println(phoneBook.containsPhoneNumber(phoneBookMap, "100-100"));

//        phoneBook.containsPhoneNumber()

//       Map<String, Set<String>> phoneBookMap2 = new HashMap<>();
//       Set<String> phoneNumbers = new HashSet<>();
//        phoneNumbers.add("34563");
//        phoneNumbers.add("23895");
////        phoneNumbers.add("98645");
//        phoneNumbers.add("28643");
//        phoneNumbers.add("65119");
//        phoneNumbers.add("55744");
//        phoneNumbers.add("98846");
//        phoneNumbers.add("30913");
//        phoneBookMap.put("Ivanov", phoneNumbers);
//        phoneNumbers = new HashSet<>();
//        phoneNumbers.add("98846");
//        phoneBookMap.put("Petrov", phoneNumbers);
//        System.out.println(phoneBookMap.entrySet());
//        phoneNumbers = new HashSet<>();
//        phoneNumbers.add("28643");
//        phoneBookMap.get("Ivanov").add("28643");
//        System.out.println(phoneBookMap.entrySet());
//        System.out.println(phoneNumbers);
//        Map<String, String> phoneBookMap = new HashMap<>();
//        phoneBookMap.put("Ivanov", "36984");
//        phoneBookMap.put("Petrov", "88762");
//        phoneBookMap.put("Sidorov", "65498");
//        phoneBookMap.put("Egorov", "25987");
//
//        System.out.println(phoneBookMap.entrySet());
//        PhoneBook.add(phoneBookMap, "Alekseev", "90217");
//        System.out.println(phoneBookMap.entrySet());
//        PhoneBook.find(phoneBookMap,"Sidorov");
//        System.out.println(PhoneBook.containsPhoneNumber(phoneBookMap,"77984"));


    }
}
