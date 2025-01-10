package org.yourcompany.yourproject.queue.linkedlist;

public class Queue {
    SinglyLinkedList list;

    public Queue() {
        list = new SinglyLinkedList();
        System.out.println("Queue was created");
    }

    // isEmpty
    public boolean isEmpty() {
        return list.head == null;
    }

    // enQueue
    public void enQueue(int value) {
        list.insertInLinkedList(value);
        System.out.println("Inserted " + value + " in Queue");
    }

    // deQueue
    public int deQueue() {
        int value = -1;
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            value = list.head.value;
            list.deleteOfNode();
        }
        return value;
    }

    // peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        } else {
            return list.head.value;
        }
    }

    // deleteQueue
    public void deleteQueue() {
        list.deleteSLL();
        System.out.println("Queue was deleted");
    }
}
