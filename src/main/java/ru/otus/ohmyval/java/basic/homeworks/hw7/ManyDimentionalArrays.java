package ru.otus.ohmyval.java.basic.homeworks.hw7;

public class ManyDimentionalArrays {
    public static void main(String[] args) {

        System.out.println(sumOfPositiveElements(new int[][]{{1, 3, -5, 6}, {-2, -4, 6, 8, 9}}));
        System.out.println();
        printSquare(6);
        clearDiagonalArr(new int[][]{{1, 3, 3, 5}, {1, 3, 2, 4}, {1, 1, 1, 1}, {5, 1, 4, 7}});
        System.out.println(findMax(new int[][]{{1, 3, -5, 6}, {-2, -4, 6, 8, 9, 5}}));
        System.out.println();
        System.out.println(verticalSum(new int[][]{{1, 2}, {-2, 5}, {1,6}, {1, 4}, {1, 1}, {5, 1, 4, 7}}));
        System.out.println();

        spiralFillArray(new int[][]{{1, 2, 3, 4}, {5, 6, 7}, {8, 9, 8, 7, 6, 5, 4}, {3}});
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
        int sum = 0;
        for (int i = 0; i < array2D.length; i++) {
            if (array2D[i].length < 2) {
                return -1;
            }
            sum += array2D[i][1];
        }
        return sum;
        }

    public static void spiralFillArray(int[][] incomingArr) {
        int quantity = 0;
        for (int i = 0; i < incomingArr.length; i++) {
            quantity += incomingArr[i].length;
            }

        int size = (int) (Math.ceil(Math.sqrt(quantity)));
        int[] interimArr = new int[quantity];
        int firstCounter = 0;
        for (int i = 0; i < incomingArr.length; i++) {
            for (int j = 0; j < incomingArr[i].length; j++) {
                interimArr[firstCounter] = incomingArr[i][j];
                firstCounter++;
            }
        }
        int[][] squareArr = new int[size][size];
        int counter = 0;
        for (int k = 0; k <= squareArr.length / 2; k++) {
            for (int j = k; j < squareArr.length - k; j++) {
                if (counter == interimArr.length) {
                    break;
                }
                squareArr[k][j] = interimArr[counter];
                counter++;
            }
            for (int i = k + 1; i < squareArr.length - k; i++) {
                if (counter == interimArr.length) {
                    break;
                }
                squareArr[i][squareArr.length - 1 - k] = interimArr[counter];
                counter++;
            }
            for (int j = squareArr.length - 1 - k - 1; j >= k; j--) {
                if (counter == interimArr.length) {
                    break;
                }
                squareArr[squareArr.length - 1 - k][j] = interimArr[counter];
                counter++;
            }
            for (int i = squareArr.length - 1 - k - 1; i > k; i--) {
                if (counter == interimArr.length) {
                    break;
                }
                squareArr[i][k] = interimArr[counter];
                counter++;
            }
        }
        for (int i = 0; i < squareArr.length; i++) {
            for (int j = 0; j < squareArr.length; j++) {
                System.out.print(squareArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


