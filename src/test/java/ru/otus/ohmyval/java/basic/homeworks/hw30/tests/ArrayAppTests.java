package ru.otus.ohmyval.java.basic.homeworks.hw30.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static ru.otus.ohmyval.java.basic.homeworks.hw30.ArrayApp.checkArray;
import static ru.otus.ohmyval.java.basic.homeworks.hw30.ArrayApp.partArray;

public class ArrayAppTests {

    @Test
    public void partArrayTest() {
        Assertions.assertAll(
                () -> {
                    Assertions.assertThrows(RuntimeException.class, () -> {
                        partArray(new int[]{2, 2, 3, 2, 2});
                    });
                },
                () -> {
                    Assertions.assertArrayEquals(new int[]{2, 2}, partArray(new int[]{4, 2, 1, 2, 2}));
                }
        );

    }
    @MethodSource("initialArrays")
    @ParameterizedTest
    public void checkArrayTest(int[] a, boolean containsOneAndTwoNumbers){
        Assertions.assertEquals(checkArray(a), containsOneAndTwoNumbers);
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

