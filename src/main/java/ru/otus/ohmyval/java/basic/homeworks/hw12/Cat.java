package ru.otus.ohmyval.java.basic.homeworks.hw12;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void info() {
        if (satiety) {
            System.out.println("Кот " + name + " сытый");
            return;
        }
        System.out.println("Кот " + name + " голодный");
    }

    public void eat(Plate plate) {
        if (satiety) {
            System.out.println("Кот " + name + " сытый, есть не хочет");
            return;
        }
        if (plate.getFoodQuantity() == 0) {
            System.out.println("Еды нет от слова совсем, кормить котов нечем");
            return;
        }
        if (plate.decreaseFood(this)) {
            System.out.println("Кот " + name + " поел");
            satiety = true;
            return;
        }
        System.out.println("Кот " + name + " не поел - ему не хватило еды");
    }
}

