package ru.otus.ohmyval.java.basic.homeworks.hw13;

public class Horse implements Transport{
    private int power;
    private Human passenger;
    public int getPower() {
        return power;
    }
    public Human getPassenger(){
        return passenger;
    }
    public void setPassenger(Human passenger){
        this.passenger = passenger;
    }
    public Horse(int power){
        this.power = power;
    }
    @Override
    public boolean move(CountryVariety countryVariety, int distance){
        int drainRate = 2;
        if (passenger == null){
            System.out.println("Лошадь не может идти без пассажира");
            return false;
        }
        if (countryVariety == CountryVariety.SWAMP){
            System.out.println("Лошадь не может идти по болоту");
            return false;
        }
        if (power < distance/drainRate){
            System.out.println("Лошадь не может пройти расстояние - не хватает сил");
            return false;
        }
        power -= distance/drainRate;
        System.out.println("Человек" + passenger + "проехал на лошади " + distance + " км");
        return true;
    }
}

