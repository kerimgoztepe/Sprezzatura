package JavaCybertekEU.day8_controlFlowStatements_Part2;

import java.util.Scanner;

public class task30_EvenOddNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number!");
		int number = sc.nextInt();

		if(number%2==0) {
			System.out.println("Number:" + number + " is even number");
		}else {
			System.out.println("Number:" + number + " is odd number");
		}

	}

}
