package ru.otus.ohmyval.java.basic.homeworks.hw13;

public class Car implements Transport {
    private int fuel;
//    private CountryVariety countryVariety;
    private Human driver;
    private final int drainRate = 2;
//    public CountryVariety getCountryVariety(){
//        return countryVariety;
//    }
//    public void setCountryVariety(CountryVariety countryVariety) {
//        this.countryVariety = countryVariety;
//    }

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
    public int getDrainRate(){
        return drainRate;
    }
    public Car(int fuel){
        this.fuel = fuel;
    }
//    private String passenger;
//    public String getPassenger(){
//        return passenger;
//    }
//    public Car(Human human){
//        this.passenger = human.getName();
//    }
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
