package review_sessions.week11_wrapperClasses_arrayList;

public class CastingWithPrimitives {

	public static void main(String[] args) {
		
        //casting primitives
        int intValue = 123;
        double doubleValue = intValue;//implicit(automatic) casting

        System.out.println("intValue = " + intValue);
        System.out.println("doubleValue = " + doubleValue);

        Integer wrapperInt = Integer.valueOf(100);
        Double wrapperDouble = (double)wrapperInt; //unboxing>casting>autoboxing
        //Double wrapperDouble = wrapperInt;//ERROR: cannot cast among wrappers

        System.out.println("wrapperInt = " + wrapperInt);
        System.out.println("wrapperDouble = " + wrapperDouble);

	}

}
