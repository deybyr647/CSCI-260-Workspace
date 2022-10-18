package Prog5_2B_PriorityQueueDLL;

public class PQDoublyLinkedTest {
    public static void main(String[] args) {                             // make a new list
        DoublyLinkedList theList = new DoublyLinkedList();

        theList.priorityInsert(22);      // insert at front
        theList.priorityInsert(44);
        theList.priorityInsert(66);
        theList.priorityInsert(11);       // insert at rear
        theList.priorityInsert(33);
        theList.priorityInsert(55);

        theList.priorityInsert(10);
        theList.priorityInsert(70);
        theList.priorityInsert(30);
        theList.displayForward();     // display list forward

        Link_D removed = theList.priorityRemove();
        System.out.print("priorityRemove() returned node with key: ");
        removed.displayLink_D();
        System.out.println();
        theList.displayForward();

    }
}
