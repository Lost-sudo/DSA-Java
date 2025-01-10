package org.yourcompany.yourproject.doublylinkedlist;

public class DoublyLinkedList {
    Doubly head;
    Doubly tail;
    int size;

    public Doubly createDLL(int nodeValue) {
        head = new Doubly();
        Doubly newNode = new Doubly();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }

// Insertion Method for Doubly Linked List (DLL)
    public void insertDLL(int nodeValue, int location) {
        // Step 1: Create a new node to be inserted.
        Doubly newNode = new Doubly();
        newNode.value = nodeValue;  // Set the value of the new node.

        // Step 2: Handle the case when the list is empty.
        if (head == null) {
            createDLL(nodeValue);  // Call a method to create a new DLL if it's empty.
            return;  // Exit the method once the node is inserted.
        } // Step 3: Insert the new node at the beginning (location = 0).
        else if (location == 0) {
            newNode.next = head;  // Point the new node's next to the current head.
            newNode.prev = null;  // Set the previous pointer of the new node to null.
            head.prev = newNode;  // Set the current head's previous pointer to the new node.
            head = newNode;  // Update the head to point to the new node.
        } // Step 4: Insert the new node at the end (location >= size).
        else if (location >= size) {
            newNode.next = null;  // Set the new node's next pointer to null (it's the new tail).
            tail.next = newNode;  // Set the current tail's next to the new node.
            newNode.prev = tail;  // Set the new node's previous pointer to the current tail.
            tail = newNode;  // Update the tail to point to the new node.
        } // Step 5: Insert the new node at a specific location in the middle.
        else {
            Doubly tempNode = head;  // Start from the head to traverse the list.
            int index = 0;

            // Step 6: Traverse the list to find the node just before the desired location.
            while (index < location - 1) {
                tempNode = tempNode.next;  // Move to the next node.
                index++;  // Increment the index.
            }

            // Step 7: Update the pointers to insert the new node in the desired location.
            newNode.prev = tempNode;  // Set the new node's previous pointer to the temp node.
            newNode.next = tempNode.next;  // Set the new node's next pointer to the next of the temp node.

            tempNode.next = newNode;  // Set the temp node's next to the new node.
            newNode.next.prev = newNode;  // Set the next node's previous pointer to the new node.
        }

        size++;  // Increment the size of the list as a new node is added.
    }

    // Traversal DLL
    public void traverseDLL() {
        if (head != null) {
            Doubly tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size-1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        } else {
            System.out.println("The DLL does not exist!");
        }
        System.out.println("\n");
    }

    // Reverse Traversal DLL
    public void reverseTraverseDLL() {
        if (tail != null) {
            Doubly tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" <- ");
                }
                tempNode = tempNode.prev;
            }
        } else {
            System.out.println("The DLL does not exist!");
        }
        System.out.println("\n");
    }

    // Search Node
    public boolean searchNode(int nodeValue) {
        if (head != null) {
            Doubly tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("The value is found at location: " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("The value does not exist in the DLL!");
        return false;
    }

    // Deletion
    public void deleteNodeDLL(int location) {
        if (head == null) {
            System.out.println("The DLL does not exist!");
            return;
        } else if (location == 0) {
            if (size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            } else {
                head = head.next;
                head.prev = null;
                size--;
            }

        } else if (location >= size) {
            Doubly tempNode = tail.prev;
            if (size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            } else {
                tempNode.next = null;
                tail = tempNode;
                size--;
            }
        } else {
            Doubly tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }

    // Delete Entire DLL
    public void deleteDLL() {
        Doubly tempNode = head;
        for (int i = 0; i < size; i++) {
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("The DLL has been successfully deleted!");
    }

}
