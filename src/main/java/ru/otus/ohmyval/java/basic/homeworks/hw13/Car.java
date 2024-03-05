package ru.otus.ohmyval.java.basic.homeworks.hw13;

public class Car implements Movable {
    private int fuel;
    private Human driver;
    private final int drainRate = 2;
//    @Override
//    public int getFuel() {
//        return fuel;
//    }
    @Override
    public Human getDriver(){
        return driver;
    }
    @Override
    public void setDriver(Human driver){
        this.driver = driver;
    }
    public int getDrainRate(){
        return drainRate;
    }
    public Car(int fuel){
        this.fuel = fuel;
    }
    @Override
    public String toString(){
        return getClass().getSimpleName();
    }
    @Override
    public boolean move(CountryVariety countryVariety, int distance){
        if (driver == null){
            System.out.println("Машина не может ехать без водителя");
            return false;
        }
        if (countryVariety != CountryVariety.PLAIN){
            System.out.println("Машина не может ехать по этой местности");
            return false;
        }
        if (fuel < distance * drainRate){
            System.out.println("Машина не может проехать - не хватает бензина");
            return false;
        }
        fuel -= distance * drainRate;
        System.out.println("Человек " + driver.getName() + " проехал на машине " + distance + " км");
        return true;
    }
}
