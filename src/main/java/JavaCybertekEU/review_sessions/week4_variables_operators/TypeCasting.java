package review_sessions.week4_variables_operators;

public class TypeCasting {

	public static void main(String[] args) {
		
		int i = 100;
		long l = i; //implicit casting
		float f = l; //implicit casting
		
		System.out.println("Int value " + i);
		System.out.println("Long value " + l);
		System.out.println("Float value " + f);
		
		
		System.out.println("--------------------");
		
		double d = 100.04;
		long l2 = (long) d; //explicit casting
		int i2 = (int) l; //explicit casting
		
		System.out.println("Double value " + d);
		System.out.println("Long value " + l2);
		System.out.println("Int value " + i2);

	}

}
