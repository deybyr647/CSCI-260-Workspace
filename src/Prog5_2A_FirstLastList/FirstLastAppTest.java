package Prog5_2A_FirstLastList;

class FirstLastAppTest
{
    public static void main(String[] args)
    {
        FirstLastList lst1 = new FirstLastList();                // Start a new FirstLastList called lst1
        lst1.insertLast(1);                                      // Add links with data to the last position
        lst1.insertLast(3);
        lst1.insertLast(7);
        lst1.insertLast(4);
        System.out.print("\nlst1: ");                               // print the description for the list
        lst1.displayList();                                          // print the contents of the list
        FirstLastList lst2 = new FirstLastList();                // Start a new FirstLastList called lst2
        lst2.insertLast(2);                                      // Add links with data to the last position
        lst2.insertLast(4);
        lst2.insertLast(5);
        lst2.insertLast(8);
        lst2.insertLast(6);
        System.out.print("\nlst2: ");                           // print the description for the list
        lst2.displayList();                                      // print the contents of the list
        System.out.print("\nlst1.join(lst2): ");                // print the action to take place: lst1.join(lst2)
        lst1.join(lst2);                                         // call the join method for lst1 to add lst2
        System.out.print("\nlst1: ");                           // print the description for the list
        lst1.displayList();                                      // print the contents of the list lst1; post join()
        System.out.print("lst2: ");                           // print the description for the list
        lst2.displayList();                                      // print the contents of the list lst2; post join()
        System.out.print("\nlst1.swap(): ");                    // print the action to take place: lst1.swap()
        lst1.swap();                                             // call the swap method for lst1
        System.out.print("\nlst1: ");                           // print the description for the list
        lst1.displayList();                                      // print the contents of the list lst1; post swap()
    }  // end main()
}  // end class