package ru.otus.ohmyval.java.basic.homeworks.hw13;

public class Horse implements Movable {
    private int power;
    private Human driver;
    private final int drainRate = 15;

    public Horse(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    @Override
    public Human getDriver() {
        return driver;
    }

    @Override
    public void setDriver(Human driver) {
        this.driver = driver;
    }

    public int getDrainRate() {
        return drainRate;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    @Override
    public boolean move(CountryVariety countryVariety, int distance) {
        if (driver == null) {
            System.out.println("Лошадь не может идти без наездника");
            return false;
        }
        if (countryVariety == CountryVariety.SWAMP) {
            System.out.println("Лошадь не может идти по болоту");
            return false;
        }
        if (power < distance * drainRate) {
            System.out.println("Лошадь не может пройти расстояние - не хватает сил");
            return false;
        }
        power -= distance * drainRate;
        System.out.println("Человек " + driver.getName() + " проехал на лошади " + distance + " км");
        return true;
    }
}

