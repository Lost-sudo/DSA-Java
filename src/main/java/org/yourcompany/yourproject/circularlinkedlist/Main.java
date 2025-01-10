package org.yourcompany.yourproject.circularlinkedlist;

public class Main {

    public static void main(String[] args) {
        CSLL csll = new CSLL(); // Create a new CSLL instance
        csll.createCLL(5); // Create the list with initial value 5
        csll.insertCSLL(4, 0); // Insert value 4 at the beginning
        csll.insertCSLL(3, 1); // Insert value 3 at position 1
        csll.insertCSLL(2, 2); // Insert value 2 at position 2
        System.out.println(csll.head.value); // Print the value of the head node
        csll.traverseCSLL(); // Print the entire list
        csll.seachNode(4); // Search for the value 4 in the list
        csll.deleteNode(4); // Attempt to delete the node at position 4
        csll.traverseCSLL(); // Print the updated list
        csll.deleteCSLL(); // Delete entirely the CSLL
        csll.traverseCSLL(); // Print the entire list, in this case, the CSLL does not exist.
    }
}
