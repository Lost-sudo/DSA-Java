package org.yourcompany.yourproject.linkedlist.crackinginterviewquestion;

public class LinkedList {

    public Node head;
    public Node tail;
    public int size;

    public void createLinkedList(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        head = newNode;
        tail = newNode;
        size = 1;
    }

    public void insertNode(int nodeValue) {
        if (head == null) {
            createLinkedList(nodeValue);
            return;
        }
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void traverseLinkedList() {
        if (head == null) {
            System.out.println("The LinkedList does not exist!");
        } else {
            Node currentNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(currentNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                currentNode = currentNode.next;
            }

        }
    }
}
