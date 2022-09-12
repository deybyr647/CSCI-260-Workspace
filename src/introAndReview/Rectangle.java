package introAndReview;

import java.util.ArrayList;

public class Rectangle {
    private int width;
    private int height;
    public static ArrayList<Rectangle> rectangleList = new ArrayList<Rectangle>();

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
        rectangleList.add(this);
    }

    public static ArrayList<Rectangle> getAllRectangles() {
        return Rectangle.rectangleList;
    }

    public String toString() {
        return this.width + " x " + this.height;
    }

    public void setWidth(int w){
        this.width = w;
    }

    public void setHeight(int h){
        this.height = h;
    }
}
