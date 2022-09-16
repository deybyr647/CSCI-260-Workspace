package Prog2_HighArray;

/*
    Deyby Rodriguez
    Data Structures
    CSCI 260 M01
*/

class MkHighArrayTester {

    public static void main(String[] args) {
        int maxSize = 100;            // array size
        HighArray arr;                // reference to array
        arr = new HighArray(maxSize); // create the array

        arr.insert(77);               // insert 10 items
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();                // display items

        int searchKey = 35;           // search for item
        if(arr.find(searchKey) != -1)
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

        System.out.println("Deleting 00, 55, 15");
        arr.delete(00);               // delete 3 items
        arr.delete(55);
        arr.delete(15);//arr.delete(99);

        arr.display();                // display items again
        System.out.println("\ngetMax() returned "+arr.getMax());
        arr.removeMax();
        System.out.println("\nAfter calling removeMax()");
        arr.display();

        System.out.println("\nSorting using removeMax()");
        // Sort as stated in the requirements and display the sorted array
        HighArray sortedArr = descendingSort(arr.toArray());
        sortedArr.display();


    }  // end main()

    public static HighArray descendingSort(long[] numsArr) {
        HighArray sortedArr = new HighArray(numsArr.length);
        long temp;

        for(int i = 0; i < numsArr.length; i++){
            for(int j = i + 1; j < numsArr.length; j++){
                if(numsArr[i] < numsArr[j]){
                    temp = numsArr[i];
                    numsArr[i] = numsArr[j];
                    numsArr[j] = temp;
                }
            }

            sortedArr.insert(numsArr[i]);
        }

        return sortedArr;
    }
    
}  // end class HighArrayApp