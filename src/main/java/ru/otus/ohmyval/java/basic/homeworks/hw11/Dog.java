package ru.otus.ohmyval.java.basic.homeworks.hw11;

public class Dog extends Animal{
    int velocityOfSwimming;
    int swimEnduranceDrain;
    public int getVelocityOfSwimming(){
        return velocityOfSwimming;
    }
    public int getSwimEnduranceDrain(){
        return swimEnduranceDrain;
    }
    public Dog(String name, int velocityOfRunning, int endurance, int runEnduranceDrain, int velocityOfSwimming, int swimEnduranceDrain){
        this.name = name;
        this.velocityOfRunning = velocityOfRunning;
        this.endurance = endurance;
        this.runEnduranceDrain = runEnduranceDrain;
        this.velocityOfSwimming = velocityOfSwimming;
        this.swimEnduranceDrain = swimEnduranceDrain;
    }

}
