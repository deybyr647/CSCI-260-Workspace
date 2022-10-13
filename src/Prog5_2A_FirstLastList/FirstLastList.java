package Prog5_2A_FirstLastList;

/*
    Deyby Rodriguez
    1291202
    Data Structures
    CSCI 260 M01
*/

public class FirstLastList {
    private Link first;
    private Link last;

    public FirstLastList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int dd) {
        Link newLink = new Link(dd);
        if(isEmpty()) {
            first = newLink;
        }
        else {
            last.next = newLink;
        }

        last = newLink;
    }

    public void insertLast(int dd) {
        Link newLink = new Link(dd);

        if(isEmpty()) {
            first = newLink;
        }
        else {
            last.next = newLink;
        }

        last = newLink;
    }

    public Link deleteFirst() {
        Link temp = first;

        if(first.next == null) {
            last = null;
        }

        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.print("List (first --> last): ");

        Link current = first;
        while(current != null) {
            current.displayLink();
            current = current.next;
        }

        System.out.println();
    }

    public Link getFirst() {
        return first;
    }

    public Link getLast() {
        return last;
    }

    public int getSize() {
        int size = 0;

        Link current = first;
        while(current != null) {
            size++;
            current = current.next;
        }

        return size;
    }

    public void join(FirstLastList SecondList) {
        Link newLink = SecondList.getFirst();

        while(newLink != null) {
            insertLast(newLink.iData);
            SecondList.deleteFirst();
            newLink = SecondList.getFirst();
        }
    }

    public void swap() {
        if(getSize() < 2) {
            System.out.println("List contains less than 2 elements");
            return;
        }

        int firstLinkData = getFirst().iData;
        int lastLinkData = getLast().iData;

        first.iData = lastLinkData;
        last.iData = firstLinkData;
    }
}
