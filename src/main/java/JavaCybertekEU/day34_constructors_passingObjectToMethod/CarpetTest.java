package day34_constructors_passingObjectToMethod;

public class CarpetTest {

	public static void main(String[] args) {
		
		/*
		Floor f1 = new Floor(10, 12);
		Carpet c1 = new Carpet(8);
		
		Calculator cal = new Calculator(f1, c1); //new invokes constructor, which constrcutor?
		*/
		
		Calculator cal = new Calculator(new Floor(10,12), new Carpet(8));
		
		double cost = cal.getTotalCost();
		System.out.println(cost);

	}

}
