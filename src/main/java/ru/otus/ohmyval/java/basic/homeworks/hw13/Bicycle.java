package ru.otus.ohmyval.java.basic.homeworks.hw13;

public class Bicycle implements Transport {
    private Human passenger;
//    public int getFuel() {
//        return fuel;
//    }
    public Human getPassenger(){
        return passenger;
    }
    public void setPassenger(Human passenger){
        this.passenger = passenger;
    }
//    public Car(int fuel){
//        this.fuel = fuel;
//    }
    @Override
     public boolean move(CountryVariety countryVariety, int distance){
         if (passenger == null){
             System.out.println("Велосипед не может ехать без пассажира");
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
        System.out.println("Человек" + passenger + "проехал на велосипеде " + distance + " км");
        return true;
    }
}
