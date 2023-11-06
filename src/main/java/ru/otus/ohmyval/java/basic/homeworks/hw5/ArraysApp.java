package ru.otus.ohmyval.java.basic.homeworks.hw5;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        printString(6, "Learning to print strings");
        sumAndPrint(new int[] {2,4,7,2,9,8,4,6,1,3});
        fillArr(6, new int[] {3,6,7,8,2,5,9,23,78,93});
        increaseArr(2, new int[] {6,4,7,2,8,9,1,0,5,44,66});
        compareSum(new int[] {1,2,3,4,5,6,7,8,9});
      // задания под *
        sumOfArrays(new int[] {1,2,3,4,5,6,7}, new int[] {2,6}, new int[] {2,4,5,6,7});
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
    public static void increaseArr(int a, int [] arr) {
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] += a;
            }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
    public static void compareSum(int[] arr) {
        int coef = 0;
        if (arr.length % 2 != 0){
            coef = 1;
            }
        int sumLeft = 0;
        for (int i = 0; i < arr.length/2; i++) {
            sumLeft += arr[i];
            }
        int sumRight = 0;
        for (int i = arr.length/2 + coef; i < arr.length; i++) {
            sumRight += arr[i];
            }
        System.out.println("sumLeft = " + sumLeft + "; " + "sumRight = " + sumRight);
        if (sumLeft > sumRight) {
            System.out.println("Сумма элементов левой половины массива больше");
            } else {
            System.out.println("Сумма элементов правой половины массива больше");
            }
        System.out.println();
    }
    public static void sumOfArrays(int[] arr1, int[] arr2, int[] arr3) {
        int maxLength = arr1.length;
        if (arr2.length > arr1.length) {
            maxLength = arr2.length;
            }
        if (arr3.length > maxLength) {
            maxLength = arr3.length;
            }
        int[] arrSum = new int[maxLength];
        System.arraycopy(arr1,0, arrSum, 0, arr1.length);
        for (int i = 0; i < arr2.length; i++) {
            arrSum[i] += arr2[i];
            }
        for (int i = 0; i < arr3.length; i++) {
            arrSum[i] += arr3[i];
            }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arrSum));
        System.out.println();
    }
}


