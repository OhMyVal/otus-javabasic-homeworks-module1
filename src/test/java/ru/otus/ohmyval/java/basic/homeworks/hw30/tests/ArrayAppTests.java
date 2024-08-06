package ru.otus.ohmyval.java.basic.homeworks.hw30.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static ru.otus.ohmyval.java.basic.homeworks.hw30.ArrayApp.checkArray;
import static ru.otus.ohmyval.java.basic.homeworks.hw30.ArrayApp.partArray;

public class ArrayAppTests {

    @MethodSource("testArrays")
    @ParameterizedTest
    public void partArrayTest(int[] resArr, int[] enteredArr) {
        Assertions.assertArrayEquals(resArr, partArray(enteredArr));
        Assertions.assertThrows(RuntimeException.class, () -> {
                        partArray(enteredArr);
        });

//        Assertions.assertAll(
//                () -> {
//                    Assertions.assertThrows(RuntimeException.class, () -> {
//                        partArray(new int[]{2, 2, 3, 2, 2});
//                    });
//                },
//                () -> {
//                    Assertions.assertArrayEquals(new int[]{2, 2}, partArray(new int[]{4, 2, 1, 2, 2}));
//                }
//        );

    }

    public static Stream<Arguments> testArrays() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new int[]{2, 3, 2, 2}, new int[]{2, 3, 2, 2}));
        out.add(Arguments.arguments(new int[]{2, 2}, new int[]{2, 2, 5, 2, 2}));
        out.add(Arguments.arguments(new int[]{2}, new int[]{1, 2, 3, 6, 2}));
        out.add(Arguments.arguments(new int[]{3, 2, 2}, new int[]{1, 1, 3, 2, 2}));
        return out.stream();
    }
    @MethodSource("initialArrays")
    @ParameterizedTest
    public void checkArrayTest(int[] arr, boolean containsOneAndTwoNumbers){
        Assertions.assertEquals(checkArray(arr), containsOneAndTwoNumbers);
    }

    public static Stream<Arguments> initialArrays() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new int[]{2, 1, 2, 1, 1}, true));
        out.add(Arguments.arguments(new int[]{1, 1, 2, 1, 1}, true));
        out.add(Arguments.arguments(new int[]{1, 1, 1, 1, 1}, false));
        out.add(Arguments.arguments(new int[]{2, 2, 2, 2, 2}, false));
        out.add(Arguments.arguments(new int[]{3, 4, 1, 2, 2}, false));
        return out.stream();
    }
}

