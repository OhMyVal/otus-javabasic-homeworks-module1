package ru.otus.ohmyval.java.basic.homeworks.hw13;

public class Bicycle implements Movable {
    private Human driver;

    @Override
    public Human getDriver() {
        return driver;
    }

    @Override
    public void setDriver(Human driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    @Override
    public boolean move(CountryVariety countryVariety, int distance) {
        if (driver == null) {
            System.out.println("Велосипед не может ехать без водителя");
            return false;
        }
        if (countryVariety == CountryVariety.SWAMP) {
            System.out.println("Велосипед не может ехать по болоту");
            return false;
        }
        if (driver.getEnergy() < distance * driver.getDrainRate()) {
            System.out.println("Человек " + driver.getName() + " не может проехать расстояние на велосипеде - не хватает сил");
            return false;
        }
        driver.setEnergy(driver.getEnergy() - distance * driver.getDrainRate());
        System.out.println("Человек " + driver.getName() + " проехал на велосипеде " + distance + " км");
        return true;
    }
}
