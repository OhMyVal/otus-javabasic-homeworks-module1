package ru.otus.ohmyval.java.basic.homeworks.hw18;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class MyFile extends File {

    public MyFile(String pathname) {
        super(pathname);
    }

    public void workWithFiles(File file, File[] arr) {
        System.out.println(Arrays.toString(file.list()));
        System.out.println("Введите имя файла для работы. Имя не должно содержать .txt");
        Scanner scanner = new Scanner(System.in);
        String enteredFileName = scanner.next();
        for (int i = 0; i < arr.length; i++) {
            String firstWordName = splitFileName(arr[i]);
            if (firstWordName.equalsIgnoreCase(enteredFileName)) {
                readingFile(arr[i]);
                System.out.println();
                System.out.println("Введите информацию для записи в файл");
                Scanner scanner1 = new Scanner(System.in);
                String enteredInfo = scanner1.nextLine();
                writingFile(enteredInfo, arr[i]);
                System.out.println("Информация успешно записана в файл");
                break;
            }
        }
        System.out.println("Некорректное название файла");
    }

    private static String splitFileName(File arr) {
        String myFileName = arr.getName();
        String[] splitName = myFileName.split("\\.");
        String firstWordName = splitName[0];
        return firstWordName;
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
