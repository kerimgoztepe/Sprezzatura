package review_sessions.week12_arrayList;

import java.util.ArrayList;

public class ArrayListWriteRead {

	public static void main(String[] args) {
		
        //declare arraylist that can store Integer values. nums
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(10);
        nums.add(20);
        nums.add(21);
        nums.add(-7);

        //print the number of values in the arraylist. size() method
        System.out.println("number of values: " + nums.size() );

        //Print all values in single line using toString() method.
        System.out.println("All values: " + nums.toString());

        //print first number. at index 0 get(0)
        System.out.println(nums.get(0));

        //print number at index 2
        System.out.println(nums.get(2));

        int i = 4;
        //print number at index i
        System.out.println(nums.get(i));

        for(int n = 0; n < nums.size(); n++){
            System.out.println(nums.get(n));
        }

	}

}
