package SearchAlgorithms;

public class SearchAlgorithms {
    public static void main(String[] args){

    }

    private static int linearSearch(int[] numbers, int key) {
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == key) {
                return i;
            }
        }

        return -1;
    }

    private static int binarySearch(int[] numbers, int key) {
        int low = 0;
        int mid = numbers.length / 2;
        int high = numbers.length - 1;

        while(high >= low) {
            mid = (low + high) / 2;

            if(numbers[mid] > key) {
                low = mid + 1;
            }
            else if(numbers[mid] < key) {
                high = mid - 1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }
}
