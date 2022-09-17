package Prog3_OrdArrayMenu;

import java.util.Arrays;

public class OrdArrayApp {
    public static void main(String[] args) {
        OrdArray test = new OrdArray();
        test.fill(10);

        String arrString = Arrays.toString(test.toArray());
        System.out.println(arrString);

        test.removeNumberAtIndex(9);
        arrString = Arrays.toString(test.toArray());
        System.out.println(arrString);
    }
}
