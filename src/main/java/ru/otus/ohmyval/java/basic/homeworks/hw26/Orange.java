package ru.otus.ohmyval.java.basic.homeworks.hw26;

public class Orange extends Fruit{
    static double orangeWeight = 0.3;
    static String name;


    public Orange() {
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Orange.name = name;
    }

    @Override
    public double getFruitWeight() {
        return orangeWeight;
    }
    //    public static double getOrangeWeight() {
//        return orangeWeight;
//    }

    public static void setOrangeWeight(double orangeWeight) {
        Orange.orangeWeight = orangeWeight;
    }
}
