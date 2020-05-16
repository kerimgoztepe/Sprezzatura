package review_sessions.week4_variables_operators;

public class IncrementDecrementOperators {

	public static void main(String[] args) {
		
		int x = 2;
		
		
		//int y = ++x;
		//System.out.println(y);
		
		int y = x++;
		System.out.println(y);
		System.out.println(x);
		
		
		int a = 5;
		int b = a * 5 - a++;  //5 * 5 - 5
		
		System.out.println(a);
		System.out.println(b);
		
		//Task
		a = 5;
		b = a-- + ++a + ++a - a--;  // 5 + 5 + 6 - 6
		System.out.println(b);
		System.out.println(a);
		
		
		System.out.println(!true);
		System.out.println(!!false);

	}

}
