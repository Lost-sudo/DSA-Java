package org.yourcompany.yourproject.linkedlist.crackinginterviewquestion;

// import javax.xml.namespace.QName;

public class Main {

    public static void main(String[] args) {
        LinkedList newLinkedListA = new LinkedList();
        LinkedList newLinkedListB = new LinkedList();
        Questions newQuestions = new Questions();
        // newLinkedList.createLinkedList(1);
        // newLinkedList.insertNode(2);
        // newLinkedList.insertNode(3);
        // newLinkedList.insertNode(4);
        // newLinkedList.insertNode(3);
        // newLinkedList.insertNode(5);
        // newQuestions.deleteDups(newLinkedList);
        // newLinkedList.traverseLinkedList();
        // Node n = newQuestions.nthToLast(newLinkedList, 4);
        // System.out.println();
        // System.out.println(n.value);
        // LinkedList t = newQuestions.partition(newLinkedList, 3);
        // t.traverseLinkedList();

        newLinkedListA.insertNode(7);
        newLinkedListA.insertNode(1);
        newLinkedListA.insertNode(6);

        newLinkedListB.insertNode(5);
        newLinkedListB.insertNode(9);
        newLinkedListB.insertNode(2);
        // LinkedList sumList = newQuestions.sumList(newLinkedListA, newLinkedListB);
        // sumList.traverseLinkedList();
        newQuestions.addSameNode(newLinkedListA, newLinkedListB, 7);
        newQuestions.addSameNode(newLinkedListA, newLinkedListB, 2);
        newQuestions.addSameNode(newLinkedListA, newLinkedListB, 1);
        Node inter = newQuestions.findIntersection(newLinkedListA, newLinkedListB);
        System.out.println(inter.value);
    }
}
