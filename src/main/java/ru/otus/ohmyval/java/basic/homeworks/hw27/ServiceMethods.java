package ru.otus.ohmyval.java.basic.homeworks.hw27;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ServiceMethods {
    public static void workWithFiles(File file, File[] arr) {
        printFileName(file);
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

    private static void printFileName(File file) {
        try {
            for (String s : file.list()
            ) {
                if (s.contains(".txt")) {
                    String firstWordName = splitFileName(s);
                    System.out.println(firstWordName);
                }
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println("Отсутствуют файлы в каталоге");
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
        try (FileInputStream fis = new FileInputStream(arr);
             BufferedInputStream bis = new BufferedInputStream(fis);
             InputStreamReader in = new InputStreamReader(bis)) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readingFile(String enteredInfo, File arr) {
        try (FileInputStream fis = new FileInputStream(arr)) {
            byte[] buffer = fis.readAllBytes();
            String data = new String(buffer, StandardCharsets.UTF_8);
            int counter = 0;
            for (int i = 0; (i = data.indexOf(enteredInfo, i)) != -1; i += enteredInfo.length()) {
                counter++;
            }
            System.out.println(counter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
