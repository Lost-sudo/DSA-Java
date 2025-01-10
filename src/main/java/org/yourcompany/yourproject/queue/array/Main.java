package org.yourcompany.yourproject.queue.array;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        System.out.println(queue.peek());
        System.out.println(queue.isFull());
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());
        queue.traverseQueue();
        queue.deleteQueue();
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.isFull());
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());
    }
}
