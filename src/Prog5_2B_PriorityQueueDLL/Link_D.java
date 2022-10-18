package Prog5_2B_PriorityQueueDLL;

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
