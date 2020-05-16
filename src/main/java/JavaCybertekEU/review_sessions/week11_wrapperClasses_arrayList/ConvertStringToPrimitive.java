package review_sessions.week11_wrapperClasses_arrayList;

public class ConvertStringToPrimitive {

	public static void main(String[] args) {
		
        //Boolean, Character, Byte, Short, Integer, Long, Float, Double.
        //Converting from String to primitive using parse method of Wrapper classes

        boolean b1 = Boolean.parseBoolean("true");
        //work around for String > char. Character class does not have parse method.
        char ch = "a".charAt(0);

        System.out.println("hello".toUpperCase());

        byte byteValue = Byte.parseByte("100");

        short shortValue = Short.parseShort("10000");

        int intValue = Integer.parseInt("346634");

        long longValue = Long.parseLong("3423453245324524");

        float floatValue = Float.parseFloat("34523.45");

        double doubleValue = Double.parseDouble("234.3");

        String strPrice = "234.5";
        double doublePrice = Double.parseDouble(strPrice);

        if(doublePrice > 155.0){
            System.out.println("OutOfBudgetsException");
        }else{
            System.out.println("Lets buy it");
        }

        System.out.println("b1 = " + b1);
        System.out.println("ch = " + ch);
        System.out.println("byteValue = " + byteValue);
        System.out.println("shortValue = " + shortValue);
        System.out.println("intValue = " + intValue);
        System.out.println("longValue = " + longValue);
        System.out.println("floatValue = " + floatValue);
        System.out.println("doubleValue = " + doubleValue);
        System.out.println("strPrice = " + strPrice);
        System.out.println("doublePrice = " + doublePrice);

	}

}
