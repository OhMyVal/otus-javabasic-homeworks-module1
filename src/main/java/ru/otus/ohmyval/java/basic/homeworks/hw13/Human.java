package ru.otus.ohmyval.java.basic.homeworks.hw13;

public class Human {
    private String name;
    private String currentTransport;
    public String getName(){
        return name;
    }
    public String getCurrentTransport(){
        return currentTransport;
    }
    public Human(String name, String currentTransport){
        this.name = name;
        this.currentTransport = currentTransport;
    }
    public boolean getInTransport(){
        return false;
    }
    public boolean leaveTransport(){
        return false;
    }
    public boolean walk(int distance){
        return false;
    }

}
