package ru.otus.ohmyval.java.basic.homeworks.hw29;

public class ThreadPoolTask {
    private final Object mon = new Object();
    private String str = "C";

    public void printA() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (str.equals("A") || str.equals("B")) {
                        mon.wait();
                    }
                    System.out.print("A");
                    str = "A";
                    mon.notifyAll();
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void printB() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (str.equals("B") || str.equals("C")) {
                        mon.wait();
                    }
                    System.out.print("B");
                    str = "B";
                    mon.notifyAll();
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void printC() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (str.equals("C") || str.equals("A")) {
                        mon.wait();
                    }
                    System.out.print("C");
                    str = "C";
                    mon.notifyAll();
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
