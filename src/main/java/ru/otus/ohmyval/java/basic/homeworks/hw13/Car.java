package ru.otus.ohmyval.java.basic.homeworks.hw13;

public class Car implements Transport {
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
        int drainRate = 10;
        if (passenger == null){
            System.out.println("Машина не может ехать без пассажира");
            return false;
        }
        if (countryVariety != CountryVariety.PLAIN){
            System.out.println("Машина не может ехать по этой местности");
            return false;
        }
        if (fuel < distance/drainRate){
            System.out.println("Машина не может проехать - не хватает бензина");
            return false;
        }
        fuel -= distance/drainRate;
        System.out.println("Человек" + passenger + " проехал на машине " + distance + " км");
        return true;
    }
}
