package ru.otus.ohmyval.java.basic.homeworks.hw16;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
//    private String surName;
//    private String number;
//    public PhoneBook(String surName, String number){
//        this.surName = surName;
//        this.number = number;
//    }
//    public String getSurName(){
//        return surName;
//    }
//    public String getNumber(){
//        return number;
//    }

    public static void add(Map<String, String> hashMap, String surName, String number){
        hashMap.put(surName, number);
    }

    public static void find(Map<String, String> hashMap, String surName){
        System.out.println(hashMap.get(surName));
    }

    public static boolean containsPhoneNumber(Map<String, String> hashMap, String number){
        if (hashMap.containsValue(number)){
        return true;
        }
        return false;
    }




}
