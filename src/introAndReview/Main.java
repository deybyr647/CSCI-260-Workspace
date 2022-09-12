package introAndReview;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*Rectangle rect1 = new Rectangle(25, 50);
        Rectangle rect2 = new Rectangle(50, 100);

        System.out.println(rect1.toString());
        System.out.println(Rectangle.getAllRectangles());*/

        ArrayList<Integer> nums = new ArrayList<Integer>(10);

        for(int i = 0; i < 11; i++){
            nums.add((Integer) i);
        }

        System.out.println(nums.size());
    }
}