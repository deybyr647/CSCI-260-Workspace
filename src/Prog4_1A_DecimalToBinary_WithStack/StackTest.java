package Prog4_1A_DecimalToBinary_WithStack;

public class StackTest {
    public static void main(String[] args) {
        Stack theStack = new Stack(10);  // make new stack
        theStack.push(20);               // push items onto stack
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);
        theStack.print();

        System.out.println("Second Item: " + theStack.removeSecond());
        System.out.println("After removeSecond()");
        theStack.print();
    }
}
