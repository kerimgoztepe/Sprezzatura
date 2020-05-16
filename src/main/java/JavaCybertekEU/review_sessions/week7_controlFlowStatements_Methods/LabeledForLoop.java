package review_sessions.week7_controlFlowStatements_Methods;

public class LabeledForLoop {

	public static void main(String[] args) {
		
	     first:
	         for (int i = 0; i < 3; i++) {
	            for (int j = 0; j< 3; j++){
	               if(i == 1){
	                  continue first;
	               }      
	               System.out.print(" [i = " + i + ", j = " + j + "] ");
	            }
	         }
	     
	         System.out.println();

	      second:
	         for (int i = 0; i < 3; i++) {
	            for (int j = 0; j< 3; j++){
	               if(i == 1){
	                  break second;
	               }
	 
	               System.out.print(" [i = " + i + ", j = " + j + "] ");
	            }
	         }

	}

}
