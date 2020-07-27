package HackerRankFiles;

import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 10; i++) {
            int answer = input * i;
            System.out.println(input + " x " + i + " = " + answer);
        }
    }

}