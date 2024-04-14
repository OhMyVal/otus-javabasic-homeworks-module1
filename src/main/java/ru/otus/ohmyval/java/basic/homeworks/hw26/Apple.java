package ru.otus.ohmyval.java.basic.homeworks.hw26;

public class Apple extends Fruit {
    static double weight = 0.2;
    static final String name = "Яблоко";

    public Apple() {
    }

    public static double getWeight() {
        return weight;
    }

    public static String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public double getFruitWeight() {
        return weight;
    }


}
