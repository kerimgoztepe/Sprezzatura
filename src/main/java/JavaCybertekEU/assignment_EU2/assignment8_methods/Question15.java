package assignment_EU2.assignment8_methods;

public class Question15 {

	public static void main(String[] args) {
		
		System.out.println(validateTask(true, 2, 1));
		System.out.println(validateTask(true, 3, 1));
		System.out.println(validateTask(false, 3, 2));
		

	}
	
	public static boolean validateTask(boolean notEmpty,int taskId,int currentId){

        return (notEmpty == true) && (taskId == currentId + 1);
	        
	  }

}
