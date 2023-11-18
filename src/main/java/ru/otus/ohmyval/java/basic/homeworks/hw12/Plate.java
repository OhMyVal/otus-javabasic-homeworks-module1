package ru.otus.ohmyval.java.basic.homeworks.hw12;

public class Plate {
    private int maxCapacity;
    private int foodQuantity;
    public int getMaxCapacity(){
        return maxCapacity;
    }
    public int getFoodQuantity(){
        return foodQuantity;
    }
    public Plate(int maxCapacity, int foodQuantity){
        this.maxCapacity = maxCapacity;
        this.foodQuantity = foodQuantity;
    }
    public void addFood(){
        if (foodQuantity == maxCapacity){
            System.out.println("В тарелку нельзя добавить еду - она наполнена");
            return;
        }
//        for (int i = foodQuantity + 1; i <= maxCapacity; i++){
//            foodQuantity ++;
//        }
        foodQuantity = maxCapacity;
        System.out.println("Наполнили тарелку едой");
    }
    public boolean decreaseFood(Cat cat){
        if (foodQuantity - cat.getAppetite() >= 0){
            return true;
        }
        return false;
    }

}
