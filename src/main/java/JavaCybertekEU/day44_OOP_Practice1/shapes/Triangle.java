package day44_OOP_Practice1.shapes;

public class Triangle extends Shape{
    public Triangle() {
        type = "triangle";

    }
    @Override
    public void draw() {
        System.out.println("drawing a triangle");
    }
}
