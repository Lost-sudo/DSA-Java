package org.yourcompany.yourproject.circulardoublylinkedlist;

public class CircularDoublyLL {
    public CircularDoublyNode head;
    public CircularDoublyNode tail;
    public int size;

    // Create DLL
    CircularDoublyNode createDLL(int nodeValue) {
        head = new CircularDoublyNode();
        CircularDoublyNode newNode = new CircularDoublyNode();
        newNode.value = nodeValue;
        head = newNode;
        tail = newNode;
        newNode.next = newNode;
        newNode.prev = newNode;
        size = 1;
        return head;
    }

    // Insertion Method
    public void insertCDLL(int nodeValue, int location) {
        CircularDoublyNode newNode = new CircularDoublyNode();
        newNode.value = nodeValue;
        if (head == null) {
            createDLL(nodeValue);
            return;
        } else if(location == 0) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            tail = newNode;
        } else {
            CircularDoublyNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }

    // Traversal Method
    public void traverseCDLL() {
        if (head != null) {
            CircularDoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        } else {
            System.out.println("The CDLL does not exist.");
        }
        System.out.println();
    }

    // Reverse Traversal Method
    public void reverseTraverseCDLL() {
        if (head != null) {
            CircularDoublyNode tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" <- ");
                }
                tempNode = tempNode.prev;
            }
        } else {
            System.out.println("The CDLL does not exist.");
        }
        System.out.println();
    }

    // Search Method
    public boolean searchNode(int nodeValue) {
        if (head != null) {
            CircularDoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("The Node is found at location: " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        } else {
            System.out.println("The CDLL does not exist.");
            return false;
        }
        System.out.println("The node is not found in the CDLL.");
        return false;
    }

    // Delete Method
    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("The CDLL does not exist!");
            return;
        } else if (location == 0) {
            if (size == 1) {
                head = tail = null;
                size--;
                return;
            } else {
                head = head.next;
                head.prev = tail;
                tail.next = head;
                size--;
            }
        } else if (location >= size) {
            if (size == 1) {
                head = tail = null;
                size--;
                return;
            } else {
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
                size--;
            }
        } else {
            CircularDoublyNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }

    // Delete Entire Node
    public void deleteCDLL() {
        head = null;
        tail = null;
        size = 0;
        System.out.println("The CDLL has been successfully deleted.");
    }
}
