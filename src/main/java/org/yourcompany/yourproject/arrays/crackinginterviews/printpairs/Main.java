package org.yourcompany.yourproject.arrays.crackinginterviews.printpairs;

public class Main {

    public static void main(String[] args) {
        int[] customArray = {1, 3, 4, 5};
        printPairs(customArray);
    }

    static void printPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
            System.out.println();
        }
        System.out.println("Done!");
    }

}
