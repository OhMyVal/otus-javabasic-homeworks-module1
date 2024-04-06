package ru.otus.ohmyval.java.basic.homeworks.hw26;

public class Apple extends Fruit {
    static double appleWeight = 0.2;
    static String name;


    public Apple() {
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Apple.name = name;
    }

//    public static double getAppleWeight() {
//        return appleWeight;
//    }

    @Override
    public double getFruitWeight() {
        return appleWeight;
    }

    public static void setAppleWeight(double appleWeight) {
        Apple.appleWeight = appleWeight;
    }

}
