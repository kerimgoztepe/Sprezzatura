package review_sessions.week12_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10, 40, 12, 5, 7));
        System.out.println("nums = " + nums);
       // nums.remove(0);
       // nums.add(2);
        System.out.println("nums = " + nums);

        List<Integer> nums2 = new ArrayList(Arrays.asList(10, 40, 12, 5, 7));
        System.out.println("nums2 = " + nums2);
        nums2.add(34);
        nums2.add(55);
        System.out.println("nums2 = " + nums2);

        nums2.remove(0);
        System.out.println("nums2 = " + nums2);
        
	}
	
	

}
