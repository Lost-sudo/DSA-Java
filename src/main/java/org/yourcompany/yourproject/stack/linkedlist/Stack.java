package org.yourcompany.yourproject.stack.linkedlist;

public class Stack {
    LinkedList linkedList;

    public Stack() {
        linkedList = new LinkedList();
    }

    // Push
    public void push(int value) {
        linkedList.insertInLL(value, 0);
        System.out.println("Inserted " + value + " in stack");
    }

    // isEmpty
    public boolean isEmpty() {
        return linkedList.head == null;
    }

    // Pop
    public int pop() {
        int result = -1;
        if (isEmpty()) {
            System.out.println("The Stack is empty!");
        } else {
            result = linkedList.head.value;
            linkedList.deleteOfNode(0);
        }
        return result;
    }

    // Peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("The Stack is empty!");
            return -1;
        } else {
            return linkedList.head.value;
        }
    }
    
    // Delete
    public void deleteStack() {
        linkedList.head = null;
        System.out.println("The Stack is deleted.");
    }
}
