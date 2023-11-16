package ru.otus.ohmyval.java.basic.homeworks.hw11;

public class Cat extends Animal{
    public Cat(String name, int endurance, int velocityOfRunning, int runEnduranceDrain){
      this.name = name;
      this.endurance = endurance;
      this.velocityOfRunning = velocityOfRunning;
      this.runEnduranceDrain = runEnduranceDrain;
    }
    @Override
    public int swim(int distance){
        System.out.println(getClass() + " " + name + " не умеет плавать");
        return (-1);
    }

}
