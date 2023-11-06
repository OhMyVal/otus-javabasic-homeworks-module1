package ru.otus.ohmyval.java.basic.homeworks.hw3part2;

import java.util.Scanner;

public class MySecondApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5");
        int n = scanner.nextInt();
        if (n == 1) {
            greetings();
        } else {
            if (n == 2) {
                checkSign((int) ((Math.random() - Math.random()) * 50), (int) ((Math.random() - Math.random()) * 50), (int) ((Math.random() - Math.random()) * 50));
            } else {
                if (n == 3) {
                    selectColor();
                } else {
                    if (n == 4) {
                        compareNumbers();
                    } else {
                        if (n == 5) {
                            addOrSubtractAndPrint((int) (Math.random() * 100), (int) (Math.random() * 100), Math.random() < 0.5);
                        } else  {
                            System.out.println("Введено некорректное число");
                        }
                    }
                }
            }
        }
    }

    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    public static void checkSign(int a, int b, int c) {
        System.out.println("a = " + a + " b = " + b + " c = " + c);
        int result = a + b + c;
        System.out.println("result = " + result);
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = (int) (Math.random() * 100);
        System.out.println(data);
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
        int a = (int) (Math.random() * 1000);
        int b = (int) (Math.random() * 1000);
        System.out.println("a = " + a + " b = " + b);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        System.out.println("initValue = " + initValue + " delta = " + delta + " increment = " + increment);
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}
