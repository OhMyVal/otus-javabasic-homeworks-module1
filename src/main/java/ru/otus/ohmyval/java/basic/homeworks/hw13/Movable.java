package ru.otus.ohmyval.java.basic.homeworks.hw13;

public interface Movable {
    boolean move(CountryVariety countryVariety, int distance);

    Human getDriver();

    void setDriver(Human driver);

//    String toString(); //необязательный метод - у всех классов и интерфейсов он уже есть - из класса Object
}