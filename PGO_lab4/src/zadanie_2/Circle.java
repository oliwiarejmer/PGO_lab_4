package zadanie_2;


import java.awt.*;

public class Circle extends Shape {



    private double radius;
    Circle(){

    }

    Circle(double radius, Color color){
        super(color);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color=" + getColor() +
                '}';
    }

}
