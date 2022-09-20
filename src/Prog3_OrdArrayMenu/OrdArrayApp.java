package Prog3_OrdArrayMenu;

/*
    Deyby Rodriguez
    1291202
    Data Structures
    CSCI 260 M01
*/

import java.util.Scanner;

public class OrdArrayApp {
    public static void main(String[] args) {
        OrdArray orderedArray = new OrdArray();
        handleUserInput(orderedArray);
    }

    static void handleUserInput(OrdArray arr) {
        handleUserInput(arr, 0);
    }

    static void handleUserInput(OrdArray arr, int choice) {
        Scanner inputHandler = new Scanner(System.in);
        int userChoice = choice;

        if(userChoice == 0) {
            displayMenu();
            System.out.print("Enter your choice 1-6: ");
            userChoice = inputHandler.nextInt();
        }

        switch (userChoice) {
            // 1. Fill Array
            case 1:
                System.out.print("Enter number of elements 1-10: ");
                int fillAmount = inputHandler.nextInt();
                arr.fill(fillAmount);
                handleUserInput(arr);
                break;

            // 2. Add Number
            case 2:
                arr.insert();
                handleUserInput(arr);
                break;

            // 3. Find the index of a number
            case 3:
                System.out.print("Enter number to find: ");
                int numToFind = inputHandler.nextInt();
                arr.find(numToFind, true);
                handleUserInput(arr);
                break;

            // 4. Remove number at index
            case 4:
                System.out.print("Enter index 0-9: ");
                int index = inputHandler.nextInt();
                if (index < 0 || index > 9) {
                    System.out.print("Please re-enter 0-9: ");
                    index = inputHandler.nextInt();
                }
                arr.removeNumberAtIndex(index);
                handleUserInput(arr);
                break;

            // 5. Remove number
            case 5:
                System.out.print("Enter number to remove: ");
                int numToRemove = inputHandler.nextInt();
                arr.removeNumber(numToRemove);
                handleUserInput(arr);
                break;

            // 6. Quit
            case 6:
                return;

            // Handles improper user input
            default:
                System.out.print("Please re-enter 1-6: ");
                int retryChoice = inputHandler.nextInt();
                handleUserInput(arr, retryChoice);
                break;
        }
    }

    static void displayMenu() {
        System.out.println("1. Fill array");
        System.out.println("2. Add a number");
        System.out.println("3. Find the index of a number");
        System.out.println("4. Remove number at index");
        System.out.println("5. Remove a number");
        System.out.println("6. Quit");
    }
}