package ru.otus.ohmyval.java.basic.homeworks.hw30;

import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {

        System.out.println(checkArray(new int[]{2, 1, 3, 1, 1}));
        System.out.println(Arrays.toString(partArray(new int[]{2, 12, 3, 13, 18})));

    }

    public static int[] partArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 1) {
                int[] newArray = new int[arr.length - 1 - i];
                System.arraycopy(arr, i + 1, newArray, 0, newArray.length);
                return newArray;
            }
        }
        throw new RuntimeException("В массиве отсутствуют единицы");
    }

    public static boolean checkArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i] != 2) {
                return false;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                return true;
            }
        }
        return false;
    }
}
