package Prog3_OrdArrayMenu;

import java.util.Arrays;

public class OrdArray {
    private final int[] collection;
    private int elementCount;

    public OrdArray() {
        collection = new int[10];
        elementCount = 0;
    }

    public void fillArray(int amount) throws IllegalArgumentException {
        if(amount < 1 || amount > 10) {
            throw new IllegalArgumentException("amount must be between 1 & 10");
        }

        elementCount = amount;

        for(int i = 0; i < elementCount; i++){
            int randomNumber = getRandomNumber(1, 99);
            collection[i] = randomNumber;
        }
    }

    private int getRandomNumber(int min, int max) {
        return (int) (Math.floor(Math.random() * (max - min + 1)) + min);
    }

    private void sort() {

    }

    public int[] toArray() {
        return Arrays.copyOf(collection, elementCount);
    }
}
