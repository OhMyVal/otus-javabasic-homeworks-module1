package ru.otus.ohmyval.java.basic.homeworks.hw16;

import java.util.*;

public class PhoneBook {
    private Map<Person, Set<String>> hashMap = new HashMap<>();

    public PhoneBook() {
    }

    public Map<Person, Set<String>> getHashMap() {
        return hashMap;
    }

    public void add(Person person, String number) {
        if (!containsPhoneNumber(number)) {
            Set<String> phones;
            if (hashMap.containsKey(person)) {
                phones = hashMap.get(person);
                System.out.println("Добавили к " + person + " еще один номер " + number);
            } else {
                phones = new HashSet<>();
                System.out.println("Записали  " + person + " - " + number + " в телефонный справочник");
            }
            phones.add(number);
            hashMap.put(person, phones);
        } else {
            System.out.println("Номер " + number + " уже есть в телефонном справочнике");
        }
    }
//    public void add(Person person, String number) {  // предыдущая версия метода (моя)
//        if (containsPhoneNumber(number)) {
//            System.out.println("Номер " + number + " уже есть в телефонном справочнике");
//            return;
//        }
//        if (!hashMap.containsKey(person)) {
//            hashMap.put(person, Collections.singleton(number));
//            System.out.println("Записали  " + person + " - " + number + " в телефонный справочник");
//            return;
//        }
//        Set<String> phoneNumbers = new HashSet<>();
//        phoneNumbers.addAll(hashMap.get(person));
//        phoneNumbers.add(number);
//        hashMap.put(person, phoneNumbers);
//        System.out.println("Добавили к " + person + " еще один номер " + number);
//    }


    public void find(Person person) {
        System.out.println(hashMap.get(person));
    }

    public boolean containsPhoneNumber(String number) {
        for (Set<String> value : hashMap.values()) {
            if (value.contains(number)) {
                return true;
            }
        }
        return false;
    }
}
