package review_sessions.week8_classObject_scanner;

import java.util.Scanner;

public class WhatIsYourNameScanner {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.next();
        
        System.out.println("Nice to meet you, " + name);
        
        

	}

}
