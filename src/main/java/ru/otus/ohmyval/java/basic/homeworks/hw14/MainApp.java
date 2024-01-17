package ru.otus.ohmyval.java.basic.homeworks.hw14;

public class MainApp {
    public static void main(String[] args) {
        String[][] arr = {
                {"10", "2", "4","d"},
                {"11", "4", "8", "0"},
                {"5", "6", "3", "7"},
                {"8", "6", "4", "9"},
        };
        try{
            sumOfArray(arr);
        }catch (AppArraySizeException | AppArrayDataException ex){
            System.err.println(ex.getMessage());
        }

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
