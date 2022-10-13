package Prog5_2A_FirstLastList;

/*
    Deyby Rodriguez
    1291202
    Data Structures
    CSCI 260 M01
*/

public class Link {
    public int iData;
    public Link next;

    public Link(int id) {
        iData = id;
    }

    public void displayLink() {
        System.out.print("{" + iData + "} ");
    }
}
