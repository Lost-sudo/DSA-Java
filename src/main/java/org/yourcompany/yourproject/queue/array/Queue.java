package org.yourcompany.yourproject.queue.array;

public class Queue {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public Queue(int size) {
        arr = new int[size];
        topOfQueue = -1;
        beginningOfQueue = -1;
        System.out.println("The Queue has been created with size " + size);
    }

    public boolean isFull() {
        return topOfQueue == arr.length -1;
    }

    public boolean isEmpty() {
        return beginningOfQueue == -1 || beginningOfQueue == arr.length;
    }

    // enQueue
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("The Queue is full");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("The value " + value + " is successfully inserted in the Queue.");
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("The value " + value + " is successfully inserted in the Queue.");
        }
    }

    // deQueue
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("The Queue is empty");
            return Integer.MIN_VALUE;
        } else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > topOfQueue) {
                beginningOfQueue = topOfQueue = -1;
            }
            return result;
        }
    }

    // Traverse
    public void traverseQueue() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[beginningOfQueue];
        } else {
            System.out.println("The Queue is empty!");
            return -1;
        }
    }

    // Delete Queue
    public void deleteQueue() {
        arr = null;
        System.out.println("The Queue has been deleted successfully!");
    }
}
