package ru.otus.ohmyval.java.basic.homeworks.hw13;

public class Human implements Movable {
    private String name;
    private int energy;
    private Movable currentTransport;
    private final int drainRate = 30;
    private Human driver;
    public String getName(){
        return name;
    }
    public int getEnergy(){
        return energy;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }
    public Movable getCurrentTransport(){
        return currentTransport;
    }
    public int getDrainRate(){
        return drainRate;
    }
    @Override
    public Human getDriver(){
        return driver;
    }
    @Override
    public void setDriver(Human driver){
        this.driver = driver;
    }
    public Human(String name, int energy){
        this.name = name;
        this.energy = energy;
           }
    public boolean getInTransport(Movable transport){
        if (transport.getDriver() != null && transport.getDriver() != this){
            System.out.println("Человек " + name + " не может сесть в " + transport + " - там сидит кто-то другой");
            return false;
        }
        if (currentTransport == transport){  // if(transport.getDriver() = this){ либо можно по водителю проверить
            System.out.println("Человек " + name + " уже сидит в транспорте " + transport);
            return false;
        }
        if (currentTransport != null){
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
    public boolean leaveTransport(Movable transport){
        if (transport.getDriver() == this){
            currentTransport = null;  // тут обнуляется именно ссылка на транспорт
            transport.setDriver(null); // ссылка на водителя в самом транспорте в этой строчке обнуляется
            System.out.println("Человек " + name + " покинул " + transport);
            return true;
        }
        System.out.println("Невозможно выполнить действие"); // решила не расписывать сценарии, что человек и так без транспорта или сидит в другом транспорте.
        return false;
    }
    @Override
    public boolean move (CountryVariety countryVariety, int distance){
        if (currentTransport != null){
            System.out.println("Человек " + name + " не может идти пешком - он в транспорте");
            return false;
        }
        if (energy < distance * drainRate){
            System.out.println("Человек " + name + " не может пройти расстояние - не хватает сил");
            return false;
        }
        energy -= distance * drainRate;
        System.out.println("Человек " + name + " прошел пешком " + distance + " км");
        return true;
    }
}
