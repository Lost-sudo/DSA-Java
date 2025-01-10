package org.yourcompany.yourproject.arrays.samples;

import java.util.Arrays;

public class BestScore {
    public static void main(String[] args) {
        int[] myArray = {84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0};
        int[] topTwo = findTopTwoScores(myArray);
        System.out.println(Arrays.toString(topTwo));
    }

    public static int[] findTopTwoScores(int[] array) {
        int first = 0;
        int second = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > first) {
                second = first;
                first = array[i];
            } else if (second > first && first < second) {
                first = second;
                second = first;
            }
        }
        return new int[]{first, second};
    }
}
