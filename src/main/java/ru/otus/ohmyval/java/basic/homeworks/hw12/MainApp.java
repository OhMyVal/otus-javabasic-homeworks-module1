package ru.otus.ohmyval.java.basic.homeworks.hw12;

public class MainApp {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Дымка", 10, false),
                new Cat("Рыжик", 6, false),
                new Cat("Пиратка", 15, false),
                new Cat("Кузя", 10, false),
                new Cat("Барсик", 7, false),
        };
        Plate plate = new Plate(26, 26);
        plate.addFood();
        for (int i = 0; i < cats.length; i++) {
            cats[i].info();
            cats[i].eat(plate);
            cats[i].info();
        }
       plate.addFood();
    }
}
