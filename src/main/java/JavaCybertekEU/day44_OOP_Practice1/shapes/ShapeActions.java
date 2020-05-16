package day44_OOP_Practice1.shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static day44_OOP_Practice1.shapes.ShapeManager.*;

public class ShapeActions {
    public static void main(String[] args) {
        Square mySquare = new Square();

        ShapeManager.drawSquare(mySquare);
        drawSquare(mySquare);

        String type = "square";
        drawSquare((Square) buildShape("square"));

        Object rand = new Random();
        System.out.println(((Random) rand).nextInt(5));

        System.out.println("+++++++++++++++++++++++++++++++");
        List<Shape> mylist = new ArrayList<>();
        mylist.add(new Shape());
        mylist.add(new Triangle());
        mylist.add(new Shape());
        mylist.add(new Square());

        drawShape(mylist);



    }
}
