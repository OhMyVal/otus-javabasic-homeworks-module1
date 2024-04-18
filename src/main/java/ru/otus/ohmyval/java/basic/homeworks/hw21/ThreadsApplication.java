package ru.otus.ohmyval.java.basic.homeworks.hw21;


public class ThreadsApplication {
    public static void main(String[] args) throws InterruptedException {
        double[] myArray = new double[100_000_000];
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 25_000_000; i++) {
                    myArray[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 25_000_000; i < 50_000_000; i++) {
                    myArray[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 50_000_000; i < 75_000_000; i++) {
                    myArray[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 75_000_000; i < myArray.length; i++) {
                    myArray[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });
        long startTime1 = System.currentTimeMillis();
        fillArr(myArray);
        long endTime1 = System.currentTimeMillis();
        long spentTime1 = (endTime1 - startTime1);
        System.out.println(spentTime1);
        long startTime2 = System.currentTimeMillis();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        long endTime2 = System.currentTimeMillis();
        long spentTime2 = (endTime2 - startTime2);
        System.out.println(spentTime2);

    }

    public static void fillArr(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }
}
