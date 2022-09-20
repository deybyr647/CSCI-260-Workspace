package Algorithms;

public class RecursiveAlgorithms {
    public static void main(String[] args) {

    }

    private static int binarySearch(int[] numbers, int low, int high, int key) {
        if(low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if(numbers[mid] < key) {
            return binarySearch(numbers, mid + 1, high, key);
        }
        else if(numbers[mid] > key) {
            return binarySearch(numbers, low, mid - 1, key);
        }

        return mid;
    }

    private static int fibonacciNum(int termIndex) {
        if(termIndex == 0) {
            return 0;
        }
        else if(termIndex == 1) {
            return 1;
        }
        else {
            return fibonacciNum(termIndex - 1) + fibonacciNum(termIndex - 2);
        }
    }

    private static int factorial(int n) {
        if(n == 1) {
            return n;
        }
        else {
            return n * factorial(n - 1);
        }
    }

    private static int cumulativeSum(int n) {
        if(n == 0) {
            return 0;
        }
        else {
            return n + cumulativeSum(n - 1);
        }
    }

    private static int[] reverseArray(int[] nums, int startIndex, int endIndex) {
        if(startIndex >= endIndex) {
            return nums;
        } else {
            int temp = nums[startIndex];
            nums[startIndex] = nums[endIndex];
            nums[endIndex] = temp;
            return reverseArray(nums, startIndex + 1, endIndex - 1);
        }
    }
}
