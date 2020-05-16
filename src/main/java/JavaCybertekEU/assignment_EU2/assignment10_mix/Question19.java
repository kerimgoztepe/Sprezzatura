package assignment_EU2.assignment10_mix;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		
	    Scanner scan= new Scanner(System.in);
	    System.out.print("Enter word:");
	    String word = scan.next();
	    
	    int count = 0;
	    for (int i = 0; i < word.length() - 3; i++) {
	    	if (word.startsWith("java", i)) {
				count++;
			}
		}

		System.out.println(count);

	}

}
