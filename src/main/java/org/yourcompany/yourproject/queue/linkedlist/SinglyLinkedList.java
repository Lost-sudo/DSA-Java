package org.yourcompany.yourproject.queue.linkedlist;

public class SinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertInLinkedList(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else {
            node.next = null;
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void traverseSinglyLinkedList() {
        if (head == null) {
            System.out.println("The Singly Linked List does not exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    public boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Found a node at location " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found!");
        return false;
    }

    public void deleteOfNode() {
        if (head == null) {
            System.out.println("The SLL does not exist");
        } else {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
        }
    }

    public void deleteSLL() {
        head = null;
        tail = null;
        System.out.println("The SLL deleted succesfully");
    }
}
