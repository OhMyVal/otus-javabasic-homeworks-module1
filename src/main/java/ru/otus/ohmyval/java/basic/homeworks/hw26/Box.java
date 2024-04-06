package ru.otus.ohmyval.java.basic.homeworks.hw26;

import java.util.List;
import java.util.Objects;


public class Box<T extends Fruit> {
    static double emptyBoxWeight = 0.15;
    List<T> list;

    public Box(List<T> list) {
        this.list = list;
    }

    public static double getEmptyBoxWeight() {
        return emptyBoxWeight;
    }

    public List<T> getList() {
        return list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box<?> box = (Box<?>) o;
        return Objects.equals(list, box.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }

    @Override
    public String toString() {
        return "Box: " + list.toString();

    }

    public boolean addFruits(T fruit) {
        return list.add(fruit);
    }

    public double weight() {
        double boxWeight = emptyBoxWeight;
        for (int i = 0; i < list.size(); i++) {
            boxWeight += list.get(i).getFruitWeight();
        }
        return boxWeight;
    }

    public boolean compare(Box box) {
        return (Math.abs(weight() - box.weight()) < 0.0001);
    }

    public boolean transfer(Box<T> box) {
        if (this.equals(box)) {
            return false;
        }
        if (list.size() == 0) {
            return false;
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            box.addFruits(list.get(i));
            list.remove(i);
        }
        return true;
    }

}
