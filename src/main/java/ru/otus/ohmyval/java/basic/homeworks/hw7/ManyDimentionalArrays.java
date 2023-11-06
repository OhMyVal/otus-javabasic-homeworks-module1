package ru.otus.ohmyval.java.basic.homeworks.hw7;

public class ManyDimentionalArrays {
    public static void main(String[] args) {

        System.out.println(sumOfPositiveElements(new int[][]{{1, 3, -5, 6}, {-2, -4, 6, 8, 9}}));
        System.out.println();
        printSquare(6);
        clearDiagonalArr(new int[][]{{1, 3, 3, 5}, {1, 3, 2, 4}, {1, 1, 1, 1}, {5, 1, 4, 7}});
        System.out.println(findMax(new int[][]{{1, 3, -5, 6}, {-2, -4, 6, 8, 9, 5}}));
        System.out.println();
        System.out.println(verticalSum(new int[][]{{1,4}, {-2, 4, 6, 8,}, {1, 3, 3, 5}, {1,4}, {1, 1}, {5, 1, 4, 7}}));

    }

    public static int sumOfPositiveElements(int[][] arr2D) {
        int sum = 0;
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                if (arr2D[i][j] > 0) {
                    sum += arr2D[i][j];
                }
            }
        }
        return sum;
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void clearDiagonalArr(int[][] arr2D) {
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                arr2D[i][arr2D.length - 1 - i] = 0;
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static int verticalSum(int[][] array2D) {
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if (array2D[i].length < 2) {
                    return -1;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 1; j < 2; j++) {     // Строчки 71 и 72 можно заменить на sum += array2D[i][1];
                sum += array2D[i][j];
                }
            }
        return sum;
    }
}
