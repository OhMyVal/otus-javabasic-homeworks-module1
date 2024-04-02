package ru.otus.ohmyval.java.basic.homeworks.hw18;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class MyFile {
    File thunder = new File("target/my-files/Thunder.txt");
    File eagles = new File("target/my-files/Eagles.txt");
    File sinatra = new File("target/my-files/Sinatra.txt");
    File myFiles = new File("target/my-files");

    public void workWithFiles(File file){
        System.out.println(Arrays.toString(myFiles.list()));
        System.out.println("Введите имя файла для работы");
        Scanner scanner = new Scanner(System.in);

    }


}
