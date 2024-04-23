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
                threadPoolTask.printA();
            }
        });
        serv.execute(() -> threadPoolTask.printB());
        serv.execute(threadPoolTask::printC);
        serv.shutdown();
    }
}

