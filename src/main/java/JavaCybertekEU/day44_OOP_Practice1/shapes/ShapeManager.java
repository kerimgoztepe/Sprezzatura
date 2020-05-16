package day44_OOP_Practice1.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeManager {


    public static Shape buildShape(String type) {

        Shape shape = null;
        switch (type.toLowerCase()) {
            case "shape":
                shape = new Shape();
                break;
            case "triangle":
                shape = new Triangle();
                break;
            case "square":
                shape = new Square();
                break;
            case "diamond":
                shape = new Square();
                break;
        }
        return shape;

        }

    public static void drawSquare(Square squareObject ) {
       System.out.println("DRAWING a square");
       squareObject.draw();

    }
    public static void drawShape(Shape shape) {
    System.out.println("drawing a shape");
    }

    public static void drawShape(List<Shape> shapeList) {
        for(Shape each : shapeList) {
            each.draw();
        }
    }
    }

