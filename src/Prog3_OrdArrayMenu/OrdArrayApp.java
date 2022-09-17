package Prog3_OrdArrayMenu;

import java.util.Arrays;

public class OrdArrayApp {
    public static void main(String[] args) {
        OrdArray test = new OrdArray();
        test.fillArray(1);

        String arrString = Arrays.toString(test.toArray());
        System.out.println(arrString);
    }
}
