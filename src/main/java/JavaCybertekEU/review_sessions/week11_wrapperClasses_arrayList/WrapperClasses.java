package review_sessions.week11_wrapperClasses_arrayList;

public class WrapperClasses {

	public static void main(String[] args) {
		
        //DECLARING AND CREATING WRAPPER CLASS OBJECTS:
        //Boolean, Character, Byte, Short, Integer, Long, Float, Double.
        Boolean b1 = new Boolean(true);
        Boolean b2 = Boolean.valueOf(false); //java 12 preferred
        Boolean b3 = Boolean.valueOf("true");

        Character c1 = new Character('a');
        Character c2 = Character.valueOf('b');

        Byte by1 = new Byte((byte)10);
        Byte by2 = Byte.valueOf((byte)25);
        Byte by3 = Byte.valueOf("22");

        Short sh1 = new Short((short)100);
        Short sh2 = Short.valueOf((short)200);
        Short sh3 = Short.valueOf("300");

        Integer i1 = new Integer(1000);
        Integer i2 = Integer.valueOf(2000);
        Integer i3 = Integer.valueOf("3000");

        Long l1 = new Long(4000);
        Long l2 = Long.valueOf(5000345345345345345L);
        Long l3 = Long.valueOf("6000");

        Float f1 = new Float(23.5F);
        Float f2 = Float.valueOf(34.5F);
        Float f3 = Float.valueOf("34.5");

        Double d1 = new Double(1000.2);
        Double d2 = Double.valueOf(4567.3);
        Double d3 = Double.valueOf("34566.3");
		

	}

}
