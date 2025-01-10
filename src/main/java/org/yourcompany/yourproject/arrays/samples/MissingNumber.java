package org.yourcompany.yourproject.arrays.samples;

public class MissingNumber {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 7};
        int result = findMissingNumber(myArray);
        System.out.println(result);
    }
    
    static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int expectedSum = (n * (n+1)) / 2;
        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        return expectedSum - actualSum;
    }
}
