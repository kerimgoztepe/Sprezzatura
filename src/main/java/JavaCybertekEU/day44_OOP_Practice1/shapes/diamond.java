package day44_OOP_Practice1.shapes;

public class diamond extends Shape{
    public diamond() {
        type = "diamond";
    }
    @Override
    public void draw() {
        System.out.println("shape is diamond");
    }

}
