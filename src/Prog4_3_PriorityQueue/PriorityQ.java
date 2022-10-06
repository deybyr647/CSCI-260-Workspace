package Prog4_3_PriorityQueue;

/*
    Deyby Rodriguez
    1291202
    Data Structures
    CSCI 260 M01
*/

public class PriorityQ {
    private final int maxSize;
    private final CustomerOrder[] queueArray;
    private int nItems;

    public PriorityQ(int size) {
        maxSize = size;
        queueArray = new CustomerOrder[maxSize];
        nItems = 0;
    }

    public void insert(CustomerOrder order) {
        int j;

        if(nItems == 0) {
            queueArray[nItems++] = order;
        }
        else {
            for(j = nItems - 1; j >= 0; j--) {
                if (order.getOrderID() > queueArray[j].getOrderID()) {
                    queueArray[j + 1] = queueArray[j];
                }
                else {
                    break;
                }
            }

            queueArray[j + 1] = order;
            nItems++;
        }
    }

    public CustomerOrder remove() {
        return queueArray[--nItems];
    }

    public CustomerOrder peekMin() {
        return queueArray[nItems-1];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }
}
