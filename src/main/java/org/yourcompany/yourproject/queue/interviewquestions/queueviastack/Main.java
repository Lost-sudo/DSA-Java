package org.yourcompany.yourproject.queue.interviewquestions.queueviastack;

public class Main {
    public static void main(String[] args) {
        QueueViaStack newQueue = new QueueViaStack();
        newQueue.enqueue(1);
        newQueue.enqueue(2);
        newQueue.enqueue(3);
        System.out.println(newQueue.dequeue());
    }
}