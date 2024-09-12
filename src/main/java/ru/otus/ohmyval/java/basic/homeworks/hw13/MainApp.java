package ru.otus.ohmyval.java.basic.homeworks.hw13;

public class MainApp {
    public static void main(String[] args) {
        Human[] human = {
                new Human("Boris", 300),
                new Human("Max", 200),
                new Human("Egor", 400)
        };
        Movable[] transport = {
                new Bicycle(),
                new Car(50),
                new Horse(350),
                new TerrainVehicle(30)
        };
        CountryVariety[] countryVariety = {
                CountryVariety.PLAIN,
                CountryVariety.DEEP_FOREST,
                CountryVariety.SWAMP
        };
        for (CountryVariety c : countryVariety) {
            System.out.println(c);
            for (Human h : human) {
                for (Movable t : transport) {
                    h.catchTransport(t, c, 5);
                    System.out.println(h.getCurrentTransport());
                }
            }
        }
    }
}


