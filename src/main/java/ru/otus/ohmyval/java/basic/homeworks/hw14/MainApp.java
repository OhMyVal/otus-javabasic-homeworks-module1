package ru.otus.ohmyval.java.basic.homeworks.hw14;


public class MainApp {
    public static void main(String[] args) {
        String[][] arr = {
                {"10", "2", "4", "5"},
                {"11", "4", "4", "0"},
                {"5", "p", "3", "7"},
                {"8", "6", "4", "3"},
        };
        try {
            System.out.println(sumOfArray(arr));
        } catch (AppArraySizeException | AppArrayDataException ex) {
            System.err.println(ex.getMessage());
        }

    }

    public static int sumOfArray(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != 4 || arr[i].length != 4) {
                throw new AppArraySizeException("Некорректный размер массива");
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    int intVal = Integer.parseInt(arr[i][j]);
                    sum += intVal;
                } catch (NumberFormatException ex) {
                    throw new AppArrayDataException("Ячейку " + arr[i][j] + " невозможно преобразовать в число"); // не знаю, как распечатать индекс массива (и нужно ли это?)
                }
            }
        }
        return sum;
    }
}
