package HackerRankFiles;

import java.util.List;
import java.util.*;

public class EvenOdd3 {

    public static void main(String[] args) {

        System.out.println(getOdd(2,33));

    }

    public static List<Integer> getOdd(int l, int r) {
        List<Integer> odd = new ArrayList<Integer>();
        if (l % 2 == 0)
            l++;
        while(l <= r) {
            odd.add(l);
            l += 2;
        }
        return odd;
    }
}
