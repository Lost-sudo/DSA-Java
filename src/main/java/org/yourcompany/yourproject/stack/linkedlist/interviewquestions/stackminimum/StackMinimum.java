package org.yourcompany.yourproject.stack.linkedlist.interviewquestions.stackminimum;

public class StackMinimum {

    Node top; // Top of the main stack
    Node min; // Top of the minimum stack

    // Constructor to initialize the stack
    public StackMinimum() {
        top = null; // Main stack is initially empty
        min = null; // Minimum stack is initially empty
    }

    // Returns the minimum value in the stack
    public int min() {
        return min.value; // Top of the min stack holds the smallest value
    }

    // Push a value onto the stack
    public void push(int value) {
        // Update the minimum stack
        if (min == null) {
            min = new Node(value, min); // If empty, first value is the minimum
        } else if (min.value < value) {
            min = new Node(min.value, min); // Keep the current minimum
        } else {
            min = new Node(value, min); // Update the minimum with the new value
        }

        // Push the value onto the main stack
        top = new Node(value, top);
    }

    // Pop a value off the stack
    public int pop() {
        // Remove the top of the minimum stack
        min = min.next;

        // Remove and retrieve the top value from the main stack
        int result = top.value;
        top = top.next;

        return result;
    }
}
