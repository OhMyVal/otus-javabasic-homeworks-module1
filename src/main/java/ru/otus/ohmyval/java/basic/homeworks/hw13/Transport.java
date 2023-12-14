package ru.otus.ohmyval.java.basic.homeworks.hw13;

public interface Transport {
    boolean move(CountryVariety countryVariety, int distance);
    Human getDriver();
    void setDriver(Human driver);
    int getFuel();
    String toString();
}
