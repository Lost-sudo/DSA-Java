package org.yourcompany.yourproject.circularlinkedlist;

public class CSLL {

    public Node head; // Points to the first node in the list
    public Node tail; // Points to the last node in the list
    public int size;  // Tracks the size of the list

    // Creates a new Circular Linked List with a single node
    public Node createCLL(int nodeValue) {
        head = new Node(); // Create the head node
        Node node = new Node(); // Create a new node
        node.value = nodeValue; // Set the value of the node
        node.next = node; // Point the node to itself (circular reference)
        head = node; // Head and tail point to the new node
        tail = node;
        size = 1; // Set size to 1 as we have one node
        return head; // Return the head node
    }

    // Inserts a node at a specific location
    public void insertCSLL(int nodeValue, int location) {
        Node node = new Node(); // Create a new node
        node.value = nodeValue; // Set the value of the node
        if (head == null) { // If list is empty, create a new one
            createCLL(nodeValue);
            return;
        } else if (location == 0) { // Insert at the beginning
            node.next = head; // Link the new node to the head
            head = node; // Update the head
            tail.next = head; // Maintain circular connection
        } else if (location >= size) { // Insert at the end
            tail.next = node; // Link the current tail to the new node
            tail = node; // Update the tail
            tail.next = head; // Maintain circular connection
        } else { // Insert at a specific position
            Node tempNode = head; // Start from the head
            int index = 0;
            while (index < location - 1) { // Traverse to the desired location
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next; // Point new node to the next node
            tempNode.next = node; // Link the previous node to the new node
        }
        size++; // Increment the size
    }

    // Traverses the Circular Singly Linked List and prints its elements
    public void traverseCSLL() {
        if (head != null) { // If the list exists
            Node tempNode = head; // Start from the head
            for (int i = 0; i < size; i++) { // Loop through all nodes
                System.out.print(tempNode.value); // Print the value
                if (i != size - 1) { // Add arrow for separation
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next; // Move to the next node
            }
        } else {
            System.out.println("CSSL does not exist");
        }
        System.out.println(); // Add a newline
    }

    // Searches for a node with a given value
    public boolean seachNode(int nodeValue) {
        if (head != null) { // If the list exists
            Node tempNode = head; // Start from the head
            for (int i = 0; i < size; i++) { // Loop through all nodes
                if (tempNode.value == nodeValue) { // If value matches
                    System.out.println("Found node at location: " + i);
                    return true; // Value found
                }
                tempNode = tempNode.next; // Move to the next node
            }
        } else {
            System.out.println("CSLL does not exist.");
            return false; // Value not found
        }
        System.out.println("The value does not exist in the CSLL");
        return false; // Value not found
    }

    // Deletes a node at a specific location
    public void deleteNode(int location) {
        if (head == null) { // If the list doesn't exist
            System.out.println("The CSLL does not exist!");
        } else if (location == 0) { // Delete the first node
            head = head.next; // Move head to the next node
            tail.next = head; // Maintain circular connection
            size--;
            if (size == 0) { // If list is now empty
                tail = null;
                head = null;
            }
        } else if (location >= size) { // Delete the last node
            Node tempNode = head; // Start from the head
            for (int i = 0; i < size - 1; i++) { // Traverse to the second last node
                tempNode = tempNode.next;
            }
            if (tempNode == head) { // If there's only one node
                head.next = null;
                tail = head = null; // Clear the list
                return;
            }
            tempNode.next = head; // Link second last node to the head
            tail = tempNode; // Update tail
            size--;
        } else { // Delete a node in the middle
            Node tempNode = head; // Start from the head
            for (int i = 0; i < location - 1; i++) { // Traverse to the previous node
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next; // Bypass the node to delete
            size--;
        }
    }

    // Delete Entire CSLL
    public void deleteCSLL() {
        if (head == null) { // Checks if head is null
            System.out.println("CSLL does exist."); // If head is null, it prints this message
        } else {
            head = null; // Sets head to null
            tail.next = null; // Removes the circular reference
            tail = null; // Sets tail to null
            System.out.println("CSLL successfully deleted."); // Confirms that the CSLL has been deleted.
            size = 0;
        }
    }
}
