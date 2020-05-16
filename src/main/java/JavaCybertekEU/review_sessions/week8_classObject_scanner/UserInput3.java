package review_sessions.week8_classObject_scanner;

import java.util.Scanner;

public class UserInput3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number:");
		int num1=sc.nextInt();
		
		System.out.print("Enter second number:");
		int num2=sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("provide a string:");
		String str=sc.nextLine();
		//String str=sc.next();
		
		System.out.println("Output:" + num1 + ":" + num2 + ":" + str);
				

	}

}
