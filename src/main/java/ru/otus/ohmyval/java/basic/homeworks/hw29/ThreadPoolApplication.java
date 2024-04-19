package ru.otus.ohmyval.java.basic.homeworks.hw29;

public class ThreadPoolApplication {

    private final Object mon = new Object();
    String str = "C";

    public void printA() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            synchronized (mon){
                while (str.equals("A") || str.equals("B")){
                    mon.wait();
                }
            }

        }
    }



}
