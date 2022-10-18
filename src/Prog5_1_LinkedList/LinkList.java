package Prog5_1_LinkedList;

/*
    Deyby Rodriguez
    1291202
    Data Structures
    CSCI 260 M01
*/

class Link {
    public int iData;
    public Link next;

    public Link(int id) {
        iData = id;
    }

    public void displayLink() {
        System.out.print("{" + iData + "} ");
    }
}

public class LinkList {
    private Link first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int dd) {
        Link newLink = new Link(dd);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteFirst() {
        Link temp = first;
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

    public Link find(int key) {
        Link current = first;

        while(current.iData != key) {
            if(current.next == null) {
                return null;
            }
            else {
                current = current.next;
            }
        }

        return current;
    }

    public Link delete(int key) {
        Link current = first;
        Link previous = first;

        while(current.iData != key) {
            if(current.next == null) {
                return null;
            }
            else {
                previous = current;
                current = current.next;
            }
        }

        if(current == first) {
            first = first.next;
        }
        else {
            previous.next = current.next;
        }

        return current;
    }

    public Link removeLast(int n) {
        Link current = first;
        Link lastOccurrence = null;

        // Find last occurrence
        while (current != null) {
            if (current.iData == n) {
                lastOccurrence = current;
            }

            current = current.next;
        }

        // If the last occurrence is the last node
        if (lastOccurrence != null && lastOccurrence.next == null) {
            current = first;

            while (current.next != lastOccurrence) {
                current = current.next;
            }

            current.next = null;
        }

        // If it is not the last node
        if (lastOccurrence != null && lastOccurrence.next != null) {
            lastOccurrence.iData = lastOccurrence.next.iData;
            current = lastOccurrence.next;
            lastOccurrence.next = lastOccurrence.next.next;
        }

        return lastOccurrence;
    }

    public void removeAll(int key) {
        Link current = delete(key);

        while(current != null) {
            current = delete(key);
        }
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
}
