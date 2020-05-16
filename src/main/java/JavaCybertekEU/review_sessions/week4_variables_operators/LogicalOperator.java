package review_sessions.week4_variables_operators;

public class LogicalOperator {

	public static void main(String[] args) {
		
		int score = 90;
		
		boolean res1 = (score >= 80) && (score < 90);  //F && ...
		System.out.println("res1:" + res1);
		
		int min = 50;
		boolean res2 = score < min / 2 - 10 || score > 90;
		
		// score < (min/2) - 10 || score > 90
		// score < ( (min/2) - 10 ) || score > 90
		// ( score < ( (min/2) - 10 ) || ( score > 90 )
		
		System.out.println("res2:" + res2);
		
		int i = -10;
		boolean res3 = (i > 0 && i++ < 10);
		System.out.println("i:" + i);
		
		boolean res4 = ( i > 0 || i++ <10);
		System.out.println("i:" + i);
		
		boolean x = true, z=true;
		int y = 20;
		x = (y!=10)||(z=false);
		System.out.println("x:"+x);
		System.out.println("z:"+z);
		
		

	}

}
