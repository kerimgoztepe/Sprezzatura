package review_sessions.week4_variables_operators;

public class Tasks {

	public static void main(String[] args) {
		
		int pies = 10, people=4;
		double piesPerson;
		
		
		piesPerson=pies/people;  //  int / int ( 10 / 4) = 2
		System.out.println(piesPerson);
		
		
		piesPerson = pies /(double)people; // double = int / double (10 / 4.0) = 2.5
		System.out.println(piesPerson);
		
		piesPerson = (double)pies / people; //double / int (10.0 / 4) = 2.5
		System.out.println(piesPerson);
		
		piesPerson = (double)(pies / people); //double(int/int)
		System.out.println(piesPerson);
		
		double result = (1/2)*2;
		System.out.println(result);
		
		

	}

}
