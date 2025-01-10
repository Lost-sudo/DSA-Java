package org.yourcompany.yourproject.stack.linkedlist.interviewquestions.stackofplates;

public class StackNode {

    public StackNode above; // Points to the node directly above in the stack
    public StackNode below; // Points to the node directly below in the stack
    public int value;       // Holds the value stored in this node

    // Constructor to initialize a StackNode with a specific value
    public StackNode(int value) {
        this.value = value;
    }
}
