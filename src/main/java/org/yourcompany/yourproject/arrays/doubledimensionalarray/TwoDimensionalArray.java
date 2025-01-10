package org.yourcompany.yourproject.arrays.doubledimensionalarray;

public class TwoDimensionalArray {
    int arr[][] = null;

    public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
        this.arr = new int[numberOfRows][numberOfColumns];
        for (int[] row : arr) {
            for (int col = 0; col < arr[0].length; col++) {
                row[col] = 0;
            }
        }
    }

    // Inserting value in the Array
    public void insertValueInTheArray(int row, int col, int value) {
        try {
            if (arr[row][col] == 0) {
                arr[row][col] = value;
                System.out.println("The value is succesfully inserted.");
            } else {
                System.out.println("This cell is already occupied.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D Array");
        }
    }

    // Accessing cell value from given array
    public void accessCell(int row, int col) {
        System.out.println("\nAccessing Row: " + row + ", Col: " + col);
        try {
            System.out.println("Cell value is: " + arr[row][col]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D Array");
        }
    }

    // Traversing 2D Array
    public void traverse2DArray() {
        for (int[] row : arr) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(row[col] + " ");
            }
            System.out.println();
        }
    }

    // Searching value in 2D Array
    public void searchValue2DArray(int valueToSearch) {
        try {
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[0].length; col++) {
                    if (arr[row][col] == valueToSearch) {
                        System.out.println("Value was found at index: " + row + " " + col);
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Data don't exist in 2D Array.");
        }
    }

    // Deleting value in 2D Array
    public void deleteValue2DArray(int valueToDelete) {
        for (int[] arr1 : arr) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr1[col] == valueToDelete) {
                    arr1[col] = 0;
                    System.out.println("Value is deleted successfully");
                }
            }
        }
    }
}
