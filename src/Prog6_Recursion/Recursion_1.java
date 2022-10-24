package Prog6_Recursion;

/*
    Deyby Rodriguez
    1291202
    Data Structures
    CSCI 260 M01
*/

import java.util.Scanner;

public class Recursion_1 {
    public static void main(String[] args) {
        bunnyEarsTest();
        digitSumTest();
        rangedSumTest();
    }

    public static int bunnyEars(int n) {
        if(n == 0) {
            return 0;
        }

        if(n % 2 == 0) {
            return 3 + bunnyEars(n - 1);
        }

        return 2 + bunnyEars(n - 1);
    }

    public static int sumDigits(int number) {
        if(number == 0) {
            return 0;
        }

        return (number % 10) + sumDigits(number / 10);
    }

    public static int rangeSum(int from, int to) {
        if(from == to) {
            return to;
        }

        return from + rangeSum(from + 1, to);
    }

    public static void bunnyEarsTest() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number of bunnies to get the ear count: ");
        int bunnyCount = scan.nextInt();
        int bunnyEarCount = bunnyEars(bunnyCount);
        System.out.println("When the number of bunnies is " + bunnyCount + ", the ear count is " + bunnyEarCount);
        System.out.println();
    }

    public static void digitSumTest() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number to get the sum of its digits: ");
        int num = scan.nextInt();
        int digitSum = sumDigits(num);
        System.out.println("The sum of the digits of the number " + num + " is " + digitSum);
        System.out.println();
    }

    public static void rangedSumTest() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a range of numbers to be added: ");
        System.out.print("From: ");
        int from = scan.nextInt();
        System.out.print("To: ");
        int to = scan.nextInt();
        int rangedSum = rangeSum(from, to);
        System.out.println("The sum of the numbers between " + from + " and " + to + " is " + rangedSum);
        System.out.println();
    }
}
