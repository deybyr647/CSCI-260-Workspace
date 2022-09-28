package Prog4_1A_DecimalToBinary_WithStack;

/*
    Deyby Rodriguez
    1291202
    Data Structures
    CSCI 260 M01
*/

import java.util.Scanner;

public class Stack {
    private final int maxSize;        // size of stack array
    private final int[] stackArray;
    private int top;            // top of stack

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Decimal to Binary Converter");
        System.out.print("Enter a number to convert to 32-bit binary representation: ");
        int decimalNumber = scan.nextInt();

        toBinary(decimalNumber);
    }

    // toBinary() assumes that num is a 32-bit integer
    public static String toBinary(int num) {
        Stack numInBinary = new Stack(32);

        for(int i = 31; i >= 0; i--) {
            int k = num >> i;

            if((k & 1) > 0) {
                numInBinary.push(1);
            }
            else {
                numInBinary.push(0);
            }
        }

        return numInBinary.print(false);
    }

    public Stack(int s){         // constructor
        maxSize = s;             // set array size
        stackArray = new int[maxSize];  // create array
        top = -1;                // no items yet
    }

    public void push(int j){    // put item on top of stack
        stackArray[++top] = j;     // increment top, insert item
    }

    public int pop(){          // take item from top of stack
        return stackArray[top--];  // access item, decrement top
    }

    public int peek(){          // peek at top of stack
        return stackArray[top];
    }

    public boolean isEmpty(){    // true if stack is empty
        return (top == -1);
    }

    public boolean isFull(){   // true if stack is full
        return (top == maxSize-1);
    }

    public String print() {
        return print(true);
    }

    public String print(boolean useSeparator) {
        StringBuilder stackContentString = new StringBuilder();

        for(int i = 0; i <= top; i++) {
            stackContentString.append(stackArray[i]);

            if(useSeparator){
                stackContentString.append(" ");
            }
        }

        String out = stackContentString.toString();
        System.out.println(out);

        return out;
    }

    public Object removeSecond() {
        if(top >= 1) {
            int item = stackArray[top - 1];
            removeItem(top - 1);
            return item;
        }
        else {
            return null;
        }
    }

    private void removeItem(int index) {
        for(int i = index; i < top; i++) {
            stackArray[i] = stackArray[i + 1];
        }

        top--;
    }
}
