package ru.otus.ohmyval.java.basic.homeworks.hw18;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MyFile {

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
            System.out.println("Введите информацию для записи в файл");
            Scanner scanner1 = new Scanner(System.in);
            String enteredInfo = scanner1.nextLine();
            writingFile(enteredInfo, arr[i]);
            System.out.println("Информация успешно записана в файл");
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

    private static void writingFile(String enteredInfo, File arr) {
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(arr, true))) {
            byte[] buffer = enteredInfo.getBytes(StandardCharsets.UTF_8);
            for (int j = 0; j < buffer.length; j++) {
                out.write(buffer[j]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
