package ru.otus.ohmyval.java.basic.homeworks.hw11;

public class MainApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Барбос", 100, 10, 1, 7, 2);
        Horse horse = new Horse("Молния", 200, 5, 1, 4, 4);
        Cat cat = new Cat("Кузя", 50, 7, 1);

        dog.info();
        horse.info();
        cat.info();

        System.out.println(cat.swim(3));
        System.out.println();
        System.out.println(cat.run(50));
        System.out.println();
        System.out.println(cat.run(1));
        System.out.println();

        System.out.println(dog.run(50));
        System.out.println();
        System.out.println(dog.swim(20));
        System.out.println();
        dog.info();
        System.out.println(dog.swim(15));
        System.out.println();

        System.out.println(horse.swim(60));
        System.out.println();
        System.out.println(horse.swim(10));
        System.out.println();
        System.out.println(horse.run(100));
        System.out.println();
        System.out.println(horse.run(10));

    }
}

