package Prog1_Bag_ADT;

import java.util.Arrays;

/*
    Deyby Rodriguez
    1291202
    Data Structures
    CSCI 260 M01
*/

public class ArrayBag implements Bag {
    private final Object[] items;
    private int numItems;
    public static final int DEFAULT_MAX_SIZE = 50;

    public ArrayBag() {
        items = new Object[DEFAULT_MAX_SIZE];
        numItems = 0;
    }

    public ArrayBag(int maxSize) {
        if(maxSize <= 0){
            throw new IllegalArgumentException("maxSize must be >= 0");
        }

        items = new Object[maxSize];
        numItems = 0;
    }

    public int numItems() {
        return numItems;
    }

    public Object grab() {
        int randomIndex = (int) Math.floor(Math.random() * numItems);
        return items[randomIndex];
    }

    public Object[] toArray() {
        return Arrays.copyOf(items, numItems());
    }

    public boolean add(Object item) {
        if(item == null) {
            throw new IllegalArgumentException();
        }

        if(numItems == items.length) {
            System.out.println("Could not add because ArrayBag is full!");
            return false;
        }
        else {
            items[numItems] = item;
            numItems++;
            return true;
        }
    }

    public boolean remove(Object item) {
        boolean isFound = false;

        for(int i = 0; i < items.length; i++) {
            /* Did not re-sort items as shown in the output
               Since order/sorting doesn't matter in a Bag,
               As mentioned by the slides/notes
            */

            if(items[i] != null && items[i].equals(item)){
                isFound = true;
                items[i] = items[numItems - 1];
                items[numItems] = null;
                --numItems;
                break;
            }
        }

        if(!isFound){
            System.out.println(item + " not found!");
        }

        return isFound;
    }

    public boolean contains(Object item) {
        boolean isIncluded = false;

        for(int i = 0; i <= numItems(); i++) {
            if(items[i] != null && items[i].equals(item)) {
                isIncluded = true;
                break;
            }
        }

        return isIncluded;
    }

    public boolean containsAll(Bag other) {
        if(other == null || other.numItems() == 0) {
            return false;
        }

        Object[] otherBagArr = other.toArray();

        for (Object o : otherBagArr) {
            if (o != null && !contains(o)) {
                //System.out.println("Doesn't contain: " + o);
                return false;
            }
        }

        return true;
    }
}
