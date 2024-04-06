package ru.otus.ohmyval.java.basic.homeworks.hw26;

public class Orange extends Fruit{
    static double orangeWeight = 0.3;
    static String name = "Апельсин";

    public Orange() {
    }

    public static double getOrangeWeight() {
        return orangeWeight;
    }

    public static void setOrangeWeight(double orangeWeight) {
        Orange.orangeWeight = orangeWeight;
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
        return orangeWeight;
    }

}
