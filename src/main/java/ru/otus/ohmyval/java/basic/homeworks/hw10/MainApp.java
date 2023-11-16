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
        Box box = new Box(34, 25, 14, "green", false, false, "Растение");
        Box box2 = new Box (67, 42,12, "red", true, false, "Яблоко");
        box.info();
        box2.info();

        System.out.println("Размеры: " + box.getLength() + " * "+ box.getWidth() + " * "+ box.getHeight());
        System.out.println("Размеры: " + box2.getLength() + " * "+ box2.getWidth() + " * "+ box2.getHeight());
        System.out.println();

        box.setColor("yellow");
        box.info();

        box2.setColor("blue");
        box2.info();

        System.out.println("Цвет: " + box.getColor());
        System.out.println("Цвет: " + box2.getColor());
        System.out.println();

        box.putIn();
        box.info();

        box2.putOut();
        box2.info();

        box.setOpened(true);
        box.info();

        box2.setOpened(false);
        box2.info();

    }
}
