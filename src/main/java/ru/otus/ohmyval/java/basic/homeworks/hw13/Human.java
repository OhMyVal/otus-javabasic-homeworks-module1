package ru.otus.ohmyval.java.basic.homeworks.hw13;

public class Human {
    private String name;
    private int energy;
    private Transport currentTransport;
    private final int drainRate = 30;
    public String getName(){
        return name;
    }
    public int getEnergy(){
        return energy;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }
    public Transport getCurrentTransport(){
        return currentTransport;
    }
    public int getDrainRate(){
        return drainRate;
    }
    public Human(String name, int energy){
        this.name = name;
        this.energy = energy;
           }
    public boolean getInTransport(Transport transport){
        if (transport.getDriver() != null && transport.getDriver() != this){
            System.out.println("В транспорте " + transport + " сидит кто-то другой");
            return false;
        }
        if (currentTransport == transport){  // if(transport.getDriver() = this){ либо можно по водителю проверить
            System.out.println("Человек " + name + " уже сидит в транспорте " + transport);
            return false;
        }
        if (currentTransport != null){
            currentTransport.setDriver(null);
            System.out.println("Человек " + name + " покинул" + currentTransport);
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
    public boolean leaveTransport(Transport transport){
        if (currentTransport != null && currentTransport == transport){ //if(transport.getDriver() = this){ думаю, что 2 условия можно заменить одним этим
            currentTransport.setDriver(null);
            transport.setDriver(null); //не уверена, что нужна эта строчка: currentTransport и transport ссылаются на один объект. и в предыдущей строке я обнулила водителя.
            System.out.println("Человек " + name + " покинул" + transport);
            return true;
        }
        System.out.println("Невозможно выполнить действие"); // решила не расписывать сценарии, что человек и так без транспорта или сидит в другом транспорте.
        return false;
    }
    public boolean walk(int distance){
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
