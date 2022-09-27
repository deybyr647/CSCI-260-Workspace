package Prog4_SortedArrays;

/*
    Deyby Rodriguez
    1291202
    Data Structures
    CSCI 260 M01
*/

import java.util.Scanner;

public class SortedNumArrays {
    private final int[] arrayA;
    private final int[] arrayB;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a, b: ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        SortedNumArrays arrPair = new SortedNumArrays(a, b);
        arrPair.display();

    }

    public SortedNumArrays(int sizeA, int sizeB) {
        arrayA = new int[sizeA];
        arrayB = new int[sizeB];
        fillArrays();
    }

    public void display() {
        String aToStr = arrToString(arrayA);
        String bToStr = arrToString(arrayB);

        System.out.println("Input:");
        System.out.println(aToStr);
        System.out.println(bToStr);
        System.out.println();

        sortArrays();
        aToStr = arrToString(arrayA);
        bToStr = arrToString(arrayB);

        System.out.println("Output:");
        System.out.println(aToStr);
        System.out.println(bToStr);
        System.out.println();

        String mergedArrStr = arrToString(mergeArrays());
        System.out.println("Merged:");
        System.out.println(mergedArrStr);

    }

    private void fillArrays() {
        for(int i = 0; i < arrayA.length; i++) {
            arrayA[i] = getRandomNumber(0, 99);
        }

        for(int j = 0; j < arrayB.length; j++) {
            arrayB[j] = getRandomNumber(0, 99);
        }
    }

    private void sortArrays() {
        int temp;

        for(int i = 0; i < arrayA.length; i++) {
            for(int j = 0; j < arrayB.length; j++) {
                if(arrayA[i] > arrayB[j]) {
                    temp = arrayA[i];
                    arrayA[i] = arrayB[j];
                    arrayB[j] = temp;
                }
            }
        }

        for(int k = 0; k < arrayB.length; k++) {
            for(int l = k + 1; l < arrayB.length; l++) {
                if(arrayB[k] > arrayB[l]) {
                    temp = arrayB[k];
                    arrayB[k] = arrayB[l];
                    arrayB[l] = temp;
                }
            }
        }
    }

    private int[] mergeArrays() {
        final int size = arrayA.length + arrayB.length;
        int[] mergedArray = new int [size];
        int currentIndex = 0;

        for (int k : arrayA) {
            mergedArray[currentIndex] = k;
            currentIndex++;
        }

        for (int i : arrayB) {
            mergedArray[currentIndex] = i;
            currentIndex++;
        }

        return mergedArray;
    }

    private int getRandomNumber(int min, int max) {
        return (int) (Math.floor(Math.random() * (max - min + 1)) + min);
    }

    private String arrToString(int[] arr) {
        StringBuilder arrString = new StringBuilder();

        for (int j : arr) {
            arrString.append(j);
            arrString.append(" ");
        }

        return arrString.toString();
    }
}
