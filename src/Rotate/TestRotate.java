package Rotate;

public class TestRotate {
    public static void main(String[] args) {
        DoublyLinkedList theList = new DoublyLinkedList(); //make a new list

        theList.insertFirst(22); //insert at front
        theList.insertFirst(44);
        theList.insertFirst(66);

        theList.insertLast(11); //insert at rear
        theList.insertLast(33);
        theList.insertLast(55);

        theList.displayForward(); //display list forward
        theList.displayBackward(); //display list backward

        System.out.println("Deleting first, last, and 11");
        theList.deleteFirst(); //remove first item
        theList.deleteLast(); //remove last item
        theList.deleteKey(11); //remove item with key 11
        theList.displayForward(); //display list forward

        System.out.println("Inserting 77 after 22, and 88 after 33");
        theList.insertAfter(22, 77); //insert 77 after 22
        theList.insertAfter(33, 88); //insert 88 after 33
        theList.displayForward(); //display list forward

        //Testing reverse and rotate functions
        System.out.println("\nTesting Rotate and Reverse Functions");
        DoublyLinkedList testList = new DoublyLinkedList();
        testList.insertFirst(55);
        testList.insertFirst(33);
        testList.insertFirst(11);
        testList.insertFirst(22);
        testList.insertFirst(44);
        testList.insertFirst(66);
        testList.displayForward();

        System.out.println("rotateList()");
        testList.rotateList();
        testList.displayForward();

        System.out.println("rotateList()");
        testList.rotateList();
        testList.displayForward();

        System.out.println("reverseList()");
        testList.reverseList();
        testList.displayForward();

        System.out.println("reverseList()");
        testList.reverseList();
        testList.displayForward();
    } //end main()
}