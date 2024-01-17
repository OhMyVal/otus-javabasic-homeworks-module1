package ru.otus.ohmyval.java.basic.homeworks.hw14;

public class MainApp {
    public static void main(String[] args) {

    }
    public static void sumOfArray(String[][] arr){
        int sum = 0;
        try {
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != 4 || arr[i].length != 4){
                throw new AppArraySizeException("Некорректный размер массива");
            }
            for (int j = 0; j < arr[i].length; j++) {
                int intVal = Integer.parseInt(arr[i][j]);
                sum += intVal;
            }
        }
        System.out.println(sum);
        } catch (NumberFormatException ex){
            throw new AppArrayDataException("Ячейку невозможно преобразовать в число");
        }
    }
}
