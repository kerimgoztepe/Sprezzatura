package HackerRankFiles;

import java.util.Scanner;
import java.util.Scanner;
public class EvenOddNumber {

        public static void main(String[] args) {

            //scan a number for test
            Scanner sc = new Scanner(System.in);
            //enter a number
            System.out.println("Enter a number!");
            int number = sc.nextInt();

            //test this number...even or odd
            if(number%2==0) {
                System.out.println("Number:" + number + " is even number");
            }else {
                System.out.println("Number:" + number + " is odd number");
            }

        }

    }

