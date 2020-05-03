package zadanie_2;

import java.awt.*;

public class Rectangle extends Shape {

    private double width;
    private double length;

    Rectangle(){

    }
    Rectangle(double width, double length, Color color){
        super(color);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color=" + getColor() +
                '}';
    }
}
