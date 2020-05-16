package day44_OOP_Practice1.shapes;

public class Square extends Shape {
    public Square() {
        type="square";

    }
    @Override
    public void draw() {
        System.out.println("drawing a square");
    }
    public void squareMethod() {
        System.out.println("draw a square now");
    }
}
