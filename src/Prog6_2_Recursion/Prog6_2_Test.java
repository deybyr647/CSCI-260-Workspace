package Prog6_2_Recursion;

public class Prog6_2_Test {
    public static void main(String[] args) {
        LinkList theList = new LinkList(); //make new list
        theList.insertFirst(22); //insert four items
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertFirst(88);
        theList.insertFirst(44);
        theList.insertFirst(11);
        theList.insertFirst(44);
        theList.recPrint(); //display list

        System.out.println("\nList length = " + theList.recGetLength());

        System.out.println("\nrecReversePrint:");
        theList.recReversePrint();

        System.out.println("\n\nrecSearchFor(45)");
        theList.recSearchFor(45);
        theList.displayList();

        System.out.println("\nrecRemoveFirst 44");
        theList.recRemoveFirst(44);
        theList.displayList();

        System.out.println("\nrecRemove all 44");
        theList.recRemoveAll(44);
        theList.displayList();
    }
}
