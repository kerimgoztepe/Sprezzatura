package JavaCybertekEU.day46_collection_part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortingAList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("js");
		list.add("html");
		list.add("ruby");
		list.add("kotlin");
		list.add("c++");
		
		System.out.println("Before sorting");
		System.out.println(list.toString());
		
		System.out.println("After sorting");
		Collections.sort(list);
		System.out.println(list.toString());
		
		
		List<day46_collection_part1.Product> prodList = new ArrayList<>();
		prodList.add(new day46_collection_part1.Product("spoon", 13.99));
		prodList.add(new day46_collection_part1.Product("bag", 100.00));
		prodList.add(new day46_collection_part1.Product("shoes", 59.99));
		prodList.add(new day46_collection_part1.Product("computer", 2100.99));
		
		
		System.out.println("Before sorting");
		System.out.println(prodList.toString());
		
		//Collections.sort(prodList);
		
		System.out.println("After sorting");
		System.out.println(prodList.toString());
		
		day46_collection_part1.Product p1 = new day46_collection_part1.Product("spoon", 25.34);
		day46_collection_part1.Product p2 = new day46_collection_part1.Product("chair",7.99);
		//System.out.println(p1.compareTo(p2));
		


	}

}
