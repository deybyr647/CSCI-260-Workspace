package Algorithms;

import java.util.Arrays;

public class SortingAlgorithms {
    public static void main(String[] args) {
        int[] a = {58, 59, 60, 57, 27, 66, 90};
        insertionSort(a);
    }

    private static int[] selectionSort(int numbers[]) {
        int temp;

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }

            System.out.println(Arrays.toString(numbers));
        }

        return numbers;
    }

    private static void insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int j = i;
            while (j > 0 && numbers[j] < numbers[j - 1]) {
                // Swap numbers[j] and numbers [j - 1]
                int temp = numbers[j];
                numbers[j] = numbers[j - 1];
                numbers[j - 1] = temp;
                j--;

                System.out.println(i);
            }
        }
    }
}
