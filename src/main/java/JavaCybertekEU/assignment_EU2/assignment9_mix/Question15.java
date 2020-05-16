package assignment_EU2.assignment9_mix;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter your word:");
	    int countOfCats = 0;
	    int countOfDogs = 0;
	    String word = scan.next();
	    
	    for (int i = 0; i < word.length() - 2; i++) {
				if (word.startsWith("cat", i)) {
					countOfCats++;
				} else if (word.startsWith("dog", i)) {
					countOfDogs++;
				}
		}

		if (countOfCats == countOfDogs) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
