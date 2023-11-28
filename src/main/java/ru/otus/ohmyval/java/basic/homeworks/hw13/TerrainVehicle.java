package ru.otus.ohmyval.java.basic.homeworks.hw13;

public class TerrainVehicle implements Transport {
    private int fuel;
    private Human passenger;
    public int getFuel() {
        return fuel;
    }
    public Human getPassenger(){
        return passenger;
    }
    public void setPassenger(Human passenger){
        this.passenger = passenger;
    }
    public TerrainVehicle(int fuel){
        this.fuel = fuel;
    }
    @Override
    public boolean move(CountryVariety countryVariety, int distance){
        int drainRate = 5;
        if (passenger == null){
            System.out.println("Вездеход не может ехать без пассажира");
            return false;
        }
        if (fuel < distance/drainRate){
            System.out.println("Вездеход не может проехать - не хватает бензина");
            return false;
        }
        fuel -= distance/drainRate;
        System.out.println("Человек" + passenger + "проехал на вездеходе " + distance + " км");
        return true;
    }
}

