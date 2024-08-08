package ru.otus.ohmyval.java.basic.homeworks.hw30.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static ru.otus.ohmyval.java.basic.homeworks.hw30.ArrayApp.checkArray;
import static ru.otus.ohmyval.java.basic.homeworks.hw30.ArrayApp.partArray;

public class ArrayAppTests {

    @MethodSource("partArrayReturnsCorrectArrayArgs")
    @ParameterizedTest
    public void partArrayTest_ReturnsCorrectArray(int[] resArr, int[] enteredArr) {
        Assertions.assertArrayEquals(resArr, partArray(enteredArr));
    }

    public static Stream<Arguments> partArrayReturnsCorrectArrayArgs() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new int[]{2, 3, 2, 2}, new int[]{2, 3, 2, 2}));
        out.add(Arguments.arguments(new int[]{2, 2}, new int[]{2, 2, 5, 2, 2}));
        out.add(Arguments.arguments(new int[]{2}, new int[]{1, 2, 3, 6, 2}));
        out.add(Arguments.arguments(new int[]{3, 2, 2}, new int[]{1, 1, 3, 2, 2}));
        return out.stream();
    }

    @MethodSource("partArrayThrowsExceptionWhenNoOneArgs")
    @ParameterizedTest
    public void partArrayTest_ThrowsExceptionWhenNoOne(int[] enteredArr) {
        Assertions.assertThrows(RuntimeException.class, () -> {
            partArray(enteredArr);
        });
    }

    public static Stream<Arguments> partArrayThrowsExceptionWhenNoOneArgs() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new int[]{2, 3, 2, 2}));
        out.add(Arguments.arguments(new int[]{2, 2, 5, 2, 2}));
        out.add(Arguments.arguments(new int[]{1, 2, 3, 6, 2}));
        out.add(Arguments.arguments(new int[]{1, 1, 3, 2, 2}));
        return out.stream();
    }

    @MethodSource("checkArrayArgs")
    @ParameterizedTest
    public void checkArrayTest(int[] arr, boolean containsOneAndTwoNumbers) {
        Assertions.assertEquals(checkArray(arr), containsOneAndTwoNumbers);
    }

    public static Stream<Arguments> checkArrayArgs() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new int[]{2, 1, 2, 1, 1}, true));
        out.add(Arguments.arguments(new int[]{1, 1, 2, 1, 1}, true));
        out.add(Arguments.arguments(new int[]{1, 1, 1, 1, 1}, false));
        out.add(Arguments.arguments(new int[]{2, 2, 2, 2, 2}, false));
        out.add(Arguments.arguments(new int[]{3, 4, 1, 2, 2}, false));
        return out.stream();
    }
}

