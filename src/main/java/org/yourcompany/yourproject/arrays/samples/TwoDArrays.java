package org.yourcompany.yourproject.arrays.samples;

public class TwoDArrays {
    public static void main(String[] args) {
        int[][] my2DArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = sumDiagonalElements(my2DArray);
        System.out.println(sum);
    }

    public static int sumDiagonalElements(int[][] array) {
        int sum = 0;
        for (int[] array1 : array) {
            sum += array1[1];
        }
        return sum;
    }
}
