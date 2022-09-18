package Prog3_OrdArrayMenu;

import java.util.Arrays;
import java.util.Scanner;

public class OrdArrayApp {
    public static void main(String[] args) {
        OrdArray numArr = new OrdArray();
        handleUserInput(numArr);
    }

    static void handleUserInput(OrdArray arr) {
        Scanner inputHandler = new Scanner(System.in);

        displayMenu();
        System.out.print("Enter your choice 1-6: ");
        //System.out.println();
        int userChoice = inputHandler.nextInt();

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
                int num = inputHandler.nextInt();
                int indexOfNum = arr.find(num);

                if(indexOfNum == -1) {
                    System.out.println(num + " is not found");
                } else {
                    System.out.println(num + " found at index " + indexOfNum);
                }

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
                int number = inputHandler.nextInt();
                arr.removeNumber(number);
                break;
            }
            case 6 -> {
                return;
            }
            default -> {
                break;
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
