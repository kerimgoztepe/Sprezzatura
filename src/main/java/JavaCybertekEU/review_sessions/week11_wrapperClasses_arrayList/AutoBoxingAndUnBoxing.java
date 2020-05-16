package review_sessions.week11_wrapperClasses_arrayList;

public class AutoBoxingAndUnBoxing {

	public static void main(String[] args) {
		
        //AUTOBOXING: CONVERT PRIMITIVE > WRAPPER CLASS OBJECT
        Integer n1 = 1000;
        int n = 345;
        Integer n2 = n;

        //UNBOXING: CONVERT WRAPPER CLASS OBJECT > PRIMITIVE
        Integer n3 = Integer.valueOf(4567);
        int num1 = n3;

        //print values
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("num1 = " + num1);

	}

}
