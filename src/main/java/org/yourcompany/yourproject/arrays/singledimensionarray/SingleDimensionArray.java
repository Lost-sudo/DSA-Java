package org.yourcompany.yourproject.arrays.singledimensionarray;

public class SingleDimensionArray {

    int arr[] = null;

    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("Sucessfully inserted!");
            } else {
                System.out.println("This cell is already occupied!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");
        }
    }

    // Array Traversal
    public void traverseArray() {
        try {
            System.out.println("Array Traversal: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Array no longer exist");
        }
        System.out.println();
    }

    // Search for an element in the given Array
    public void searchInArray(int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearch) {
                System.out.println("Value is found at the index of " + i);
                return;
            }
        }
        System.out.println(valueToSearch + " is not found.");
    }

    // Delete value from Array
    public void deleteValue(int valueToDelete) {
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == valueToDelete) {
                    arr[i] = Integer.MIN_VALUE;
                    System.out.println("The value has been deleted sucessfully.");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value that is provided is not in range of Array.");
        }
    }
}
