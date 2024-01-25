package ru.otus.ohmyval.java.basic.homeworks.hw16;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
        private Map hashMap = new HashMap();
    public Map getHashMap(){
        return hashMap;
    }
    public PhoneBook(Map hashMap){
        this.hashMap = hashMap;
    }
    Set<String> phoneNumbers = new HashSet<>();

    public void add(Map <String, Set<String>> hashMap, String completeName, String number){
        if (phoneNumbers.contains(number)) {
            System.out.println("Номер " + number + " уже есть в телефонном справочнике");
            return;
            }
        if (hashMap.containsKey(completeName)){
            hashMap.get(completeName).add(number);
            phoneNumbers.add(number);
            System.out.println("Добавили к " + completeName + " еще один номер " + number);
            return;
            }
        Set<String> newPhoneNumbers = new HashSet<>(); //
        newPhoneNumbers.add(number);
        hashMap.put(completeName, newPhoneNumbers);  //
        phoneNumbers.add(number);
        System.out.println("Записали  " + completeName + " - " + number + " в телефонный справочник");
    }

    public void find(Map hashMap, String completeName){
        System.out.println(hashMap.get(completeName));
    }

    public boolean containsPhoneNumber(Map <String, Set<String>> hashMap, String number){
//        Set<String> newPhoneNumbers = new HashSet<>();
//        newPhoneNumbers.add(number);
//        for (Map.Entry<String, Set<String>> entry: hashMap.entrySet()){
//           if (entry.getValue().equals(newPhoneNumbers)){
//               return true;
//           }
//        }
//        return false;
        return phoneNumbers.contains(number);
    }




}
