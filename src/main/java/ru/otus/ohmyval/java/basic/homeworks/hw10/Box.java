package ru.otus.ohmyval.java.basic.homeworks.hw10;

public class Box {
    private final int length;     // поля final, чтобы их вообще никак нельзя было изменить
    private final int width;
    private final int height;
    private String color;
    private boolean opened;
    private boolean empty;
    private String item; // делаем так, чтобы коробка "запомнила" предмет, который в нее положили

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpened() {
        return opened;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
    }

    public boolean isEmpty() {  //У поля empty нет сеттера, т.к. для изменения этого свойства, нужно вызвать методы putIn или putOut
        return empty;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }


    public Box(int length, int width, int height, String color, boolean opened, boolean empty) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
        this.opened = opened;
        this.empty = empty;
    }

    public void info() {
        System.out.println("Размеры в см: " + length + " * " + width + " * " + height);
        System.out.println("Цвет: " + color);
        if (opened) {
            System.out.println("Коробка открыта");
        } else {
            System.out.println("Коробка закрыта");
        }
        if (empty) {
            System.out.println("Коробка пустая");
        } else {
            System.out.println("В коробке что-то лежит");
        }
        System.out.println();
    }

    public void putIn(String item) {  //тут в методе есть аргумент, т.к. в предыдущей версии у коробки не было поля item
        // и оно задавалось не в аргументе метода, а в теле
        if (!opened) {
            System.out.println("В коробку нельзя положить " + item + " - она закрыта");
            return;
        }
        if (!empty) {
            System.out.println("В коробку нельзя положить " + item + " - она заполнена");
            return;
        }
        System.out.println("В коробку положили " + item);
        empty = false;
    }
//    Предыдущий вариант (он плохо читаемый - с многоступенчатым if else)
//    public void putIn(){
//        if(opened && empty){
//            System.out.println("В коробку положили " + item);
//            empty = false;
//        } else
//            if (opened && !empty) {
//                System.out.println("В коробку нельзя положить " + item + " - она заполнена");
//            }
//            else {
//                System.out.println("В коробку нельзя положить " + item + " - она закрыта");
//            }

    public void putOut(String item) {
        if (!opened) {
            System.out.println("Из коробки нельзя достать " + item + " - она закрыта");
            return;
        }
        if (empty) {
            System.out.println("Из коробки нельзя достать " + item + " - она пустая");
            return;
        }
        System.out.println("Из коробки достали " + item);
        empty = true;
    }
}