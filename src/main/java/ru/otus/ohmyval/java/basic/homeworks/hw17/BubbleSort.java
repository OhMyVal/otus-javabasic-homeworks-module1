package ru.otus.ohmyval.java.basic.homeworks.hw17;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            boolean changed = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int a = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = a;
                    changed = true;
                }
            }
            if (!changed) {
                break;
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
