package org.yourcompany.yourproject.arrays.crackinginterviews.reversearray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] myArray = {1, 2, 3, 4, 5};
        main.reverseArray(myArray);
    }

    void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int other = array.length-i-1;
            int temp = array[i];

            array[i] = array[other];
            array[other] = temp;

        }
        System.out.println(Arrays.toString(array));
    }
}
