package ru.otus.ohmyval.java.basic.homeworks.hw18;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class FilesApp {
    public static void main(String[] args) {

        File thunder = new File("target/my-files/Thunder.txt");
        File eagles = new File("target/my-files/Eagles.txt");
        File sinatra = new File("target/my-files/Sinatra.txt");
        File myFiles = new File("target/my-files");

        System.out.println(thunder.getName());
        System.out.println(Arrays.toString(myFiles.list()));
        System.out.println("Введите имя файла для работы");
        Scanner scanner = new Scanner(System.in);
        String enteredFileName = scanner.next();
        File[] filesArr = {eagles, sinatra, thunder};
        for (int i = 0; i < filesArr.length; i++) {
            String myFileName = filesArr[i].getName();
            String[] splitName = myFileName.split("\\.");
            String firstWordName = splitName[0];
            if (firstWordName.equalsIgnoreCase(enteredFileName)){
                try(FileInputStream fis = new FileInputStream(filesArr[i]);
                    BufferedInputStream bis = new BufferedInputStream(fis);
                    InputStreamReader in = new InputStreamReader(bis)){
                    int n = in.read();
                    while (n!= -1){
                        System.out.print((char) n);
                        n = in.read();
                    }
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
           break;
        }
        System.out.println();
        System.out.println("Введите информацию для записи в файл");
        Scanner scanner1 = new Scanner(System.in);
        String enteredInfo = scanner1.nextLine();
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(filesArr[i], true))) {
            byte[] buffer = enteredInfo.getBytes(StandardCharsets.UTF_8);
            for (int j = 0; j < buffer.length; j++) {
                out.write(buffer[j]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
