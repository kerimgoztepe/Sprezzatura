package JavaCybertekEU.assignment_EU2.assignment14_krm.Question08;

public class ValueTest {

	public static void main(String[] args) {
		
		Value v = new Value (10);
		
		System.out.println(v.getVal());
		
		System.out.println(v.wasModified());
		
		v.setVal(100);
		
		System.out.println(v.wasModified());
		
		System.out.println(v.getVal());

	}

}
