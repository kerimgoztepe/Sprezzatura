package review_sessions.week4_variables_operators;

public class OrdinaryMath {

	public static void main(String[] args) {
		
		double rate = 0.5;
		int delta = 200;
		
		double result = rate * rate + delta;
		result = (rate * rate) + delta;
		
		
		System.out.println("----------------");
		
		int salary = 50000;
		int bonus = 5000;
		
		double result2 = 2 * (salary + bonus);
		
		System.out.println("----------------");
		
		int time = 50;
		int mass = 100;
		
		double result3 = 1 / (time + 3 * mass);
		result3 = 1 / (time + (3 * mass));
		
		System.out.println("----------------");
		
		int a = 20;
		int t = 5;
		int v = 4;
		
		double result4 = (a - 7) / (t + ( 9 * v ) );
		
		

	}

}
