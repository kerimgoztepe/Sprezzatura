package assignment_EU2.assignment10_mix;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		
	    boolean exists = false;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter word:");
	    String word = scan.next();
	    
	    if (word.length() >= 4) {
            exists = word.startsWith("java") || word.startsWith("java", 1);
	    	System.out.println(exists);
		}else{
			System.out.println(exists);
		}

	}

}
