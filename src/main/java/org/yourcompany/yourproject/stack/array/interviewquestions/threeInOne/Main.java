package org.yourcompany.yourproject.stack.array.interviewquestions.threeInOne;

public class Main {
    public static void main(String[] args) {
        ThreeInOne newStack = new ThreeInOne(3);
        newStack.push(0, 1);
        newStack.push(0, 2);
        newStack.push(0, 3);
        newStack.push(1, 4);
        newStack.push(1, 5);
        newStack.push(1, 6);
        newStack.push(2, 7);
        newStack.push(2, 8);
        newStack.push(2, 9);
        newStack.traverseStack(0);
        newStack.traverseStack(1);
        newStack.traverseStack(2);
        // newStack.traverseAllStacks();
        System.out.println(newStack.pop(0));
        System.out.println(newStack.pop(1));
        System.out.println(newStack.pop(2));
        newStack.traverseStack(0);
        newStack.traverseStack(1);
        newStack.traverseStack(2);
        System.out.println(newStack.peek(0));
        System.out.println(newStack.peek(1));
        System.out.println(newStack.peek(2));
    }
}
