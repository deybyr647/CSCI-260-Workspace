package Prog3_OrdArrayMenu;

/*
    Deyby Rodriguez
    1291202
    Data Structures
    CSCI 260 M01
*/

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

        for(int i = 0; i < elementCount; i++) {
            int randomNumber = getRandomNumber();
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

        int newNumber = getRandomNumber();
        collection[elementCount] = newNumber;
        elementCount++;
        ascendingSort();
        display();

        return newNumber;
    }

    // 3. Find the index of a number
    public int find(int num, boolean isVerbose) {
        int index = -1;

        for(int i = 0; i < elementCount; i++) {
            if(collection[i] == num) {
                index = i;
                break;
            }
        }

        if(isVerbose) {
            if(index == -1) {
                System.out.println(num + " is not found");
            } else {
                System.out.println(num + " found at index " + index);
            }

            display();
        }

        return index;
    }

    // 4. Remove number at index
    public int removeNumberAtIndex(int index) {
        if(index < 0 || index >= elementCount) {
            display();
            return -1;
        }

        int itemAtIndex = collection[index];

        for(int i = index; i < elementCount - 1; i++) {
            collection[i] = collection[i + 1];
        }

        elementCount--;
        display();

        return itemAtIndex;
    }

    // 5. Remove number
    public int removeNumber(int num) {
        int indexOfNum = find(num, false);

        if(indexOfNum == -1) {
            System.out.println(num + " is not found");
            display();
            return -1;
        }

        return removeNumberAtIndex(indexOfNum);
    }

    // Helper Methods
    public int[] getCollection() {
        return collection;
    }

    public int getElementCount(){
        return elementCount;
    }

    private int getRandomNumber() {
        return (int) (Math.floor(Math.random() * (99)) + 1);
    }

    private void ascendingSort() {
        int temp;

        for(int i = 0; i < elementCount; i++) {
            for(int j = i + 1; j < elementCount; j++) {
                if(collection[i] > collection[j]) {
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

        for(int i = 0; i < elementCount; i++) {
            elementString.append(collection[i]);
            elementString.append(" ");
        }

        System.out.println(elementString);

        return elementString;
    }
}
