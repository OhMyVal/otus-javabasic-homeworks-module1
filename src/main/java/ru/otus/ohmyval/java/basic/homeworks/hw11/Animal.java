package ru.otus.ohmyval.java.basic.homeworks.hw11;

public class Animal {
    String name;
    int endurance;
    int velocityOfRunning;
    int runEnduranceDrain;
    int velocityOfSwimming;
    int swimEnduranceDrain;
    public String getName(){
        return name;
    }
    public int getEndurance(){
        return endurance;
    }
    public int getVelocityOfRunning(){
        return velocityOfRunning;
    }
    public int getRunEnduranceDrain(){
        return runEnduranceDrain;
    }
    public int getVelocityOfSwimming(){
        return velocityOfSwimming;
    }
    public int getSwimEnduranceDrain(){
        return swimEnduranceDrain;
    }
    public void info(){
        System.out.println(name + ", выносливость " + endurance);
        if (endurance > 0) {
            System.out.println("У животного есть силы");
        }else {
            System.out.println("Животное устало");
        }
        System.out.println();
    }
    public int run(int distance){
        if(endurance < runEnduranceDrain * distance){
            System.out.println(name + " не может пробежать эту дистанцию - не хватает сил");
            return -1;
            }
        int time = distance / velocityOfRunning;
        endurance -= runEnduranceDrain * distance;
        System.out.println("У животного " + name + " осталось " + endurance + " единиц выносливости");
        return time;
    }
    public int swim(int distance) {
        if (endurance < swimEnduranceDrain * distance) {
            System.out.println(name + " не может проплыть эту дистанцию - не хватает сил");
            return -1;
        }
        int time = distance / velocityOfSwimming;
        endurance -= swimEnduranceDrain * distance;
        System.out.println("У животного " + name + " осталось " + endurance + " единиц выносливости");
        return time;
    }



}
