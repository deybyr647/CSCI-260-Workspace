package Prog3_OrdArrayMenu;

import java.util.Scanner;

public class OrdArrayApp {
    public static void main(String[] args) {
        OrdArray numArr = new OrdArray();
        handleUserInput(numArr);
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
            case 1 -> {
                System.out.print("Enter number of elements 1-10: ");
                int fillAmount = inputHandler.nextInt();
                arr.fill(fillAmount);
                handleUserInput(arr);
            }

            case 2 -> {
                arr.insert();
                handleUserInput(arr);
            }

            case 3 -> {
                System.out.print("Enter number to find: ");
                int num = inputHandler.nextInt();
                arr.find(num, true);
                handleUserInput(arr);
            }

            case 4 -> {
                System.out.print("Enter index 0-9: ");
                int index = inputHandler.nextInt();

                if(index < 0 || index > 9) {
                    System.out.print("Please re-enter 0-9: ");
                    index = inputHandler.nextInt();
                }

                arr.removeNumberAtIndex(index);
                handleUserInput(arr);
            }

            case 5 -> {
                System.out.print("Enter number to remove: ");
                int number = inputHandler.nextInt();
                arr.removeNumber(number, false);
                handleUserInput(arr);
            }

            case 6 -> {
                return;
            }

            default -> {
                System.out.print("Please re-enter 1-6: ");
                int retryChoice = inputHandler.nextInt();
                handleUserInput(arr, retryChoice);
            }
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
