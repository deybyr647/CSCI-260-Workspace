package Prog3_OrdArrayMenu;

import java.util.Arrays;

public class OrdArray {
    private final int[] collection;
    private int elementCount;

    public OrdArray() {
        collection = new int[10];
        elementCount = 0;
    }

    // 1. Fill Array
    public void fill(int amount) throws IllegalArgumentException {
        if(amount < 1 || amount > 10) {
            throw new IllegalArgumentException("amount must be between 1 & 10");
        }

        elementCount = amount;

        for(int i = 0; i < elementCount; i++){
            int randomNumber = getRandomNumber(1, 99);
            collection[i] = randomNumber;
        }

        if(elementCount > 1) {
            ascendingSort();
        }

        display();
    }

    // 2. Add Number
    public int insert() {
        if (elementCount == collection.length) {
            System.out.println("Couldn't add a new number because array is full!");
            return -1;
        }

        int newNumber = getRandomNumber(1, 99);
        collection[elementCount] = newNumber;
        elementCount++;
        display();

        return newNumber;
    }

    // 3. Find the index of a number
    public int find(int num) {
        int index = -1;

        for(int i = 0; i < elementCount; i++){
            if(collection[i] == num){
                index = i;
                break;
            }
        }

        return index;
    }

    // 4. Remove number at index
    public int removeNumberAtIndex(int index) {
        if(index < 0 || index >= elementCount){
            display();
            return -1;
        }

        int itemAtIndex = collection[index];
        System.out.println("Index: " + index);
        System.out.println("Item at index: " + itemAtIndex);

        for(int i = index; i < elementCount - 1; i++) {
            collection[i] = collection[i + 1];
        }

        elementCount--;
        display();

        return itemAtIndex;
    }

    // 5. Remove number
    public int removeNumber(int num) {
        int indexOfNum = find(num);

        if(indexOfNum == -1){
            return -1;
        }

        return removeNumberAtIndex(indexOfNum);
    }

    private int getRandomNumber(int min, int max) {
        return (int) (Math.floor(Math.random() * (max - min + 1)) + min);
    }

    private void ascendingSort() {
        int temp;

        for(int i = 0; i < elementCount; i++){
            for(int j = i + 1; j < elementCount; j++){
                if(collection[i] > collection[j]){
                    temp = collection[i];
                    collection[i] = collection[j];
                    collection[j] = temp;
                }
            }
        }
    }

    private StringBuilder display() {
        StringBuilder elementString = new StringBuilder();
        elementString.append("\n");

        for(int i = 0; i < elementCount; i++){
            elementString.append(collection[i]);
            elementString.append(" ");
        }

        System.out.println(elementString);

        return elementString;
    }

    public int[] toArray() {
        return Arrays.copyOf(collection, elementCount);
    }

    public int getElementCount(){
        return elementCount;
    }
}
