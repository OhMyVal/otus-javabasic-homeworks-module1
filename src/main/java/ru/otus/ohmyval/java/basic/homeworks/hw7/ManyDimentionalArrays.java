package ru.otus.ohmyval.java.basic.homeworks.hw7;

public class ManyDimentionalArrays {
    public static void main(String[] args) {

        System.out.println(sumOfPositiveElements(new int[][]{{1,3,-5,6},{-2,-4,6,8,9}}));
        System.out.println();

    }

    public static int sumOfPositiveElements(int[][] arr2D){
        int sum = 0;
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                if (arr2D[i][j] > 0){
                    sum += arr2D[i][j];
                    }
                }
            }
        return sum;
    }


}
