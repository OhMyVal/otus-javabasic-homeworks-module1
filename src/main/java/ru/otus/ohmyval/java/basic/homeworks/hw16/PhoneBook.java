package ru.otus.ohmyval.java.basic.homeworks.hw16;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, Set<String>> hashMap;
    public PhoneBook(Map<String, Set<String>> hashMap) {
        this.hashMap = hashMap;
    }
    public Map<String, Set<String>> getHashMap() {
        return hashMap;
    }

    public void add(String completeName, String number) {
        if(containsPhoneNumber(number)){
            System.out.println("Номер " + number + " уже есть в телефонном справочнике");
            return;
        }
        if (!hashMap.containsKey(completeName)) {
            hashMap.put(completeName, Collections.singleton(number));
            System.out.println("Записали  " + completeName + " - " + number + " в телефонный справочник");
            return;
        }
        Set<String> phoneNumbers = new HashSet<>();
        phoneNumbers.addAll(hashMap.get(completeName));
        phoneNumbers.add(number);
        hashMap.put(completeName, phoneNumbers);
        System.out.println("Добавили к " + completeName + " еще один номер " + number);
    }

    public void find(String completeName) {
        System.out.println(hashMap.get(completeName));
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
