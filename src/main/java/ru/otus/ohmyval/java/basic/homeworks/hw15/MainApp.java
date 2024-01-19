package ru.otus.ohmyval.java.basic.homeworks.hw15;

import java.util.ArrayList;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        System.out.println(serialList(5, 11));
        System.out.println(sumAndPrint(new ArrayList<>(Arrays.asList(1, 3, 5, -7, 10, 4, 2, 0, 13))));
        fillList(7, new ArrayList<>(Arrays.asList(1, 3, 5, -7, 10, 4, 2, 0, 13)));
        increaseList(5, new ArrayList<>(Arrays.asList(1, 3, 5, -7, 10, 4, 2, 0, 13)));

    }

    public static ArrayList serialList(int min, int max) {
        ArrayList<Integer> serialNumberList = new ArrayList<>();
        for (int i = 0; i <= max - min; i++) {
            serialNumberList.add(min+i);
        }
        return serialNumberList;
    }

    public static int sumAndPrint(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 5) {
                sum += list.get(i);
            }
        }
        return sum;
    }

    public static void fillList(int a, ArrayList<Integer> list) {
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, a);
        }
        System.out.println(list);
        System.out.println();
    }

    public static void increaseList(int a, ArrayList<Integer> list) {
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + a);
        }
        System.out.println(list);
        System.out.println();
    }

}
