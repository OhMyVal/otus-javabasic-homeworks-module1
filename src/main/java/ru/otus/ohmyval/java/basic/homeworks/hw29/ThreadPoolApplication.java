package ru.otus.ohmyval.java.basic.homeworks.hw29;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolApplication {

    public static void main(String[] args) {
        ThreadPoolTask threadPoolTask = new ThreadPoolTask();
        ExecutorService serv = Executors.newFixedThreadPool(3);
        serv.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Start1");
                threadPoolTask.printA();
                System.out.println("End1");
            }
        });
        serv.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Start2");
                threadPoolTask.printB();
                System.out.println("End2");
            }
        });
        serv.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Start3");
                threadPoolTask.printC();
                System.out.println("End3");
            }
        });
        serv.shutdown();
    }
}

