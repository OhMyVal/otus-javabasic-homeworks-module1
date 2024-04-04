package ru.otus.ohmyval.java.basic.homeworks.hw18;

import java.io.*;

public class FilesApp {

    public static void main(String[] args) {

        MyFile myFiles = new MyFile("target/my-files");
        File[] filesArr = {
                new MyFile("target/my-files/Thunder.txt"),
                new MyFile("target/my-files/Eagles.txt"),
                new MyFile("target/my-files/Sinatra.txt")
        };
        myFiles.workWithFiles(myFiles, filesArr);
    }
}
