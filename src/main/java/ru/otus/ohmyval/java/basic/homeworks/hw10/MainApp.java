package ru.otus.ohmyval.java.basic.homeworks.hw10;

public class MainApp {
    public static void main(String[] args) {
        User[] users = {
                new User("Михайлов", "Михаил", "Михайлович", 1955, "michel@mail"),
                new User("Алексеев", "Алексей", "Алексеевич", 1985, "alex@mail"),
                new User("Володин", "Владимир", "Владимирович", 1999, "vova@mail"),
                new User("Анатольев", "Анатолий", "Анатольевич", 2006, "tolya@mail"),
                new User("Сергеев", "Сергей", "Сергеевич", 1967, "serj@mail"),
                new User("Иванов", "Иван", "Иванович", 1978, "ivan@mail"),
                new User("Егоров", "Егор", "Егорович", 1946, "egor@mail"),
                new User("Андреев", "Андрей", "Андреевич", 1983, "andru@mail"),
                new User("Дмитриев", "Дмитрий", "Дмитриевич", 1995, "dima@mail"),
                new User("Максимов", "Максим", "Максимович", 2000, "max@mail"),
                };
        int presentYear = 2023;
        for (int i = 0; i < users.length; i++) {
            if (presentYear - users[i].getYearOfBirth() > 40){
                users[i].printInfo();
                System.out.println();
            }
        }
    }
}
