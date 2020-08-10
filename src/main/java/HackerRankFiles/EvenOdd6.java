package HackerRankFiles;

import java.util.*;

public class EvenOdd6 {
    public static void main(String[] args) {
        //here we find odd numbers between given two numbers, l and r
        //we call oddNumbers method
        System.out.println("oddNumbers = "+oddNumbers(3,22));
    }

    //first we create a method that make a list here
    public static List<Integer> oddNumbers(int l, int r) {
        List<Integer> list1 = new ArrayList<>();
        if (l % 2 == 0) l++;
        for (; l <= r; l += 2) {
            list1.add(l);
        }
        return list1;

    }

}