package Prog5_2B_PriorityQueueDLL;

/*
    Deyby Rodriguez
    1291202
    Data Structures
    CSCI 260 M01
*/

public class DoublyLinkedList {
    private Link_D first;
    private Link_D last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void priorityInsert(long key) {
        Link_D temp = first;
        Link_D lowest = first;

        if(isEmpty()) {
            insertFirst(key);
            return;
        }

        while(temp != null) {
            if(temp.dData < lowest.dData) {
                lowest = temp;
            }

            temp = temp.next;
        }

        assert lowest != null;
        insertAfter(lowest.dData, key);
    }

    public void insertFirst(long dd) {
        Link_D newLink = new Link_D(dd);

        if(isEmpty()) {
            last = newLink;
        }
        else {
            first.previous = newLink;
        }

        newLink.next = first;
        first = newLink;
    }

    public void insertLast(long dd) {
        Link_D newLink = new Link_D(dd);

        if(isEmpty()) {
            first = newLink;
        }
        else {
            last.next = newLink;
            newLink.previous = last;
        }

        last = newLink;
    }

    public Link_D priorityRemove() {
        Link_D temp = first;
        Link_D highestPriority = first;

        while(temp != null) {
            if(temp.dData > highestPriority.dData) {
                highestPriority = temp;
            }

            temp = temp.next;
        }

        assert highestPriority != null;
        deleteKey(highestPriority.dData);

        return highestPriority;
    }

    public Link_D deleteFirst() {
        Link_D temp = first;

        if(first.next == null) {
            last = null;
        }
        else {
            first.next.previous = null;
        }

        first = first.next;
        return temp;
    }

    public Link_D deleteLast() {
        Link_D temp = last;

        if(first.next == null) {
            first = null;
        }
        else {
            last.previous.next = null;
        }

        last = last.previous;
        return temp;
    }


    public boolean insertAfter(long key, long dd) {
        Link_D current = first;

        while(current.dData != key) {
            current = current.next;

            if(current == null) {
                return false;
            }
        }

        Link_D newLink = new Link_D(dd);

        if(current == last) {
            newLink.next = null;
            last = newLink;
        }
        else {
            newLink.next = current.next;
            current.next.previous = newLink;
        }

        newLink.previous = current;
        current.next = newLink;
        return true;
    }

    public Link_D deleteKey(long key) {
        Link_D current = first;

        while(current.dData != key) {
            current = current.next;

            if(current == null) {
                return null;
            }
        }

        if(current == first) {
            first = current.next;
        }
        else {
            current.previous.next = current.next;
        }

        if(current == last) {
            last = current.previous;
        }
        else {
            current.next.previous = current.previous;
        }

        return current;
    }

    public void displayForward() {
        System.out.print("List (first-->last): ");
        Link_D current = first;

        while(current != null) {
            current.displayLink_D();
            current = current.next;
        }

        System.out.println("");
    }

    public void displayBackward() {
        System.out.print("List (last-->first): ");
        Link_D current = last;

        while(current != null) {
            current.displayLink_D();
            current = current.previous;
        }

        System.out.println();
    }
}
