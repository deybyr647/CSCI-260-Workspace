package Prog2_HighArray;

/*
    Deyby Rodriguez
    Data Structures
    CSCI 260 M01
*/

import java.util.Arrays;

class HighArray {
    private final long[] a;                 // ref to array a
    private int nElems;               // number of data items

    public HighArray(int max) {         // constructor
        a = new long[max];                 // create the array
        nElems = 0;                        // no items yet
    }

    public int find(long searchKey) { // find specified value
        int indexOfKey = -1;

        for(int i = 0; i < a.length; i++) {
            if(a[i] == searchKey) {
                indexOfKey = i;
                break;
            }
        }

        return indexOfKey;
    }

    public void insert(long value) {    // put element into array
        a[nElems] = value;             // insert it
        nElems++;                      // increment size
    }

    public boolean delete(long value) {
        int indexOfValue = find(value);

        if(indexOfValue == -1) {
            return false;
        }

        for(int i = indexOfValue; i < nElems; i++) {
            a[i] = a[i + 1];
        }

        nElems--;
        return true;
    }

    public long getMax() {
        if(nElems == 0) {
            return -1;
        }

        long max = -1;

        for (long num : a) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public long removeMax() {
        long max = getMax();
        delete(max);

        return max;
    }

    public void display() {
        for(int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }

    public long[] toArray() {
        return Arrays.copyOf(a, nElems);
    }

}