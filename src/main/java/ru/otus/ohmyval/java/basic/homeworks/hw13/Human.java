package ru.otus.ohmyval.java.basic.homeworks.hw13;

public class Human implements Movable {
    private String name;
    private int energy;
    private Movable currentTransport;
    private final int drainRate = 30;
    private Human driver;

    public Human(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public Movable getCurrentTransport() {
        return currentTransport;
    }

    public void setCurrentTransport(Movable currentTransport) {
        this.currentTransport = currentTransport;
    }

    public int getDrainRate() {
        return drainRate;
    }

    @Override
    public Human getDriver() {
        return driver;
    }

    @Override
    public void setDriver(Human driver) {
        this.driver = driver;
    }

    public boolean getInTransport(Movable transport) {
        if (transport.getDriver() != null && transport.getDriver() != this) {
            System.out.println("Человек " + name + " не может сесть в " + transport + " - там сидит кто-то другой");
            return false;
        }
        if (transport.getDriver() == this) { //if (currentTransport == transport){ либо можно по транспорту проверить
            System.out.println("Человек " + name + " уже сидит в транспорте " + transport);
            return false;
        }
        if (currentTransport != null) {
            currentTransport.setDriver(null);
            System.out.println("Человек " + name + " покинул " + currentTransport);
            transport.setDriver(this);
            currentTransport = transport;
            System.out.println("Человек " + name + " сел в " + transport);
            return true;
        }
        transport.setDriver(this);
        currentTransport = transport;
        System.out.println("Человек " + name + " сел в " + transport);
        return true;
    }

    public boolean leaveTransport(Movable transport) {
        if (transport.getDriver() == this) {
            currentTransport = null;  // тут обнуляется ссылка на транспорт именно у человека
            transport.setDriver(null); // в этой строчке обнуляется ссылка на водителя в самом транспорте
            System.out.println("Человек " + name + " покинул " + transport);
            return true;
        }
        System.out.println("Невозможно выполнить действие"); // решила не расписывать сценарии, что человек и так без транспорта или сидит в другом транспорте.
        return false;
    }

    public void catchTransport(Movable transport, CountryVariety countryVariety, int distance) {
        if (!getInTransport(transport)) {
            if (transport.getDriver() == this) {
                System.out.println("Человек " + name + " уже сидит в транспорте " + transport);
                return;
            }
            if (transport.getDriver() != null && transport.getDriver() != this) {
                transport.getDriver().setCurrentTransport(null);
                transport.setDriver(null);
                transport.setDriver(this);
                currentTransport = transport;
                System.out.println("Человек " + name + " выгнал кого-то и сел в " + transport);
                return;
            }
        }
        if (!transport.move(countryVariety, distance)) {
            leaveTransport(transport);
            move(countryVariety, distance);
        } else
            leaveTransport(transport);
    }

    @Override
    public boolean move(CountryVariety countryVariety, int distance) {
        if (currentTransport != null) {
            System.out.println("Человек " + name + " не может идти пешком - он в транспорте");
            return false;
        }
        if (energy < distance * drainRate) {
            System.out.println("Человек " + name + " не может пройти расстояние - не хватает сил");
            return false;
        }
        energy -= distance * drainRate;
        System.out.println("Человек " + name + " прошел пешком " + distance + " км");
        return true;
    }
}
