package ru.otus.ohmyval.java.basic.homeworks.hw26;

public class Orange extends Fruit {
    static double weight = 0.3;
    static final String name = "Апельсин";

    public Orange() {
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
