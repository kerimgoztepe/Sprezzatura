package HackerRankFiles;

import java.util.Scanner;

public class StInOut2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        System.out.println("enter int = "+i);

        double d = scan.nextDouble();
        System.out.println("enter double = "+d);

        scan.nextLine();
        String s = scan.nextLine();
        System.out.println("enter string = "+s);




        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
    }

