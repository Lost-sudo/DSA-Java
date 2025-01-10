package org.yourcompany.yourproject.circulardoublylinkedlist;

public class Main {

    public static void main(String[] args) {
        CircularDoublyLL cdll = new CircularDoublyLL();
        cdll.createDLL(1);
        cdll.insertCDLL(2, 0);
        cdll.insertCDLL(3, 5);
        cdll.insertCDLL(4, 2);
        cdll.traverseCDLL();
        cdll.reverseTraverseCDLL();
        cdll.searchNode(4);
        cdll.deleteNode(1);
        cdll.traverseCDLL();
        cdll.reverseTraverseCDLL();
        cdll.deleteCDLL();
        cdll.traverseCDLL();
        cdll.reverseTraverseCDLL();
    }
}
