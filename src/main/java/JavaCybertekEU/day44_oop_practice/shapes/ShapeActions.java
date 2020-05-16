package day44_oop_practice.shapes;

import static day44_oop_practice.shapes.ShapeManager.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShapeActions {

	public static void main(String[] args) {
		

		drawSquare((Square)buildShape("square"));
		
		Object rand = new Random();
		System.out.println(((Random) rand).nextInt(5));
		
		System.out.println("+++++++++");
		
		List<Shape> myList = new ArrayList<>();
		myList.add(new Shape());
		myList.add(new Triangle());
		myList.add(new Shape());
		myList.add(new Square());
		myList.add(new Triangle());

		drawShape(myList);
		
		
		
		

	}

}
