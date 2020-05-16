 package review_sessions.week12_arrayList;

import java.util.*;

public class MethodsReturnArrayList {
	
    public static void main(String[] args) {
    	
        //call getMonths() and print out returned list
        System.out.println( getMonths() );
        
        //call getMonths() and assign returned list into another list then print
        List<String> allMonthsInYear = getMonths();
        System.out.println("allMonthsInYear = " + allMonthsInYear);

        for(String eachMonth : allMonthsInYear){
            System.out.println("eachMonth = " + eachMonth);
        }
        getMonths().set(0, "java");
        System.out.println( getMonths().get(0));

        System.out.println(getIntList(10));
        System.out.println(getIntList(52));

        for (int i = 1; i < 10; i++) {
            System.out.println(getIntList(i));
        }
      
        System.out.println(getRandomIntList(5));
    }

    public static List<Integer> getIntList(int size){
        List<Integer> numbers = new ArrayList<>();
        for(int n = 1; n <= size; n++){
            numbers.add(n);
        }
        return numbers;
    }
   //getRandomIntList(3) => List<Integer> with random 3 numbers
    public static List<Integer> getRandomIntList(int size){
        Random r = new Random();
        List<Integer> numbers = new ArrayList<>();
        for(int n = 1; n <= size; n++){
            numbers.add(r.nextInt(101));
        }
        return numbers;
    }

    /*
    Method: getMonths()
    Params:  none
    Return: List<String>
    Returns list with all month names.
     */
    public static List<String> getMonths(){
        List<String> allMonth = new ArrayList<>();
        allMonth.add("January");allMonth.add("February");allMonth.add("March");
        allMonth.add("April");allMonth.add("May");allMonth.add("June");
        allMonth.add("July");allMonth.add("August");allMonth.add("September");
        allMonth.add("October");allMonth.add("November");allMonth.add("December");

        return allMonth;
    }
    
    public static ArrayList<Integer> abc(ArrayList<Integer> list){
    	
    	return list;
    }

}
