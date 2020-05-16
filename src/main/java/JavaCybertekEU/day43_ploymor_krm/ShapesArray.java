package day43_ploymor_krm;

public class ShapesArray {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];  //holding tree objects

        shapes[0] = new Shape();
        shapes[1] = new Triangle();
        shapes[2] = new Circle();

        for (Shape sh : shapes) {
            sh.draw();
            System.out.println(sh.getClass().getName());
        }

    }

}