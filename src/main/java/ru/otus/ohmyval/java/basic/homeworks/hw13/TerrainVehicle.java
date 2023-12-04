package ru.otus.ohmyval.java.basic.homeworks.hw13;

public class TerrainVehicle implements Transport {
    private int fuel;
    private Human driver;
    public int getFuel() {
        return fuel;
    }
    @Override
    public Human getDriver(){
        return driver;
    }
    @Override
    public void setDriver(Human driver){
        this.driver = driver;
    }
    private final int drainRate = 5;
    public int getDrainRate(){
        return drainRate;
    }
    public TerrainVehicle(int fuel){
        this.fuel = fuel;
    }
    @Override
    public boolean move(CountryVariety countryVariety, int distance){
        if (driver == null){
            System.out.println("Вездеход не может ехать без водителя");
            return false;
        }
        if (fuel < distance * drainRate){
            System.out.println("Вездеход не может проехать - не хватает бензина");
            return false;
        }
        fuel -= distance * drainRate;
        System.out.println("Человек " + driver.getName() + " проехал на вездеходе " + distance + " км");
        return true;
    }
}

