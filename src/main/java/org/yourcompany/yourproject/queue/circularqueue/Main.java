package org.yourcompany.yourproject.queue.circularqueue;

public class Main {
    public static void main(String[] args) {
        Queue newQueue = new Queue(3);
        newQueue.enQueue(1);
        newQueue.enQueue(2);
        newQueue.enQueue(3);
        System.out.println(newQueue.deQueue());
        System.out.println(newQueue.deQueue());
        System.out.println(newQueue.peek());
        newQueue.enQueue(4);
        newQueue.enQueue(5);
        newQueue.enQueue(6);
        System.out.println(newQueue.peek());
        System.out.println(newQueue.isEmpty());
        System.out.println(newQueue.isFull());                                                                      
        newQueue.deleteQueue();
    }
}
