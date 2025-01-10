package org.yourcompany.yourproject.stack.linkedlist.interviewquestions.stackminimum;

public class Main {
    public static void main(String[] args) {
        StackMinimum newStack = new StackMinimum();
        newStack.push(3);
        newStack.push(2);
        newStack.push(5);
        newStack.push(1);
        System.out.println(newStack.min());
        newStack.pop();
        System.out.println(newStack.min());
    }
}
