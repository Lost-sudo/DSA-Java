package org.yourcompany.yourproject.stack.linkedlist.interviewquestions.stackofplates;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class SetOfStacks {

    ArrayList<Stack> stacks = new ArrayList<>(); // List of individual stacks
    public int capacity; // Capacity of each stack

    // Constructor to initialize SetOfStacks with a stack capacity
    public SetOfStacks(int capacity) {
        this.capacity = capacity;
    }

    // Helper method to get the last stack in the list
    public Stack getLastStack() {
        if (stacks.isEmpty()) {
            return null; // Return null if there are no stacks
        }
        return stacks.get(stacks.size() - 1); // Return the last stack
    }

    // Pushes a value onto the SetOfStacks
    public void push(int v) {
        Stack last = getLastStack(); // Get the last stack
        if (last != null && !last.isFull()) {
            last.push(v); // Add to the last stack if it's not full
        } else {
            Stack stack = new Stack(capacity); // Create a new stack
            stack.push(v); // Push the value onto the new stack
            stacks.add(stack); // Add the new stack to the list
        }
    }

    // Pops a value from the SetOfStacks
    public int pop() {
        Stack last = getLastStack(); // Get the last stack
        if (last == null) {
            throw new EmptyStackException(); // Handle empty case

        }
        int result = last.pop(); // Pop the value from the last stack
        if (last.size == 0) {
            stacks.remove(stacks.size() - 1); // Remove the stack if it's empty
        }
        return result; // Return the popped value
    }

    // Helper method to shift items between stacks
    public int leftShift(int index, boolean removeTop) {
        Stack stack = stacks.get(index); // Get the stack at the specified index
        int removeItem;
        if (removeTop) {
            removeItem = stack.pop(); // Remove the top item
        } else {
            removeItem = stack.removeBottom(); // Remove the bottom item
        }

        if (stack.size == 0) {
            stacks.remove(index); // Remove empty stacks
        } else if (stacks.size() > index + 1) {
            int v = leftShift(index + 1, false); // Recursively shift items
            stack.push(v); // Push the shifted item onto the current stack
        }
        return removeItem; // Return the removed item
    }

    // Pops a value from a specific stack in the SetOfStacks
    public int popAt(int index) {
        return leftShift(index, true); // Delegate to leftShift with removeTop=true
    }
}
