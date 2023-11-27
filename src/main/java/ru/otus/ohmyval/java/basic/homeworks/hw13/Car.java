package ru.otus.ohmyval.java.basic.homeworks.hw13;

public class Car {
    private int fuel;
//    private CountryVariety countryVariety;
    private Human passenger;
//    public CountryVariety getCountryVariety(){
//        return countryVariety;
//    }
//    public void setCountryVariety(CountryVariety countryVariety) {
//        this.countryVariety = countryVariety;
//    }

    public int getFuel() {
        return fuel;
    }
    public Human getPassenger(){
        return passenger;
    }
    public void setPassenger(Human passenger){
        this.passenger = passenger;
    }
//    private String passenger;
//    public String getPassenger(){
//        return passenger;
//    }
//    public Car(Human human){
//        this.passenger = human.getName();
//    }
    public boolean move(CountryVariety countryVariety, int distance){
        if (countryVariety != CountryVariety.PLAIN){
            System.out.println("Машина не может ехать по этой местности");
            return false;
        }
        if (passenger == null){
            System.out.println("Машина не может ехать без пассажира");
            return false;
        }
        if (fuel < distance/10){
            System.out.println("Машина не может ехать - не хватает бензина");
            return false;
        }
        fuel -= distance/10;
        System.out.println("Человек проехал на машине " + distance + " км");
        return true;
    }
}
