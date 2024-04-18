package ru.otus.ohmyval.java.basic.homeworks.hw16;

public class MainApp {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add(new Person("Ivanov", "Ivan", "Ivanovich"), "100-400");
        phoneBook.add(new Person("Ivanov", "Ivan", "Ivanovich"), "100-500");
        phoneBook.add(new Person("Ivanov", "Ivan", "Ivanovich"), "100-400");
        phoneBook.add(new Person("Petrov", "Petr", "Petrovich"), "100-600");
        phoneBook.add(new Person("Egorov", "Egor", "Egorovich"), "100-700");
        phoneBook.add(new Person("Ivanov", "Sergey", "Sergeevich"), "100-800");
        phoneBook.add(new Person("Petrov", "Konstantin", "Ivanovich"), "100-900");
        phoneBook.add(new Person("Egorov", "Konstantin", "Ivanovich"), "100-300");
        phoneBook.add(new Person("Petrov", "Alex", "Ivanovich"), "100-700");

        System.out.println(phoneBook.getHashMap().entrySet());
        System.out.println(phoneBook.getHashMap().values());
        System.out.println(phoneBook.getHashMap().size());

        phoneBook.find(new Person("Ivanov", "Ivan", "Ivanovich"));
        System.out.println(phoneBook.containsPhoneNumber("100-400"));

    }
}
