package org.yourcompany.yourproject.stack.linkedlist.interviewquestions.stackofplates;

import java.util.EmptyStackException;

public class Stack {

    private final int capacity; // Maximum number of items this stack can hold
    public StackNode top;       // Points to the top node in the stack
    public StackNode bottom;    // Points to the bottom node in the stack
    public int size = 0;        // Tracks the current size of the stack

    // Constructor to create a stack with a specified capacity
    public Stack(int capacity) {
        this.capacity = capacity;
    }

    // Checks if the stack is full
    public boolean isFull() {
        return capacity == size; // Returns true if the current size equals the capacity
    }

    // Helper method to link two nodes (above and below)
    public void join(StackNode above, StackNode below) {
        if (below != null) {
            below.above = above; // Set the below node's above reference
        }
        if (above != null) {
            above.below = below; // Set the above node's below reference
        }
    }

    // Pushes a new value onto the stack
    public boolean push(int value) {
        if (size >= capacity) {
            return false; // Prevent adding items beyond the stack's capacity
        }
        size++; // Increment the stack size
        StackNode newNode = new StackNode(value); // Create a new node for the value
        if (size == 1) {
            bottom = newNode; // If it's the first node, set it as the bottom

        }
        join(newNode, top); // Link the new node to the current top
        top = newNode; // Update the top reference
        return true; // Indicate success
    }

    // Pops the value from the top of the stack
    public int pop() {
        if (top == null) {
            throw new EmptyStackException(); // Handle empty stack case
        }
        int result = top.value; // Get the value of the top node
        top = top.below; // Move the top reference down
        size--; // Decrement the size
        return result; // Return the removed value
    }

    // Removes and returns the value from the bottom of the stack
    public int removeBottom() {
        StackNode oldBottom = bottom; // Save the current bottom node
        bottom = bottom.above; // Update the bottom to the node above it
        if (bottom != null) {
            bottom.below = null; // Unlink the old bottom

        }
        size--; // Decrement the size
        return oldBottom.value; // Return the removed value
    }
}
