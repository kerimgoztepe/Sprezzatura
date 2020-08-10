package HackerRankFiles.collectioNs;
import java.util.*;
import java.util.Collections;


public class Iterator {
    public static void main(String[] args) {
        List<Integer> newList = new ArrayList<>();
        Collections.addAll(newList, 1, 2, 3, 4, 5);
        System.out.println(newList);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println(numbers.size());
        numbers.add(11);
        numbers.add(33);
        numbers.add(22);
        System.out.println("ArrayList: " + numbers);

    }



}
