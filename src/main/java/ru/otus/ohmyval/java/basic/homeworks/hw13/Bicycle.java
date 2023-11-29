package ru.otus.ohmyval.java.basic.homeworks.hw13;

public class Bicycle implements Transport {
    private Human driver;
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
//    public Car(int fuel){
//        this.fuel = fuel;
//    }
    @Override
     public boolean move(CountryVariety countryVariety, int distance){
         if (driver == null){
             System.out.println("Велосипед не может ехать без водителя");
             return false;
         }
        if (countryVariety == CountryVariety.SWAMP){
            System.out.println("Велосипед не может ехать по болоту");
            return false;
        }
//        if (fuel < distance/10){
//            System.out.println("Велосипед не может ехать - не хватает сил у человека");
//            return false;
//        }
//        fuel -= distance/10;
        System.out.println("Человек" + driver + "проехал на велосипеде " + distance + " км");
        return true;
    }
}
