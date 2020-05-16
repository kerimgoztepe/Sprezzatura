package review_sessions.week4_variables_operators;

public class MixedIntegerOperations {

	public static void main(String[] args) {
	
		
		
		byte b = 32;
		char c = 'z';  //122
		short s = 256;
		int i = 10_000;
		float f = 3.5F;
		double d = 0.5;
		
		double v = (d*i) + (f * -b) - (c/s); //5000  - 112 - 0
		
		System.out.println(v);
		
		
		
		

	}

}
