package org.yourcompany.yourproject.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDLL(1);
        dll.insertDLL(2, 1);
        dll.insertDLL(3, 2);
        dll.traverseDLL();
        dll.reverseTraverseDLL();
        dll.searchNode(2);
        dll.searchNode(5);
        dll.deleteNodeDLL(3);
        dll.traverseDLL();
        dll.deleteDLL();
        dll.traverseDLL();
    }
}
