package org.yourcompany.yourproject.stack.array;

public class Stack {
    int[] arr;
    int topOfStack;

    public Stack(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The Stack is created with size of: " + size);
    }

    // isEmpty
    public boolean isEmpty() {
        return topOfStack == -1;
    }

    // isFull 
    public boolean isFull() {
        return topOfStack == arr.length - 1;
    }

    // Push
    public void push(int value) {
        if (isFull()) {
            System.out.println("The stack is full.");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("The value is succesfully inserted.");
        }
    }

    // Pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty!");
            return Integer.MIN_VALUE;
        } else {
            int topStack = arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }

    // Peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("The Stack is empty!");
            return Integer.MIN_VALUE;
        } else {
            return arr[topOfStack];
        }
    }

    // Delete
    public void deleteStack() {
        arr = null;
        System.out.println("The Stack is successfully deleted.");
    }
}
