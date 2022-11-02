package Prog6_2_Recursion;

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


    /* Recursive Methods */

    public int getLen(Link l) {
        if(l == null) {
            return 0;
        }

        return 1 + getLen(l.next);
    }

    public void reversePrint(Link l) {
        if(l == null) {
            return;
        }

        reversePrint(l.next);
        l.displayLink();
    }

    public void forwardPrint(Link l) {
        if(l == null) {
            return;
        }

        l.displayLink();
        forwardPrint(l.next);
    }

    public Link linearSearch(int n, Link l) {
        if(l == null) {
            System.out.println(n + " was not found");
            return null;
        }

        if(l.iData == n) {
            System.out.println(n + " was found");
            return l;
        }

        return linearSearch(n, l.next);
    }

    public Link removeLink(int n, Link l) {
        if (l != null)
            if (l.iData == n)
                l = l.next;
            else
                l.next = removeLink(n, l.next);

        return l;
    }

    public Link removeAllLinks(int n, Link l) {
        if (l != null)
            if (l.iData == n)
                l = removeAllLinks(n, l.next);
            else
                l.next = removeAllLinks(n, l.next);

        return l;
    }

    /* Overloads */

    public int recGetLength() {
        return getLen(first);
    }

    public void recReversePrint() {
        System.out.println("List (last --> first): ");
        reversePrint(first);
    }

    public Link recSearchFor(int n) {
        return linearSearch(n, first);
    }

    public void recRemoveFirst(int n) {
        removeLink(n, first);
    }

    public void recRemoveAll(int n) {
        removeAllLinks(n, first);
    }

    public void recPrint() {
        System.out.print("List (first --> last): ");
        forwardPrint(first);
    }
}
