package ru.otus.ohmyval.java.basic.homeworks.hw16;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<Person, Set<String>> hashMap;

    public PhoneBook(Map<Person, Set<String>> hashMap) {
        this.hashMap = hashMap;
    }

    public Map<Person, Set<String>> getHashMap() {
        return hashMap;
    }

    public void add(Person person, String number) {
        if (containsPhoneNumber(number)) {
            System.out.println("Номер " + number + " уже есть в телефонном справочнике");
            return;
        }
        if (!hashMap.containsKey(person)) {
            hashMap.put(person, Collections.singleton(number));
            System.out.println("Записали  " + person + " - " + number + " в телефонный справочник");
            return;
        }
        Set<String> phoneNumbers = new HashSet<>();
        phoneNumbers.addAll(hashMap.get(person));
        phoneNumbers.add(number);
        hashMap.put(person, phoneNumbers);
        System.out.println("Добавили к " + person + " еще один номер " + number);
    }

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
