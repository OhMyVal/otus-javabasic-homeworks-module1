package ru.otus.ohmyval.java.basic.homeworks.hw5;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        printString(6, "Learning to print strings");
        sumAndPrint(new int[] {2,4,7,2,9,8,4,6,1,3});
        fillArr(6, new int[] {3,6,7,8,2,5,9,23,78,93});
    }

    public static void printString(int a, String arg) {
        for (int i = 1; i <= a; i++) {
            System.out.println(arg);
        }
        System.out.println();
    }

    public static void sumAndPrint(int [] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
        System.out.println();
    }

    public static void fillArr(int a, int [] arr) {
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
}

