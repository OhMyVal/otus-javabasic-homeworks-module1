package ru.otus.ohmyval.java.basic.homeworks.hw18;

import java.io.*;

import static ru.otus.ohmyval.java.basic.homeworks.hw18.MyFile.workWithFiles;

public class FilesApp {

    public static void main(String[] args) {

        File myFiles = new File("D:\\Information Technology\\Java\\Otus обучение\\Java Basic\\Проекты в Идее\\homeworks");

        File[] filesArr = {
                new File("Eagles.txt"),
                new File("Sinatra.txt"),
                new File("Thunder.txt")
        };
        workWithFiles(myFiles, filesArr);
    }
}
