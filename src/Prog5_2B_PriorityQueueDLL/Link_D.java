package Prog5_2B_PriorityQueueDLL;

/*
    Deyby Rodriguez
    1291202
    Data Structures
    CSCI 260 M01
*/

public class Link_D {
    public long dData;
    public Link_D next;
    public Link_D previous;

    public Link_D(long d) {
        dData = d;
    }

    public void displayLink_D() {
        System.out.print(dData + " ");
    }
}
