package zadanie_2;

import java.awt.*;

public class Test2 {

    public static void main(String [] args) {

        Shape [] shape = {
                new Circle(),
                new Rectangle(),
                new Triangle(),

                new Circle(12.6, new Color(12,12,12)),
                new Rectangle(12,21,new Color(99,99,99)),
                new Triangle(12,21,33,new Color(69,87,56))

        };

        for(Shape s : shape){
            System.out.println(s);
        }

    }
}
