package day44_OOP_Practice1.shapes;

public class ShapeTest {
    public static void main(String[] args) {
        //create 4 shapes using polymorphism
        Shape square = new Square();
        Shape triangle = new Triangle();
        Shape diamond = new diamond();
        Object shapeObject = new Shape();

        square.draw();
        triangle.draw();
        diamond.draw();

        ((Square)square).squareMethod();


    }
}
