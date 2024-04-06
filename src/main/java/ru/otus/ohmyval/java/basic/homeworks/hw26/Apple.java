package ru.otus.ohmyval.java.basic.homeworks.hw26;

public class Apple extends Fruit {
    static double appleWeight = 0.2;
    static final String name = "Яблоко";

    public Apple() {
    }

    public static double getAppleWeight() {
        return appleWeight;
    }
    public static void setAppleWeight(double appleWeight) {
        Apple.appleWeight = appleWeight;
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
        return appleWeight;
    }


}
