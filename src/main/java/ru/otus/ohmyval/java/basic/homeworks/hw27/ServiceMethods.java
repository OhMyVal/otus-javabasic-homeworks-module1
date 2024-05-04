package ru.otus.ohmyval.java.basic.homeworks.hw27;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ServiceMethods {
    public static void workWithFiles(File[] arr) {
        printFileName(arr);
        System.out.println("Введите имя файла для работы.");
        Scanner scanner = new Scanner(System.in);
        String enteredFileName = scanner.next();
        for (int i = 0; i < arr.length; i++) {
            String firstWordName = splitFileName(arr[i]);
            if (validationCheck(arr, enteredFileName, i, firstWordName)) return;
        }
        System.out.println("Некорректное название файла");
    }

    private static boolean validationCheck(File[] arr, String enteredFileName, int i, String firstWordName) {
        if (firstWordName.equalsIgnoreCase(enteredFileName)) {
            readingFile(arr[i]);
            System.out.println();
            System.out.println("Введите последовательность символов для поиска в файле");
            Scanner scanner1 = new Scanner(System.in);
            String enteredInfo = scanner1.nextLine();
            readingFile(enteredInfo, arr[i]);
            return true;
        }
        return false;
    }

    private static void printFileName(File[] arr) {
        for (File file : arr) {
            String firstWordName = splitFileName(file.getName());
            System.out.println(firstWordName);
        }
    }

    private static String splitFileName(String str) {
        String[] splitName = str.split("\\.");
        return splitName[0];
    }

    private static String splitFileName(File arr) {
        String myFileName = arr.getName();
        String[] splitName = myFileName.split("\\.");
        return splitName[0];
    }

    private static void readingFile(File arr) {
        try (FileInputStream fileInputStream = new FileInputStream(arr)) {
            byte[] buffer = fileInputStream.readAllBytes();
            String data = new String(buffer, StandardCharsets.UTF_8);
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readingFile(String str, File arr) {
        try (FileInputStream fis = new FileInputStream(arr)) {
            byte[] buffer = fis.readAllBytes();
            String data = new String(buffer, StandardCharsets.UTF_8);
            int counter = 0;
            for (int i = 0; (i = data.indexOf(str, i)) != -1; i += str.length()) {
                counter++;
            }
            System.out.println(counter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
