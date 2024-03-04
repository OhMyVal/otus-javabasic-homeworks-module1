package ru.otus.ohmyval.java.basic.homeworks.hw16;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, Set<String>> hashMap;

    public Map<String, Set<String>> getHashMap() {
        return hashMap;
    }

    public PhoneBook(Map<String, Set<String>> hashMap) {
        this.hashMap = hashMap;
    }

    public void add(String completeName, String number) {
        if (hashMap.containsValue(Collections.singleton(number))) {
            System.out.println("Номер " + number + " уже есть в телефонном справочнике");
            return;
        }
        if (!hashMap.containsKey(completeName)) {
            hashMap.put(completeName, Collections.singleton(number));
            System.out.println("Записали  " + completeName + " - " + number + " в телефонный справочник");
            return;
        }
        for (Map.Entry<String, Set<String>> entry : hashMap.entrySet()) {
            if (entry.getKey().equals(completeName)) {
                entry.setValue(Collections.singleton(number)); // эта строчка не добавляет еще одно значение, а переписывает его
            }
        }
        System.out.println("Добавили к " + completeName + " еще один номер " + number);
//            hashMap.get(completeName).add(number);
    }

    public void find(String completeName) {
        System.out.println(hashMap.get(completeName));
    }

    public boolean containsPhoneNumber(String number) {
        return hashMap.containsValue(Collections.singleton(number));
    }

}
