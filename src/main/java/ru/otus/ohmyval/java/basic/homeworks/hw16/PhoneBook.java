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
        Set<String> newPhoneNumbers = new HashSet<>(); // Получается, что при записи каждой новой пары ключ-значение
        newPhoneNumbers.add(number); // я каждый раз создаю новый hashSet. Вопрос: в newPhoneNumbers каждый раз записывается новый hashSet?
        hashMap.put(completeName, newPhoneNumbers);  //Или старые данные переписываютя новыми? Судя по результам в консоли - создается новый.
        phoneNumbers.add(number); //А hashSet phoneNumbers нужен только, чтобы отслеживать наличие там всех номеров.
        System.out.println("Записали  " + completeName + " - " + number + " в телефонный справочник");
    }

    public void find(Map <String, Set<String>> hashMap, String completeName){
         System.out.println(hashMap.get(completeName));
    }

    public boolean containsPhoneNumber(Map <String, Set<String>> hashMap, String number){
//        Set<String> newPhoneNumbers = new HashSet<>();    // Этот весь закомментированный код ищет телефон через hashMap.
//        newPhoneNumbers.add(number);            // Но получается, что находит только те, которые "единичные" (ключ-одно значение)
//        for (Map.Entry<String, Set<String>> entry: hashMap.entrySet()){    //если у одного ключа несколько значений,
//           if (entry.getValue().equals(newPhoneNumbers)){   // то он не выводит ни одного из них.
//               return true;
//           }
//        }
//        return false;
        return phoneNumbers.contains(number);  // А эта одна строчка находит ВСЕ, что есть. Но насколько это корректно?
    }




}
