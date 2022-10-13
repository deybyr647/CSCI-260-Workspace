package Prog5_1_LinkedList;

/*
    Deyby Rodriguez
    1291202
    Data Structures
    CSCI 260 M01
*/

public class Prog5_1 {
    public static void main(String[] args) {
        LinkList theList = new LinkList();  // make new list
        theList.insertFirst(2);      // insert four items
        theList.insertFirst(7);
        theList.insertFirst(3);
        theList.insertFirst(7);
        theList.insertFirst(4);
        theList.insertFirst(7);
        theList.insertFirst(3);
        theList.insertFirst(1);
        theList.displayList();              // display list

        System.out.println("theList.removeLast(7)");
        theList.removeLast(7);
        theList.displayList();

        System.out.println("\ntheList.removeAll(7)");
        theList.removeAll(7);
        theList.displayList();
    }
}