package ru.otus.ohmyval.java.basic.homeworks.hw13;

public class Human {
    private String name;
    private int energy;
    private Transport currentTransport;
    public String getName(){
        return name;
    }
    public int getEnergy(){
        return energy;
    }
    public Transport getCurrentTransport(){
        return currentTransport;
    }
    public void setCurrentTransport(Transport currentTransport){
        this.currentTransport = currentTransport;
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
    public boolean leaveTransport(){
        return false;
    }
    public boolean walk(int distance){
        return false;
    }

}
