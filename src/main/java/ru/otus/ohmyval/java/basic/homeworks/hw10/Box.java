package ru.otus.ohmyval.java.basic.homeworks.hw10;

public class Box {
    private int length;     // Можно было бы все размерные поля сделать private final,
    private int width;          // чтобы их вообще никак нельзя было изменить
    private int height;
    private String color;
    private boolean opened;
    private boolean empty;
    private String item; // делаем так, чтобы коробка "запомнила" предмет, который в нее положили

    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isOpened(){
        return opened;
    }
    public void setOpened(boolean opened){
        this.opened = opened;
    }
    public boolean isEmpty(){  //У поля empty нет сеттера, т.к. для изменения этого свойства, нужно вызвать методы putIn или putOut
        return empty;
    }
    public String getItem(){
        return item;
    }
    public void setItem(String item){
        this.item = item;
    }


    public Box(int length, int width, int height, String color, boolean opened, boolean empty, String item){
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
        this.opened = opened;
        this.empty = empty;
        this.item = item;
    }

    public void info(){
        System.out.println("Размеры в см: " + length + " * "+ width + " * "+ height);
        System.out.println("Цвет: " + color);
        if(opened){
        System.out.println("Коробка открыта");
        } else {
            System.out.println("Коробка закрыта");
        }
        if(empty){
            System.out.println("Коробка пустая");
        } else {
            System.out.println("В коробке лежит " + item);
        }
        System.out.println();
    }

    public void putIn(){
        if(opened && empty){
            System.out.println("В коробку положили " + item);
            empty = false;
        } else
            if (opened && !empty) {
                System.out.println("В коробку нельзя положить " + item + " - она заполнена");
            }
            else {
                System.out.println("В коробку нельзя положить " + item + " - она закрыта");
            }
    }
//    Можно переделать метод putIn так, чтобы код был читаемее (ну putOut соответственно):
//    public void putIn(String item) {  тут в методе есть аргумент, тк в предыдущей версии у коробки не было поля item и оно задавалось тут
//        if (!opened) {
//            System.out.println("В коробку нельзя положить " + item + " - она закрыта");
//            return;
//        }
//        if (!empty) {
//            System.out.println("В коробку нельзя положить " + item + " - она заполнена");
//            return;
//        }
//        System.out.println("В коробку положили " + item);
//        empty = false;
//    }

    public void putOut(){
        if(opened && !empty){
            System.out.println("Из коробки достали " + item);
            empty = true;
        } else
            if (opened && empty) {
            System.out.println("Из коробки нельзя достать " + item + " - она пустая");
        }
        else {
            System.out.println("Из коробки нельзя достать " + item + " - она закрыта");
        }
    }
}
