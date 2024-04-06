package ru.otus.ohmyval.java.basic.homeworks.hw26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxApp {
    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<>(Arrays.asList(new Apple()));
        List<Apple> appleList1 = new ArrayList<>(Arrays.asList(new Apple(), new Apple(), new Apple()));
        List<Orange> orangeList = new ArrayList<>(Arrays.asList(new Orange(),new Orange()));
        List<Orange> orangeList1 = new ArrayList<>(Arrays.asList(new Orange(),new Orange()));
        List<Fruit> fruitList = new ArrayList<>();
        List<Fruit> fruitList1 = new ArrayList<>(Arrays.asList(new Orange(), new Apple(), new Orange(), new Apple()));
        Box<Apple> appleBox = new Box<>(appleList);
        Box<Apple> appleBox1 = new Box<>(appleList1);
        Box<Orange> orangeBox = new Box<>(orangeList);
        Box<Orange> orangeBox1 = new Box<>(orangeList1);
        Box<Fruit> fruitBox = new Box<>(fruitList);
        Box<Fruit> fruitBox1 = new Box<>(fruitList1);
//        System.out.println(orangeBox);
//        System.out.println(orangeBox1);
//        System.out.println(orangeBox.transfer(orangeBox1));
//        System.out.println(orangeBox);
//        System.out.println(appleBox);

        System.out.println(fruitBox);
        System.out.println(fruitBox1);
        System.out.println(fruitBox1.transfer(fruitBox));
        System.out.println(fruitBox);
        System.out.println(fruitBox1);


//        System.out.println(appleBox1);
//        System.out.println(appleBox1.addFruits(new Apple()));
//        System.out.println(orangeBox1.addFruits(new Orange()));
//        System.out.println(fruitBox1.addFruits(new Apple()));
//        System.out.println(appleBox1.weight(new Apple()));
//        System.out.println(appleBox1.weight());
//        System.out.println(orangeBox1.weight());
//        System.out.println(fruitBox1.weight());
//        System.out.println(appleBox1.compare(orangeBox1));


    }
}
