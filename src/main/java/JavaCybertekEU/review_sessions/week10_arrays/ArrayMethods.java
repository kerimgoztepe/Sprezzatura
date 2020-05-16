package review_sessions.week10_arrays;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		
		//equals
		
        int[] nums1 = {4, 5, 2, 10};
        int[] nums2 = {4, 5, 2, 10};
        int[] nums3 = {10, 4, 5, 2};
        int[] nums4 = {4, 5, 2, 10, 90};
        int[] nums5 = {54, 23, 54, 123, 54};

        System.out.println("nums1 == nums2 > " + Arrays.equals(nums1, nums2) );
        System.out.println("nums1 == nums2 > " + (nums1 == nums2) );

        boolean bool1 = Arrays.equals(nums2, nums3);
        System.out.println("nums2 == nums3 > " + bool1);
        
        System.out.println("==========");
        
        Arrays.sort(nums2);
        Arrays.sort(nums3);

        System.out.println("After sorting: nums2 == nums3 > " + Arrays.equals(nums2,nums3));
        
        System.out.println("==========");
        
        String[] cars1 = {"Toyota","Honda", "Tesla","BMW", "Dodge"};
        String[] cars2 = {"Toyota","Honda", "Tesla","BMW", "Dodge"};
        String[] cars3 = {"toyota","honda", "tesla","bmw", "dodge"};
        String[] cars4 = {"Toyota","Honda", "Tesla"};
        
        System.out.println(Arrays.toString(cars1).toUpperCase());
        System.out.println(Arrays.toString(cars1));
        
        System.out.println("==========");
        
        String[] newCars = Arrays.copyOf(cars1, 3);
        System.out.println(Arrays.toString(newCars));
        
        System.out.println("=========="); 
        
        //sort method
        
        int[] nums = {44, 12, 5, 900, 1, -5};
        System.out.println("before sorting");
        System.out.println( Arrays.toString(nums) );

        Arrays.sort(nums); // sorting nums array values

        System.out.println("after sorting");
        System.out.println(Arrays.toString(nums));

        //declare companies array and assign 4 companies
        String[] companies = {"Cybertek", "Capital one", "FreddieMac","apple", "Google", "Verizon"};
        //sort companies array
        Arrays.sort(companies);

        System.out.println(Arrays.toString(companies));
        System.out.println(companies[0]);
        
        System.out.println("==========");
        
        
        

      
        
        
	}

}
