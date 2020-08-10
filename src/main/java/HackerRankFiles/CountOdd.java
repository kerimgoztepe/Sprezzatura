package HackerRankFiles;

import java.util.*;

public class CountOdd {

    // This codes return the number of odd or even numbers
    // numbers sre in the range [L, R]
    public static int CountOdd(int L, int R)  {
        int N = (R - L) / 2;

        // if either R or L is odd
        if (R % 2 != 0 || L % 2 != 0)
            N++;

        return N;
    }

    // Driver code
    public static void main(String[] args) {
        int L = 3, R = 7;

        int odds = CountOdd(L, R);
        int evens = (R - L + 1) - odds;
        System.out.println("Count of odd numbers is " + odds);
        System.out.println("Count of even numbers is " + evens);
    }
}

