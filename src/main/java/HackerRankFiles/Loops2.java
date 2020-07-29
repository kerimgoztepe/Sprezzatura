package HackerRankFiles;

import java.util.*;
import java.io.*;

public class Loops2 {

    public static void main(String []argh){
        //scan a new number
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //we use for loop here
        for(int i=0;i<t;i++){
            //user enter int a,b and n here
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int c = a;
            for(int j=0;j<n;j++){
                c += Math.pow(2, j)*b;
                System.out.printf("%s ",c);
            }
            System.out.println();
        }
        sc.close();
    }
}
