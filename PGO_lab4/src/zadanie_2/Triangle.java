package zadanie_2;

import java.awt.*;

public class Triangle extends Shape {
    private int angleA;
    private int angleB;
    private int angleC;

    Triangle(){

    }
    Triangle(int angleA, int angleB, int angleC, Color color){
        super(color);
        this.angleA=angleA;
        this.angleB=angleB;
        this.angleC=angleC;

    }


    public int getAngleA() {
        return angleA;
    }

    public void setAngleA(int angleA) {
        this.angleA = angleA;
    }

    public int getAngleB() {
        return angleB;
    }

    public void setAngleB(int angleB) {
        this.angleB = angleB;
    }

    public int getAngleC() {
        return angleC;
    }

    public void setAngleC(int angleC) {
        this.angleC = angleC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "angleA=" + angleA +
                ", angleB=" + angleB +
                ", angleC=" + angleC +
                ", color=" + getColor() +
                '}';
    }
}
