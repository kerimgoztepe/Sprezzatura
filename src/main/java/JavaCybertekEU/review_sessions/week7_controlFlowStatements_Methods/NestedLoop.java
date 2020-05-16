package review_sessions.week7_controlFlowStatements_Methods;

public class NestedLoop {

	public static void main(String[] args) {
		
		
	     for(int outer = 1; outer <= 5; outer++) {
	         System.out.println("Outer: " + outer);
	         for (int inner = 0; inner <= 9; inner++) {
	             System.out.print(inner + " ");
	         }
	         System.out.println();
	     }

	}

}
