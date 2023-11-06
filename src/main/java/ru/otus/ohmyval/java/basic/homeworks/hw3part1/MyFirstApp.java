package ru.otus.ohmyval.java.basic.homeworks.hw3part1;

public class MyFirstApp {
    public static void main(String[] args) {
        greetings();
        checkSign(4, -8, -12);
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint(23, 13, false);
    }

    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }
    public static void checkSign(int a, int b, int c) {
        int result = a + b + c;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = 21;
        if (data <= 10) {
            System.out.println("Красный");
        } else {
            if (data > 10 && data <= 20) {
                System.out.println("Желтый");
            } else {
                if (data > 20) {
                    System.out.println("Зеленый");
                }
            }
        }
    }
    public static void compareNumbers() {
        int a = 36;
        int b = 36;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}
